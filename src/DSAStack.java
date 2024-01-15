class Stack
{
	int [] stack = new int[5];
	int top = 0;
	
	public void push(int data)
	{	
		if(top == 5)
		{
			System.out.println("Stack is Full.");
		}
		else
		{
			stack[top] = data;
			top++;
		}
	}
	
	public int pop()
	{
		int data =0;
		
		if(isEmpty())
		{
			System.out.println("Stack is Empty.");
		}
		else
		{
			top--;	
			data = stack[top];
			stack[top] = 0;
		}
			return data;
	}
	
	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top <=0;
	}
	
	public void show()
	{
		for(int n: stack)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
public class DSAStack {
	
	public static void main(String a[])
	{
		Stack st = new Stack();
		st.push(15);
		st.show();
		
		st.push(8);
		st.show();
		
		st.push(10);
		st.show();
		
	
		System.out.println("Poped Value: " + st.pop());
		System.out.println("Poped Value: " + st.pop());
		System.out.println("Poped Value: " + st.pop());
		System.out.println("Poped Value: " + st.pop());
		
	}
}
