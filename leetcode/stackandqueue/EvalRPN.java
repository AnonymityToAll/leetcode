package stackandqueue;

import java.util.*;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<String> myStack = new Stack<>();
        for (int i = tokens.length-1; i >= 0; i--) {
            myStack.push(tokens[i]);
        }
        List<Integer> numList = new ArrayList<>();
        Set<String> operateSet = new HashSet<>();
        operateSet.add("+");
        operateSet.add("-");
        operateSet.add("*");
        operateSet.add("/");
        while (!myStack.isEmpty()){
            String top = myStack.pop();
            if (operateSet.contains(top)){//operate
                int pushNum = -1;
                int size = numList.size();
                if (top.equals("+")){
                    pushNum = numList.get(size-2) + numList.get(size-1);
                }else if (top.equals("-")){
                    pushNum = numList.get(size-2) - numList.get(size-1);
                }else if (top.equals("*")){
                    pushNum = numList.get(size-2) * numList.get(size-1);
                }else if (top.equals("/")){
                    pushNum = numList.get(size-2) / numList.get(size-1);
                }
                myStack.push(String.valueOf(pushNum));
                numList.remove(size-1);
                numList.remove(size-2);
            }else{
                numList.add(Integer.parseInt(top));
            }
        }
        return numList.get(0);
    }
}
