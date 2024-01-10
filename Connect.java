class Node{
	int data;
	Node next;
	int size=0;

	public Node(int data){
			this.data=data;
			size++;
	}
}

class LinkedList{
	Node head;
	Node tail;

	public void insertList(int data)
	{
		Node node=new Node(data);

		if(head==null){
			head=node;
			tail=node;
		}else{
			tail.next=node;
			tail=node;
		}
	}

	public void traverseList(){
		Node currentNode=head;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;

		}
	}
	public void deleteFirst(){
		head=head.next;
		traverseList();
	}
}

class Connect{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertList(3);
		l1.insertList(4);
		l1.insertList(5);
		l1.insertList(6);
		l1.insertList(7);
		l1.traverseList();
		System.out.println("------------------------------------");
		l1.deleteFirst();

	}
}