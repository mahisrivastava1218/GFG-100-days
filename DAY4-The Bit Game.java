class Solution {
    public static int swapBitGame(long N) {
        // code here
        int count=0;
         while(N>0){
             if((N&1)==1){
                 count++;
             }
              N>>=1;
             
         }
         return count%2==0?2:1;
    }
}
