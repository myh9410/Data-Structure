package datastructure;

public class Arith_Stack {
    private Node head;
    private int size = 0;
    private class Node{
        // 데이터가 저장될 필드 노드의 object가 저장되는 것
        private Object data;
        // 다음 노드를 가리키는 필드 노드의 다음 노드를 가리키는 것(pointer)
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    
    public void push_arith(Object input){
        // 노드를 생성합니다.
        Node newNode = new Node(input);
        // 새로운 노드의 다음 노드로 해드를 지정합니다.
        newNode.next = head;
        // 헤드로 새로운 노드를 지정합니다.
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
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담습니다. 
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
