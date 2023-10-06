//time complexity Best Case=O(1) Wrost Case=O(n)
import java.util.*;
public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elemets of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int search=sc.nextInt();
        int f=0;
         int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                f++;
                index=arr[i];
            }

        }
        if(f>0)
        {
            System.out.println("Elements found at index:"+index);
        }
        else
        {
 System.out.println("Element Not found");
        }
        sc.close();
    }
}