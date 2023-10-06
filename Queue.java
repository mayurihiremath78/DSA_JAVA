import java.util.Scanner;  // Import the Scanner class

class Queue {
	 Scanner sc = new Scanner(System.in); 
	  int n;
	  int arr[];
   int front,rear;
  int val;
   
	  
	Queue()
	{
	System.out.println("Enter Queue Size: ");
	n=sc.nextInt();
	arr=new int[n];
	int front=-1;
    int rear=-1;
	}
	
	void enqueue()
   {
	   if(rear>= n-1)
	   {
		   System.out.println("Queue Full");
	   }
	   else
	   {
		   System.out.println("Enter Value: ");
			val=sc.nextInt();
			arr[rear]=val;
			rear++;
	   }
   }
   void dequeue()
   {
	   if(front==rear)
	   {
		   System.out.println("Queue Empty");
	   }
	   else 
	   {
		   System.out.println("Pop value is: "+arr[front]);
		   front++;
	   }
   }
   public void disp()
   {
	   if(rear==front)
	   {
		   System.out.println("Empty Queue");
	   }
	 else
	 {
		   System.out.println("Elements of Array Are:\n");
	   for(int i=front;i<rear;i++)
	   {
		   System.out.println(arr[i]);
	 }
	 
	 }
   }
   
  public static void main(String[] args) {
	 
   Queue q=new Queue();
   q.enqueue();
   q.enqueue();
   q.enqueue();
   q.disp();
   q.dequeue();
   q.disp();
   q.dequeue();
   q.dequeue();
   q.disp();
   
   }
  
}