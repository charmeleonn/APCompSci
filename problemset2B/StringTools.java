/**
 * Leon Zhang
 * 9/25/2024
 * Problem Set 2B
 */

public class StringTools {
   
    public String lastLetter(String str) {
        int len = str.length();
        return str.substring(len - 1);
    }
    
    public String formatPhoneNumber(String str1) {
        return "(" + str1.substring(0,3) + ")" + " " + str1.substring(3,6) + "-" + str1.substring(6,10);
        
    }
    
    public String middleThree(String str) {
        /* 
         * 0 1 2 3 4
         * c a n d y
         */
        
        int middle = str.length()/2 - 1;
        
        return str.substring(middle, middle + 3);
    }
    
    public String swapLastTwo (String str) {
        int beforeend = str.length()-2;
        int end = str.length();
        
        
        return str.substring(0,beforeend) + str.substring(end-1) + str.substring(end-2,end-1);
    }

    public boolean frontAgain (String str, int n) {
        /* e d i t e d 
           0 1 2 3 4 5
           */
          
        int num = n;
        String first = str.substring(0,num);
        String second = str.substring(str.length()-num);
        
        
        return first.equals(second);
        
        
    }

    
}