//Greater value than key

public class binarySearch_problem1 
{
    public  int ceiling_val()
    {
        int arr[]={10,23,45,67,89,90};
    int key=89;
    int first=0;
    int last=arr.length-1;
    int mid=(first+last)/2;
    int x=-1;
        while(first<=last)
        {
             if(key==arr[mid])
            {
                x=arr[mid];
                                return x;
            }
            else if(key>arr[mid])
            {
              
                first=mid+1;
                //return x;
            }
            
            else
            {
                 x= arr[mid];
                last=mid-1;   
            }
              mid=(first+last)/2;
        }
        
       
        return (x);
    }
    public static void main(String args[])
    {

        binarySearch_problem1 obj=new binarySearch_problem1();
        int value=obj.ceiling_val();
        System.out.println(value);
    }
}
