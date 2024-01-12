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

		if(head==null){
			head=node;
			tail=node;
		}else{
			tail.next=node;
			tail=node;
		}


	}

	public void reverseRec(Node node){
		if(node==null)
		{
			return;
		}
		else{
			System.out.println(node.data +"Reve");
			reverseRec(node.next);
		}
	}

	public void reverseList(){
		Node current=head;
		Node prev=null,next=null;
			while(current!=null){
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}

			head=prev;
			reverseRec(head);

	}

	public void travers(Node node){
			Node current=node;

			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
	}

}

class ReverseLink{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertList(1);
		l1.insertList(2);
		l1.insertList(3);
		l1.insertList(4);
		l1.reverseList();

	}
}