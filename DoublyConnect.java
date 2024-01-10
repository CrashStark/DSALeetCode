class Node{
	Node prev;
	int data;
	Node next;
	
	public Node(int data){
			this.data=data;
			
	}
}

class LinkedList{
	Node head;
	Node tail;
	int size;
	public void insertNode(int data){
			Node node=new Node(data);
			if(head == null){
				head=node;
				tail=node;
			}else{
				tail.next=node;
				node.prev=tail;
				tail=node;
			}
			size++;
	}

	public void traverseList(){
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("++"+this.size+"++");
	}
}

class DoublyConnect{
	public static void main(String args[]){
		LinkedList l1 = new LinkedList();
		l1.insertNode(3);
		l1.insertNode(4);
		l1.insertNode(5);
		l1.insertNode(6);
		l1.insertNode(7);

		l1.traverseList();
	}
}