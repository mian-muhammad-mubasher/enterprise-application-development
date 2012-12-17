package pk.edu.pucit.generics;

public class ClassicQueue<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public void add(T t){
		Node<T> temp = new Node<T>();
		temp.setElement(t);
		temp.setNext(null);
		if(head==null){
			head = tail = temp;
		}else{
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public T remove(){
		T temp = null;
		if (head!=null){
			Node<T> tNode = head;
			temp = tNode.getElement();
			head = head.getNext();
		}
		return temp;
	}

	public int getSide() {
		return size;
	}

	public void setSide(int side) {
		this.size = side;
	}
}
