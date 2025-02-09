package Ethics;

public class Client {

	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.addFirst(20);
		l.addFirst(40);
		l.addFirst(60);
		l.addFirst(80);
		l.addFirst(100);
		l.addLast(120);
		l.addAt(4, 20);
		l.deleteAt(5);
		l.Display();
//		l.Removefirst();
//		l.Removelast();
		
//		System.out.println(l.getAt(5));
		// TODO Auto-generated method stub

	}

}
