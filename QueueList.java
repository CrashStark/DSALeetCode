class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head;
	Node tail;

	public void insertList(int data){
		Node node = new Node(data);
		if(head == null){
			head =node;
			tail=node;
		}else{
			tail.next=node;
			tail=node;
		}
	}

	public void traverse(){
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}

	public void deleteFifo(){
		System.out.println("Deleted element from queue");
		System.out.println("+"+head.data+"+");
		head=head.next;
		traverse();
	}
}
class QueueList{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertList(1);
		l1.insertList(3);
		l1.insertList(4);
		l1.insertList(5);
		l1.traverse();
		l1.deleteFifo();
	}
}