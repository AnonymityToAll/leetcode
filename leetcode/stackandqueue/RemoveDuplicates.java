package stackandqueue;

import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String s){
        String res = "";
        Stack<Character> resStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!resStack.isEmpty() && resStack.peek() == c){
                resStack.pop();
            }else{
                resStack.push(c);
            }
        }
        for (Character character : resStack) {
            res += character;
        }
        return res;
    }
}
