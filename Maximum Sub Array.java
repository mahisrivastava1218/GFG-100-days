// User function Template for Java
//kadane's algorithm
class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        int cursum=0;
        int maxsum=0;
        int curstart=0;
        int maxstart=0;
        int maxend=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                cursum=0;
                curstart=i+1;
            }else{
                cursum+=a[i];
            }
            
            if(cursum>maxsum){
                maxsum=cursum;
                maxstart=curstart;
                maxend=i+1;
            }else if(cursum==maxsum){
                int curdist=i+1-curstart;
                int maxdist=maxend-maxstart;
                if(curdist>maxdist){
                    maxstart=curstart;
                    maxend=i+1;
                }
                
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=maxstart;i<maxend;i++){
            res.add(a[i]);
        }
        if(res.size()==0){
            res.add(-1);
        }
        return res;
    }
}
