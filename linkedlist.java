import java.util.*;

public class linkedlist
{
 class Node
 {
  int data;
  Node na;
  
  public Node(int val)
  {
   data=val;
   na=null;
  }
 }


 public Node head=null;
 public Node tail=null;
 
 public void add(int d)
 {
  Node newnode=new Node(d);
  if(head==null)
  { 
    head=newnode;
    tail=newnode;
  } 
  else
  {
   tail.na=newnode;
   tail=newnode;
  } 
 }

public void display()
{
 Node curr=head;
 if (curr == null)
 {
  System.out.print("List is empty");
 }
 while(curr != null)
 {
  System.out.print(curr.data + " ");
  curr=curr.na;
 }
}
 
public static void main(String[] args)
{ 
 linkedlist list=new linkedlist();
 Scanner ss=new Scanner(System.in);
 int size=ss.nextInt();
 for(int i=0;i<size;i++)
 {
  list.add(ss.nextInt());
 }
 list.display();
}
}







