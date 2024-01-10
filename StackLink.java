class Node{
	int data;
	Node next;

	public Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head,tail;

	public void inserInStack(int data){
		Node node=new Node(data);
		if(head == null){
			head=node;
			tail=node;
		}else{
			tail.next=node;
			tail=node;
		}
	}
	public void traverseList(){
		Node currentNode=head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}

	public void deleteLifo(){
		Node stepTail=head;
		while(stepTail.next.next !=null){
			stepTail=stepTail.next;
			if(stepTail.next.next==null){
				System.out.println("tail has been removed");
				System.out.println(tail.data);
				tail=stepTail.next;
			}
		}
	}
}
class StackLink{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.inserInStack(3);
		l1.inserInStack(4);
		l1.inserInStack(5);
		l1.inserInStack(7);
		l1.traverseList();
		l1.deleteLifo();
	}
}