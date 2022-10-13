class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);
        int min=A[0];
        int max=A[N-1];
        int sum=min+max;
        return sum;
    }
}
