package Package1;
/*
public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {

	}

	public Integer addElement(Integer data) {
		Node newone = new Node();
		newone.setData(data);


		if (head == null && tail == null) {
			head = newone;
			tail = newone;
			return tail.getData();
		} else {
			newone.setIndex(tail.getIndex() + 1);
			tail.setNext(newone);
			tail = newone;
			return tail.getData();
		}
	}

	public Integer get(int index) {
		Node node = this.head;
		for (int i = 0; i <= tail.getIndex(); i++) {
			if(index<0) return null;
			else if(index>tail.getIndex()) return null;
			else if (i == index){ return node.getData();}
			else {
				node = node.getNext();
			}
		}
return node.getData();
	}

	public int size(){
		Node node1=this.head;
		if(node1==null) return 0;
		else{
		for (int i=0; i<=tail.getIndex(); i++) {
			size++;
		}
		return size;

	}
		public boolean delete(int index){
			Node node3=this.head;
			Node afterDelete=new Node();
			for(i=0; i<=tail.getIndex(); i++){
				if(i==index){
					afterDelete=node3.getPrew();
               node3.getNext()=afterDelete;
				}
			}
		}
}}*/