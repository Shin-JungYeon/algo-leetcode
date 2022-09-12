import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        
        StringBuffer sb = new StringBuffer();
        
        boolean isWhile = true;
        int tempX = x;
        while(isWhile) {
            sb.append(tempX % 10);
            
            tempX = tempX / 10;
            
            if(tempX == 0) {
                isWhile = false;
            }
        }
        
        try {
            int sbInt = Integer.parseInt(sb.toString());

            if(x == sbInt) {
                return true;
            } else {
                return false;
            }
        } catch(NumberFormatException nfe) {
            return false;
        }
    }
}