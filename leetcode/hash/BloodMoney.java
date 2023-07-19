package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BloodMoney {
    public boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        //magazine中的字符数目统计出来
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            }else{
                characterIntegerMap.put(c, 1);
            }
        }
        //ransomNote中的字符减去1
        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);
            if (!characterIntegerMap.containsKey(character)){
                return false;
            }else if (characterIntegerMap.get(character) > 1){
                characterIntegerMap.put(character, characterIntegerMap.get(character) - 1);
            }else{
                characterIntegerMap.remove(character);
            }
        }
        return true;
    }
}
