package data_structure;

public class DequeMain<D> {
	
	public DequeMain()
	{
		                                                                                 
	}
	
	Deque<D> front;
	Deque<D> rear;
 	int size=0;
	
	//to add front element
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	public void addFront(D num)
	{
		if(front==null) //if no element
		{
			front.data=num;
			rear=front;
		}
		else            //if element is present in list
		{
			Deque<D>tNode=null;
			tNode.data=num;
			tNode.next=front;
			front.prev=tNode;
			front=tNode;
					
		}
		size++;
	}
	
	public void addRear(D num)
	{
		if(front==null)
		{
			Deque<D>tNode=new Deque<D>(num);
			front=tNode;
			rear=front;
		}
		else
		{
			Deque<D>tNode=new Deque<D>(num);
			rear.next=tNode;
			tNode.prev=rear;
			rear = tNode;
		}
		size++;
	}
	
	public D removeFront()
	{
		D val = null;
		
		if(front == null)
		{
			System.out.println("no element is there");
		}
		else
		{
			val = front.data;
			front = front.next;
		}
		size--;
		return val;
	}	
	
	public D removerear() {
		
		D val = null;
		
		if(front==null)
		{
			System.out.println("no element is there");
		}
		else
		{
			val = rear.data;
			rear = rear.prev;
			rear.next = null;
		}
		size--;
		return val;
	}
	
	public boolean isEmpty() {
		if(front == null)
		{
			return true;
		}
		else
		{      
			return false;
		}
	}
	
	public int size() {
		return size;
	}

}
