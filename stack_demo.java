public class stack_demo {
    int arr[]={};
    int n=arr.length;
    int top=-1;

    public void push(int val)
    {
        if(top==n)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[top]=val;
            top++;
            System.out.println("Inserted ELement");
        } 
    }

    public static void main(String args[])
    {
stack_demo s=new stack_demo();
s.push(10);


    }
}
