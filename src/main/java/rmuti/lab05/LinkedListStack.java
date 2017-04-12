package rmuti.lab05;

public class LinkedListStack {

	private ArraysList lst;

	public LinkedListStack() {
		lst = new ArraysList();
	}

	public void push(Object e) {
		lst.add(e);
	}
	
	public Object peek() {
        return lst.elementData[lst.size - 1];
    }

    public Object pop() {
        Object obj = peek();
        lst.remove(lst.size - 1);
        return obj;
    }

	public static void main(String[] arg) {
		LinkedListStack s = new LinkedListStack();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
	}
	
	@Override
	public String toString() {
		return lst.toString();
	}

}
