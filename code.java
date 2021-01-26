class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int i,j,diff=0,max=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    max=j;
                }
            }
            if(max-i>diff)
            {
                diff=max-i;
            }
        }
        return diff;
    }
}
