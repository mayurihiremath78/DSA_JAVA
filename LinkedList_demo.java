import java.util.*;

public class LinkedList_demo
{

  public class Node
  {
    int data;
	Node next;
	
	public Node(int data)
	{
	 this.data=data;
	 this.next=null;
	}
  }
  
 public Node head=null;
 public Node tail=null;
 
 public void add(int data)
 {
  Node newNode=new Node(data);
  
   if(head==null)
   {
     head=newNode;
	 tail=newNode;
   }
   else
   {
     tail.next=newNode;
	 tail=newNode;
   }
 }
 
 public void disp()
 {
	 Node current=head;
   if(head==null)
   {
   System.out.println("Empty");
   }
   else
   {
    
	System.out.println("Elements of List:");
	while(current!=null)
	{
	  System.out.println(current.data);
	  current=current.next;
	}
   }
 }
 
 public void addStart(int data)
 {
	 Node StartNewNode=new Node(data);
	 if(head==null)
	 {
		 head=StartNewNode;
		 tail=StartNewNode;
	 }
	 else
	 {
		 StartNewNode.next=head;
		 head=StartNewNode;
	 }
 }
 
 public void addEnd(int data)
 {
	 Node EndNewNode=new Node(data);
	 if(head==null)
	 {
		 head=EndNewNode;
		 tail=EndNewNode;
	 }
	 else
	 {
		 tail.next=EndNewNode;
		 tail=EndNewNode;
	 }
 }
 
 public void Search(int data)
 {
	
	if(head==null)
	{
		System.out.println("Empty List");
	}
	else
	{
		Node current=head;
		
		while(current!=null)
		{
			if(current.data==data)
			{
				System.out.println("Element Found:"+data);	
				
			}
			current=current.next;
		}	
	}
 }
 
 public void Length_List()
 {
	 int count=0;
	 if(head==null)
	 {
		 System.out.println("Empty List");
	 }
	 else
	 {
		 Node current=head;
		 while(current!=null)
		 {
			 count++;
			 current=current.next;
		 }
		 System.out.println("Length of List:"+count);
	 }
 }
 
 public void DeleteNodeStart()
 {
	 Node current;
	 if(head==null)
	 {
		 System.out.println("Empty List");
	 }
	 
	 else
	 {
		current =head.next;
		head=current;
	 }
 }
 
 public void DeleteNodeEnd()
 {
	 if(head==null)
	 {
		 System.out.println("Empty List");
	 }
	 else if(head.next==null)
	 {
		 head=null;
		 tail=null;
	 }
	 else
	 {
		 Node current=head;
		 while(current.next!=tail)
		 {
			current=current.next;
		 }
		 System.out.println("Last Element deleted:"+tail);
		 tail=current;
		 tail.next=null;
	 }
 }
 
 public void DeleteNode(int data)
 {
	 int key=data;
	 Node current=head,current1=head;
	 if(head==null)
	 {
		 System.out.println("Empty List");
	 }
	 else if(head.next==null)
	 {
		 head=null;
		 tail=null;
	 }
	 else
	 {
		 while(current.next!=null)
		 {
			 if(current.data==key)
			 {
				
			 }
			 current=current.next;
		 }
		 
	 }
	 
 }
 
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
     LinkedList_demo l=new LinkedList_demo();
  
  int ch=-1;
  while(ch!=0)
  {
	  System.out.println("---------------------------------------\n0.Exit\n1.Add\n2.print\n3.AddStart\n4.AddEnd\n5.Search\n6.Length\n7.Delete Start\n8.Delete End\n9.Delete");
	   System.out.println("Enter choice:");
	   ch=sc.nextInt();
	   int val;
	  switch(ch)
	  {
		  case 0:System.exit(0);
		  break;
		  case 1: System.out.println("Enter value:");
		  val=sc.nextInt();
		  l.add(val);
		  break;
		  case 2:l.disp();break;
		  case 3: System.out.println("Enter value for add start:");
		  val=sc.nextInt();
		  l.addStart(val);
		  break;
		  case 4: System.out.println("Enter valuefor add End:");
		  val=sc.nextInt();
		  l.addEnd(val);
		  break;
		  case 5:System.out.println("Enter value for Search:");
		  val=sc.nextInt();
		  l.Search(val);
		  break;
		  case 6:l.Length_List();
		  break;
		  case 7:
		  l.DeleteNodeStart();
		  break;
		  case 8:l.DeleteNodeEnd();
		  break;
		  case 9:System.out.println("Enter value for Search:");
		  val=sc.nextInt();
		  l.DeleteNode(val);
		  break;
		  default: System.out.println("Enter valid Choice!!");
		  break;
		 
	  }
  }

 }
}