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
	int size;

	public void insertList(int data){
		Node node=new Node(data);
		if(head==null){
			head =node;
			tail= head;
		}else{
			tail.next=node;
			tail=node;
		}
		size++;
	}

	public void traverse(){
		Node currentNode=head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}

	public void deleteMid(){
		int count=size/2;
		Node current=null,temp=head;
		for(int i=0;i<count;i++){
			current=temp;
			temp=temp.next;
		}

		if(current!=null){
			System.out.println("Deleted element is "+temp.data);
			current.next=temp.next;
		}

		traverse();
	}
}

class DelFromSpePos{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insertList(1);
		l1.insertList(2);
		l1.insertList(3);
		l1.insertList(4);
		l1.insertList(5);
		l1.insertList(6);
		l1.insertList(7);
		// l1.insertList(8);
		// l1.insertList(9);
		l1.traverse();
		System.out.println("__________________________________");
		l1.deleteMid();
	}
}