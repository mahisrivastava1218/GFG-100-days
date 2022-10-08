class Solution {
    static int countOfSubstrings(String S, int K) {
        // code here
        int[] freq=new int[26];
        for(int i=0;i<K;i++){
            freq[S.charAt(i)-'a']++;
             
        }
        int res=0,i=0,j=K,distinct=0;
        for(int x:freq){
            System.out.println(x);
            if(x>0){
                distinct++;
            }
        }
        while(j<=S.length()){
            if(distinct==K-1){
                res++;
            }
            if(j==S.length()){
                break;
            }
            freq[S.charAt(i)-'a']--;
            if(freq[S.charAt(i)-'a']==0) distinct--;
            freq[S.charAt(j)-'a']++;
            if(freq[S.charAt(j)-'a']==1) distinct++;
            i++;
            j++;
        }
        return res;
    }
};
