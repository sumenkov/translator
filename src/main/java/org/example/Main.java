package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(YandexTranslate.translate("ru", args[0]));
        System.out.println("-----test-----");
        String txt = """
                Yonghe nine years, aged in the ugly, at the beginning of the spring, will be in the Lanting Pavilion of the Kuaiji Mountain, repairing things. The group is full of talents, less long and salty. There are mountains and mountains, Maolin bamboo, and clear stream Exciting, the reflection of the left and right, convinced that the flow of water, the second to sit. Although there is no silk bamboo string, the glimpse of a string, it is enough to smooth the feelings. It is also a day, the sky is clear, the wind is smooth, look up The universe is big, and the quality of the products is inspected, so it is enough to see the entertainment, and the music is also good.\s
                The lady's phase is, pitching on the world, or taking the embrace, and enlightenment within one room; or because of the care of the host, letting the waves go beyond the shape. Although the fun is very different, the difference is quiet, when it is happy to meet, temporarily In my own self, I am self-sufficient, I don’t know that the old is coming. I am tired of it, and I am moved with emotions, and I am fascinated by the feelings. I am happy with it, and between the pitches, it’s already a trace, and I can’t help it. Short-sleeved and self-contained, the end of the end. The ancients said: The dead are also big. I don't know how to swear! (I don't know if the old one is going to work: I never knew that the old is coming)\s
                Every time you look at the feelings of the past, if you have a good deed, you can't be ignorant of the literary genre. You can't be tempted by your heart. It is a vain to know that a dead child is born, and that Qi Pengzhen is a masterpiece. The sorrows of the present. The sorrows of the sorrows of the sects of the sects of the sects of the sects of the sects of the sects of the sects of the sects of the sects of the sects of.
                """;
        GoogleTranslateTest g = GoogleTranslateTest.getInstance();
        try {
            System.out.println( g.translateText(txt,"en","it"));
            System.out.println( g.translateText("Who can say support is not supported", "auto", "ru"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
