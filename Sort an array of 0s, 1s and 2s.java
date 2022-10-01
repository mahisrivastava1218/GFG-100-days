class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low=0, mid=0, high=n-1;
        int temp=0;
        while(mid<=high){
            if(a[mid]==0){
                temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
                
            }else if(a[mid]==1){
                mid++;
            }else{
                temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        
        
    }
}
