import java.util.*;
class Stack
{
Scanner sc=new Scanner(System.in);
 int arr[];
 int i,n,top,key;
 Stack1()
 {
  System.out.println("Enter size of Stack:");
  n=sc.nextInt();
  arr=new int[n];
  int top=-1;
 }
 public void push()
 {
  if(top == (n-1))
  {
  System.out.println("Overflow");
  }
  else
  {
   System.out.println("Enter elements of Stack:");
  key=sc.nextInt();
  arr[top]=key;
  top++;
  }
 }
 
 public void disp()
 {
	 System.out.println("Elements of Stack are:");
  for(int i=0;i<top;i++)
  {
  System.out.println(arr[i]+" ");
  }
 }
 
 public void pop()
 {
	 if(top==-1)
	 {
		 System.out.println("Underflow");
	 }
	 else
	 {
		 top--;
		 System.out.println("Poped ELement is: "+arr[top]);
		 
	 }
 }
 public static void main(String args[])
 {
  Stack s=new Stack();
  Scanner sc=new Scanner(System.in);
  int ch=0;
  System.out.println("1.Push\n2.Pop\n3.Disp\n4.Exit\n");
  while(ch!=4)
  {
   System.out.println("Enter choice:");
   ch=sc.nextInt();
  switch(ch)
  {
	  case 1:s.push();
	  break;
	  	  case 2:s.pop();
		  break;
		  	  case 3:s.disp();
			  break;
			  	  case 4:System.exit(0);
				  break;
  }
  }
 }

 }