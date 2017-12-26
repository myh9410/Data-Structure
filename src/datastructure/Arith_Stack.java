package datastructure;

public class Arith_Stack {
    private Node head;
    private int size = 0;
    private class Node{
        // �����Ͱ� ����� �ʵ� ����� object�� ����Ǵ� ��
        private Object data;
        // ���� ��带 ����Ű�� �ʵ� ����� ���� ��带 ����Ű�� ��(pointer)
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    
    public void push_arith(Object input){
        // ��带 �����մϴ�.
        Node newNode = new Node(input);
        // ���ο� ����� ���� ���� �ص带 �����մϴ�.
        newNode.next = head;
        // ���� ���ο� ��带 �����մϴ�.
        head = newNode;
        size++;
    }
    public void StackContents_arith() {
        if(head == null){
        	System.out.println("Stack Contents : ()");
        }else{
        Node temp = head;
        String str = "(";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        System.out.println("Stack Contents : "+str+")");
        }
    }
    public Object pop_arith(){
    	if (size==0){
    		return null;
    	}else{
        Node temp = head;
        head = temp.next;
        // �����͸� �����ϱ� ���� ������ ���� �ӽ� ������ ����ϴ�. 
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    	}
    }
    public int checksize_arith(){
        return size;
    }
    public void size_arith(){
    	System.out.println("Return Value : " + size);
    }
    public boolean isEmpty_arith() {
    	if (checksize_arith()==0)
		return true;
        else
        return false;
    }
    public Object top(){
    	Node temp = head;
    	Object returnData = temp.data;
		return returnData;
    }
}
