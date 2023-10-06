public class bubble_sort {
    public static void bsort()
    {

        int arr[]={10,1,31,3,4};
        int i,j=0;
        int n=arr.length;

        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        for( i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
 
    public static void main(String args[])
    {
        bsort();
    }
}
