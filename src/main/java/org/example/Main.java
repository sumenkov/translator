package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import org.example.model.InData;
import org.example.model.OutData;
import org.example.service.RunTranslate;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        InData inDataModel;
        OutData outDataModel = new OutData();
        RunTranslate runTranslate = new RunTranslate();

        try {
            System.out.println("Читаем файл inData.json");
            JSONReader reader = new JSONReader(new FileReader("inData.json"));
            inDataModel = reader.readObject(InData.class);
            reader.close();

            System.out.println("Переводим текст name");
            outDataModel.setName(runTranslate.runTranslate(inDataModel, "name"));

            System.out.println("Переводим текст title");
            outDataModel.setTitle(runTranslate.runTranslate(inDataModel, "title"));

            System.out.println("Переводим текст description");
            outDataModel.setDescription(runTranslate.runTranslate(inDataModel, "description"));

            System.out.println("Сохраняем файл outData.json");
            String json = JSON.toJSONString(outDataModel, true);
            Files.write(Paths.get("outData.json"), json.getBytes());

            System.out.println("Закончили.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
