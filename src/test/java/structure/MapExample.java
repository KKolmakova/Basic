package structure;

import java.util.HashMap;
import org.junit.Test;

public class MapExample {

    @Test
    public void compareWords() {
        String word1 = "doggy";
        String word2 = "cat";
        boolean canCreate;

        if (!compareByLength(word1, word2))
            canCreate = false;

        canCreate = modifyMap(createMap(word1), word2);
        System.out.println(canCreate);
    }

    private boolean compareByLength(String word1, String word2) {
        return word1.length() >= word2.length();
    }

    private HashMap<Character, Integer> createMap(String word) {
        HashMap<Character, Integer> wordMap = new HashMap<>();

        for (Character c : word.toCharArray()) {
            int count = 0;

            if (wordMap.containsKey(c)) {
                count = wordMap.get(c);
            }

            wordMap.put(c, ++count);
        }

        return wordMap;
    }

    private boolean modifyMap(HashMap<Character, Integer> wordMap, String word) {
        for (Character c : word.toCharArray()) {

            if (wordMap.containsKey(c)) {
                int count = wordMap.get(c);

                if (count > 0) {
                    wordMap.put(c, --count);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
