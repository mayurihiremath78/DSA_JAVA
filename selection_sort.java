public class selection_sort {
    public static void s_sort()
    {

        int arr[]={1,3,2,4};
        int i,j;
        int n=arr.length;
        
        for(i=0;i<n-1;i++)
        {
            int minindex=i;
            for(j=i+1;j<n;j++)
            {
				if(arr[j]<arr[minindex])
				{
					minindex=j;
				} 
int temp=arr[j];
arr[minindex]=arr[j];
arr[j]=arr[minindex];				
             }
			 
        }

        System.out.println("Array after selection sort:");
         for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        s_sort();
    }
}
