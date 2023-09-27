import java.util.HashMap;

public class Mod3Zad3 {
    private final HashMap<String,Integer> wordToCount = new HashMap<>();
    public HashMap<String, Integer> countWords(String text){
        text = toiletCleaner(text);
        for (String word : text.split(" ")){
            //wordToCount.merge(word, 1, Integer::sum);
            wordToCount.put(word,wordToCount.getOrDefault(word,0)+1);
        }
        return wordToCount;
    }

    public String toiletCleaner(String text){
        text = text.replace(".", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll("-","");
        text = text.replaceAll(":", "");
        text = text.replaceAll(";","");
        return text;
    }
}
