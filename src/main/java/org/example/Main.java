package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(YandexTranslate.translate("ru", args[0]));
    }
}

// https://www.programmersought.com/article/5656987446/