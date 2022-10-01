class Solution {
    static int safePos(int n, int k) {
        // code here
        // if(n==1) return 1;
        // return (safePos(n-1,k)+k-1)%n+1;
        int res=1;
        for(int i=2;i<=n;i++){
            res=(res+k-1)%i+1;
            
        }
        return res;
    }
};
