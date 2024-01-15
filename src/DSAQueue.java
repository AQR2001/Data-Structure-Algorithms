class Queue
{
	int[] qu = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
			qu[rear] = data;
			rear = (rear + 1)%5;
			size = size + 1;
		}
		else
			System.out.println("Queue is Full.");
	}
	
	public int deQueue()
	{
		int data = qu[front];
		if(!isEmpty())
		{
			front = (front + 1)%5;
			size = size -1;
		}
		else 
			System.out.println("Queue is Empty.");
		return data;
	}
	
	public void show()
	{
		System.out.print("Elements :");
		for(int i=0; i<size ; i++)
		{
			System.out.print(qu[(front + i)%5] + " ");
		}
		System.out.println();
		for(int n: qu)
		{
			System.out.print(n + " ");
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return getSize() == 0;
	}
	
	public boolean isFull()
	{
		return getSize() == 5;
	}
	
}
public class DSAQueue {
	public static void main(String a[])
	{
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		
//		q.deQueue();
//		q.deQueue();
//		
		
		q.enQueue(9);
		q.enQueue(1);
		
		System.out.println("SIZE is: "+ q.getSize());
		System.out.println("Empty Status: "+ q.isEmpty());
		System.out.println("Full Status: "+ q.isFull());
		
		q.show();
	}
}
