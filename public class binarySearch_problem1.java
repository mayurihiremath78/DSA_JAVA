public class binarySearch_problem1 {
    

    public static void ceiling_val()
    {
        int arr[]={10,23,45,67,89,90};
    int key=67;
    int first=0;
    int last=arr.len-1;
    mid=(first+last)/2;
        while(first<=last)
        {
            if(key==mid)
            {
           
                System.out.println(arr[mid]);
            }
            else if(key>mid)
            {
                
               System.out.println(arr[mid+1]);
            }
            else
            {
                last=mid-1;   
            }
            mid=(first+last)/2;
        }
        
         if(first>last)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String args[])
    {
        ceiling_val();
    }
}
