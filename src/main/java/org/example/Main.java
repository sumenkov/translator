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
            JSONReader reader = new JSONReader(new FileReader("inData.json"));
            inDataModel = reader.readObject(InData.class);
            reader.close();

            outDataModel.setName(runTranslate.runTranslate(inDataModel, "name"));
            outDataModel.setTitle(runTranslate.runTranslate(inDataModel, "title"));
            outDataModel.setDescription(runTranslate.runTranslate(inDataModel, "description"));

            String json = JSON.toJSONString(outDataModel, true);
            Files.write(Paths.get("outData.json"), json.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
