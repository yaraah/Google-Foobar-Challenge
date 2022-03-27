public class Solution {
    public static void main(String []args){
         String str=solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!");
        System.out.println(str);
     }
       public static String solution(String x) {
        String reverseStr=new String();
        char ch;
        for(int i=0;i<x.length();i++)
        {
            ch=x.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    ch=(char)(122-(int)(ch)+97);
                }/*else
                if(Character.isUpperCase(ch)){
                    ch=(char)(90-(int)(ch)+65);
                }*/
            }
            reverseStr=reverseStr+ch;
            
        }
        return reverseStr;
    }
}

