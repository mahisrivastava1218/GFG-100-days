class Solution {
    public static int minChar(String str) {
       //Write your code here
       int i=0;
       int j=str.length()-1;
       int ct=0;
       while(i<j){
           if(str.charAt(i)==str.charAt(j)){
               i++;
               j--;
           }else{
               ct=str.length()-j;
               i=0;
               while(str.charAt(i)==str.charAt(j)){
                   ct--;
                   i++;
               }
               j--;
           }
       }
       return ct;
    }
}
