package data_structure;

public class Deque<D>
{

	public D data;
	public Deque<D>next;
	public Deque<D>prev;

	public Deque()
	{
		this.next=null;
		this.prev=null;

	}

	public Deque(D value)
	{
		this.data=value;
		this.next=null;
		this.prev=null;


	}
}
























