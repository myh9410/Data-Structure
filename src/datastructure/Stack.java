package datastructure;

public class Stack {
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
    
    public void push(Object input){
        // ��带 �����մϴ�.
        Node newNode = new Node(input);
        // ���ο� ����� ���� ���� �ص带 �����մϴ�.
        newNode.next = head;
        // ���� ���ο� ��带 �����մϴ�.
        head = newNode;
        size++;
    }
    public void StackContents() {
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
    public void pop(){
    	if (size==0){
    		System.out.println("Return Value : null");
    	}else{
        Node temp = head;
        head = temp.next;
        // �����͸� �����ϱ� ���� ������ ���� �ӽ� ������ ����ϴ�. 
        Object returnData = temp.data;
        temp = null;
        size--;
        System.out.println("Return Value : " + returnData);
    	}
    }
    public int checksize(){
        return size;
    }
    public void size(){
    	System.out.println("Return Value : " + size);
    }
    public void isEmpty() {
    	if (checksize()==0)
		System.out.println("Return Value : true");
        else
        System.out.println("Return Value : false");
    }
    public void top(){
    	Node temp = head;
    	Object returnData = temp.data;
		System.out.println(returnData);
    }
        
}