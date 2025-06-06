class Solution 
{
    int getMinDiff(int[] arr, int k) 
	{
        // code here
        int n = arr.length;
        if(n == 1 ) return 0;
         Arrays.sort(arr);
        int minEle = arr[0] + k;
        int maxEle = arr[n - 1] - k;
        int result = arr[n - 1] - arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i] - k < 0) continue;
            int currentMin = Math.min(minEle, arr[i] - k);
            int currentMax = Math.max(maxEle, arr[i - 1] + k);
            result = Math.min(result,currentMax - currentMin);
        }
        return result;
        
    }
    public static void main(String args[])
    { 
        int k = 2;
        int[] arr = {1, 5, 8, 10};
        Solution s=new Solution();
        int result = s.getMinDiff(arr, k);
        System.out.println("Minimum Difference is: " +result);
    }
    
}