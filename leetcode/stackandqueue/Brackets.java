package stackandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public boolean isValid(String s) {
        Map<Character, Character> cMap = new HashMap<>();
        cMap.put('}', '{');
        cMap.put(']', '[');
        cMap.put(')', '(');
        Stack<Character> cStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cStack.isEmpty() && cStack.peek() == cMap.get(c)){
                cStack.pop();
            }else{
                cStack.push(c);
            }
        }
        return cStack.isEmpty();
    }
}
