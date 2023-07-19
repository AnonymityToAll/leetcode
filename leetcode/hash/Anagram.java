package hash;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> containsMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (containsMap.containsKey(c)){
                containsMap.put(c, containsMap.get(c) + 1);
            }else{
                containsMap.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!containsMap.containsKey(c)){
                return false;
            }else if (containsMap.get(c) == 1){
                containsMap.remove(c);
            }else{
                containsMap.put(c, containsMap.get(c)-1);
            }
        }
        return containsMap.size() == 0;
    }
}
