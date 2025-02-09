package Ethics;

public class Linkedlist {
	 class node
	{
		int val;
		node next;
		
		
	}
	 int size;
	 node head=null;
	 node tail=null;
	 public void addFirst(int val)
	 {
		 node nn=new node();
		 nn.val=val;
		 if(head==null)
		 {
			 head=nn;
			 tail=nn;
		 }
		 else
		 {
			 nn.next=head;
			 head=nn;
		 }
		 size++;
	 }
	 public void addLast(int val)
	 {
		 node nn=new node();
		 nn.val=val;
		 if(head==null)
		 {
			 head=nn;
			 tail=nn;
		 }
		 else
		 {
			tail.next=nn;
			tail=nn;
		 }
		 size++;
	 }
	 public void Display()
	 {
		 node temp=head;
		 while(temp!=null)
		 {
			 System.out.print(temp.val+" ");
			 temp=temp.next;
		 }
	 }
	 public void Removefirst()
	 {
		 if (head==null)
		 {
			 return;
		 }
		 head=head.next;
		 size--;
	 }
	 public void Removelast()
	 {
		 if(head==null)
		 {
			 return;
		 }
		 if(size==1)
		 {
			 head=null;
			 tail=null;
			 return;
		 }
		 node temp=head;
		 int i=0;
		 while(i<size-2)
		 {
			 i++;
			 temp=temp.next;
		 }
		 temp.next=null;
		 size--;
	 }
	 public int getAt(int idx)
	 {
		node temp= getAt(idx,0);
		if(temp==null)return -1;
		return temp.val;
	 }
	 private node getAt(int idx,int val)
	 {
		 if(idx<0 || idx>=size)
		 {
			 return null;
		 }
		 if(idx==0)
		 {
			 return head;
		 }
		 if (idx==size-1)
		 {
			 return tail;
		 }
		 int str=0;
		 node temp=head;
		 while(str<idx)
		 {
			 temp=temp.next;
			 str++;
		 }
		 return temp;
	 }
	 public void deleteAt(int idx)
	 {
		 if(idx==0)
		 {
			 Removefirst();
		 }
		 if(idx==size-1)
		 {
			 Removelast();
		 }
		 if(idx>=size||idx<0)
			 return;
	 
	 node temp=getAt(idx,0);
	 node prev=getAt(idx -1,0);
	 prev.next=temp.next;
	 size--;
	 }
	 public void addAt(int idx,int val)
	 {
		if(idx==0)
		{
			addFirst(val);
			return;
		}
		if(size==idx)
		{
			addLast(val);
			return;
		}
		if(idx<0||idx>size)
			return;
	 
	 node temp=getAt(idx-1,0);
	 node next=temp.next;
	 node nn=new node();
	 nn.val=val;
	 temp.next=nn;
	 nn.next=next;
	 size++;
}
}

