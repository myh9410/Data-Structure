package datastructure;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stack_main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		while (true) {
			try{
				int num = Integer.parseInt(
					JOptionPane.showInputDialog("메서드 선택 \n1.push \n2.pop \n3.top \n4.size \n5.isEmpty \n(0.종료)"));
				if ((num != 0) && (num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5)) {
					System.out.println("0~5사이의 숫자만 입력해주세요");
				} else {
					switch (num) {
					case 0:
						return;
					case 1:
						System.out.println("push를 선택하셨습니다.");
						System.out.println("element값을 입력해주세요.");
						Scanner sc = new Scanner(System.in);
						int ps = sc.nextInt();
						stack.push(ps);
						stack.StackContents();
						break;
					case 2:
						System.out.println("pop을 선택하셨습니다.");
						stack.pop();
						stack.StackContents();
						break;
					case 3:
						System.out.println("top을 선택하셨습니다.");
						stack.top();
						stack.StackContents();
						break;
					case 4:
						System.out.println("size를 선택하셨습니다.");
						stack.size();
						stack.StackContents();
						break;
					case 5:
						System.out.println("isEmpty를 선택하셨습니다.");
						stack.isEmpty();
						stack.StackContents();
						break;
					}
				}
			}catch (Exception e){
				System.out.println("다시 입력하세요!");
			}
		}
	}
}
