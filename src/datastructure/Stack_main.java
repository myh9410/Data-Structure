package datastructure;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stack_main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		while (true) {
			try{
				int num = Integer.parseInt(
					JOptionPane.showInputDialog("�޼��� ���� \n1.push \n2.pop \n3.top \n4.size \n5.isEmpty \n(0.����)"));
				if ((num != 0) && (num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5)) {
					System.out.println("0~5������ ���ڸ� �Է����ּ���");
				} else {
					switch (num) {
					case 0:
						return;
					case 1:
						System.out.println("push�� �����ϼ̽��ϴ�.");
						System.out.println("element���� �Է����ּ���.");
						Scanner sc = new Scanner(System.in);
						int ps = sc.nextInt();
						stack.push(ps);
						stack.StackContents();
						break;
					case 2:
						System.out.println("pop�� �����ϼ̽��ϴ�.");
						stack.pop();
						stack.StackContents();
						break;
					case 3:
						System.out.println("top�� �����ϼ̽��ϴ�.");
						stack.top();
						stack.StackContents();
						break;
					case 4:
						System.out.println("size�� �����ϼ̽��ϴ�.");
						stack.size();
						stack.StackContents();
						break;
					case 5:
						System.out.println("isEmpty�� �����ϼ̽��ϴ�.");
						stack.isEmpty();
						stack.StackContents();
						break;
					}
				}
			}catch (Exception e){
				System.out.println("�ٽ� �Է��ϼ���!");
			}
		}
	}
}
