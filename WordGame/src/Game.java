import java.util.HashMap;
import java.util.Random;

public class Game {
    public HashMap<String,String> wordWithTranslation;
    public HashMap<String,Integer> scores;
    public String [] words;
    Random r = new Random();
    public boolean check (String word , String TranslationToCheck)
    {
        String rightTranslantion = wordWithTranslation.get(word);
        return rightTranslantion.equals(TranslationToCheck);
    }

    public String nextword() {
        int index = r.nextInt(words.length);
        return words[index];
    }
    public Game(){
        this.wordWithTranslation = new HashMap<>();
        this.wordWithTranslation.put("friend","друг");
        this.wordWithTranslation.put("table","стол");
        this.wordWithTranslation.put("chair","стул");
        this.wordWithTranslation.put("world","мир");
        this.wordWithTranslation.put("sun","солнце");
            this.scores = new HashMap<>();
            words = new String[wordWithTranslation.size()];
            int i = 0;
        {
        for (String current:this.wordWithTranslation.keySet ()) {
            this.scores.put(current, 0);
            words[i] = current;
            i++;
        }
        }
    }
}
