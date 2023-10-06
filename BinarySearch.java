public class BinarySearch
{
    public static void binaryserach()
    {

       
       int arr[]={10,20,30,40,50};
        int key=110;
        int last=arr.length-1;
        int first=0;
int mid=(first+last)/2;



    while(first<=last)
    {
        if(key>arr[mid])
        {
            first=mid+1;
        }
        else if(arr[mid]==key)
        {
            System.out.println("Element Found");
            break;
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
        
        binaryserach();

    }
}