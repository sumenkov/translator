package org.example.service;

import org.example.model.InData;
import org.example.model.Languages;
import org.example.repository.GoogleTranslate;

public class RunTranslate {

    private Languages langModel;
    private final String[] targetLang = {"en", "ru", "id", "es", "fr", "de", "it", "pl", "nl", "ms", "ca", "da", "sw",
            "nb", "pt", "ro", "fi", "sv", "tl", "tr", "vi", "el", "ar", "he", "fa", "ur", "hi", "bn", "si", "my", "th",
            "zh", "ko", "ja", "am", "hy", "km", "sq", "uk", "uz", "kk", "ky", "tg", "az", "ka", "et", "lv", "lt", "cs",
            "sk", "hu", "bg", "hr", "sl", "is", "mn", "lo"};
    GoogleTranslate gt = GoogleTranslate.getInstance();

    public Languages runTranslate(InData inDataModel, String keyName) {
        langModel = new Languages();

        try {
            switch (keyName) {
                case "name" -> translateName(inDataModel.getName(), inDataModel.getSourceLang());
                case "title" -> translateName(inDataModel.getTitle(), inDataModel.getSourceLang());
                case "description" -> translateName(inDataModel.getDescription(), inDataModel.getSourceLang());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return langModel;
    }

    private void translateName(String text, String sourceLang) throws Exception {
        for (String lang: targetLang) {
//            System.out.println(text + " " + sourceLang + " " + lang);
            switch (lang) {
                case "en" -> this.langModel.setEn(gt.translateText(text, sourceLang, lang));
                case "ru" -> this.langModel.setRu(gt.translateText(text, sourceLang, lang));
                case "id" -> this.langModel.setId(gt.translateText(text, sourceLang, lang));
                case "es" -> this.langModel.setEs(gt.translateText(text, sourceLang, lang));
                case "fr" -> this.langModel.setFr(gt.translateText(text, sourceLang, lang));
                case "de" -> this.langModel.setDe(gt.translateText(text, sourceLang, lang));
                case "it" -> this.langModel.setIt(gt.translateText(text, sourceLang, lang));
                case "pl" -> this.langModel.setPl(gt.translateText(text, sourceLang, lang));
                case "nl" -> this.langModel.setNl(gt.translateText(text, sourceLang, lang));
                case "ms" -> this.langModel.setMs(gt.translateText(text, sourceLang, lang));
                case "ca" -> this.langModel.setCa(gt.translateText(text, sourceLang, lang));
                case "da" -> this.langModel.setDa(gt.translateText(text, sourceLang, lang));
                case "sw" -> this.langModel.setSw(gt.translateText(text, sourceLang, lang));
                case "nb" -> this.langModel.setNb(gt.translateText(text, sourceLang, lang));
                case "pt" -> this.langModel.setPt(gt.translateText(text, sourceLang, lang));
                case "ro" -> this.langModel.setRo(gt.translateText(text, sourceLang, lang));
                case "fi" -> this.langModel.setFi(gt.translateText(text, sourceLang, lang));
                case "sv" -> this.langModel.setSv(gt.translateText(text, sourceLang, lang));
                case "tl" -> this.langModel.setTl(gt.translateText(text, sourceLang, lang));
                case "tr" -> this.langModel.setTr(gt.translateText(text, sourceLang, lang));
                case "vi" -> this.langModel.setVi(gt.translateText(text, sourceLang, lang));
                case "el" -> this.langModel.setEl(gt.translateText(text, sourceLang, lang));
                case "ar" -> this.langModel.setAr(gt.translateText(text, sourceLang, lang));
                case "he" -> this.langModel.setHe(gt.translateText(text, sourceLang, lang));
                case "fa" -> this.langModel.setFa(gt.translateText(text, sourceLang, lang));
                case "ur" -> this.langModel.setUr(gt.translateText(text, sourceLang, lang));
                case "hi" -> this.langModel.setHi(gt.translateText(text, sourceLang, lang));
                case "bn" -> this.langModel.setBn(gt.translateText(text, sourceLang, lang));
                case "si" -> this.langModel.setSi(gt.translateText(text, sourceLang, lang));
                case "my" -> this.langModel.setMy(gt.translateText(text, sourceLang, lang));
                case "th" -> this.langModel.setTh(gt.translateText(text, sourceLang, lang));
                case "zh" -> this.langModel.setZh(gt.translateText(text, sourceLang, "zh_cn"));
                case "ko" -> this.langModel.setKo(gt.translateText(text, sourceLang, lang));
                case "ja" -> this.langModel.setJa(gt.translateText(text, sourceLang, lang));
                case "am" -> this.langModel.setAm(gt.translateText(text, sourceLang, lang));
                case "hy" -> this.langModel.setHy(gt.translateText(text, sourceLang, lang));
                case "km" -> this.langModel.setKm(gt.translateText(text, sourceLang, lang));
                case "sq" -> this.langModel.setSq(gt.translateText(text, sourceLang, lang));
                case "uk" -> this.langModel.setUk(gt.translateText(text, sourceLang, lang));
                case "uz" -> this.langModel.setUz(gt.translateText(text, sourceLang, lang));
                case "kk" -> this.langModel.setKk(gt.translateText(text, sourceLang, lang));
                case "ky" -> this.langModel.setKy(gt.translateText(text, sourceLang, lang));
                case "tg" -> this.langModel.setTg(gt.translateText(text, sourceLang, lang));
                case "az" -> this.langModel.setAz(gt.translateText(text, sourceLang, lang));
                case "ka" -> this.langModel.setKa(gt.translateText(text, sourceLang, lang));
                case "et" -> this.langModel.setEt(gt.translateText(text, sourceLang, lang));
                case "lv" -> this.langModel.setLv(gt.translateText(text, sourceLang, lang));
                case "lt" -> this.langModel.setLt(gt.translateText(text, sourceLang, lang));
                case "cs" -> this.langModel.setCs(gt.translateText(text, sourceLang, lang));
                case "sk" -> this.langModel.setSk(gt.translateText(text, sourceLang, lang));
                case "hu" -> this.langModel.setHu(gt.translateText(text, sourceLang, lang));
                case "bg" -> this.langModel.setBg(gt.translateText(text, sourceLang, lang));
                case "hr" -> this.langModel.setHr(gt.translateText(text, sourceLang, lang));
                case "sl" -> this.langModel.setSl(gt.translateText(text, sourceLang, lang));
                case "is" -> this.langModel.setIs(gt.translateText(text, sourceLang, lang));
                case "mn" -> this.langModel.setMn(gt.translateText(text, sourceLang, lang));
                case "lo" -> this.langModel.setLo(gt.translateText(text, sourceLang, lang));
            }
        }
    }
}
