import java.util.Stack;

public class Solution {

    private static final char BRACKET_OPEN = '(';
//    private static final char BRACKET_CLOSE = ')';

    public static int longestValidParentheses(String s) {
        Stack<Integer> openIndices=new Stack<>();
        int length=s.length();
        int[] longestEndingAt=new int[length];
        int maxLength =0;
        for(int i=0;i<length;i++){
            char currentChar=s.charAt(i);
            if(currentChar==BRACKET_OPEN){
                openIndices.push(i);
            }
            else{
                if(!openIndices.isEmpty()){
                    int openIndex=openIndices.pop();
                    int currentLength=i-openIndex+1;
                    int previousLength = openIndex > 0 ? longestEndingAt[openIndex - 1] : 0;
                    int totalLength = currentLength + previousLength;
                    // System.out.println(currentLength+" "+i+" "+totalLength+" ");
                    longestEndingAt[i]=totalLength;
                    maxLength =Math.max(maxLength, totalLength);
                }
            }
        }
        return maxLength;
    }
}
