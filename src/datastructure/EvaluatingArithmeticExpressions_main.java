package datastructure;

import javax.swing.JOptionPane;

public class EvaluatingArithmeticExpressions_main {
	public static void main(String[] args) {

		Arith_Stack stack1 = new Arith_Stack();
		Arith_Stack stack2 = new Arith_Stack();
		String arith = "";
		while (arith != "=") {
				double num = Double.parseDouble(JOptionPane.showInputDialog("���� �Է��ϼ���."));
				stack1.push_arith(num);
				System.out.print(num);
		}
		while ((arith != "+") || (arith != "-") || (arith != "*") || (arith != "/") || (arith != "=")){
			arith = JOptionPane.showInputDialog("�����ȣ�� �Է��ϼ���.( + , - , * , / , = )");		
			if ((arith == "+") || (arith == "-") || (arith == "*") || (arith == "/") || (arith == "=")) {
				stack2.push_arith(arith);
				System.out.print(arith);
			}
			if (stack2.checksize_arith() >= 2) {
				while (stack2.checksize_arith() != 1) {
					String temp1 = (String) stack2.top();
					String temp2 = (String) stack2.top();
					double num1 = (double) stack1.pop_arith();
					double num2 = (double) stack1.pop_arith();
					if ((temp1.equals("-") || temp1.equals("+") || temp1.equals("="))
							&& (temp2.equals("*") || temp2.equals("/"))) {
						if (temp2.equals("*")) {
							double result = num1 * num2;
							stack1.push_arith(result);
							stack2.pop_arith();
							stack2.pop_arith();
							stack2.push_arith(temp1);
							} else if (temp2.equals("*")) {
									double result = num2 / num1;
									stack1.push_arith(result);
									stack2.pop_arith();
									stack2.pop_arith();
									stack2.push_arith(temp1);
								}
							} else if ((temp1.equals("-") || temp1.equals("+") || temp1.equals("="))
									&& (temp2.equals("+") || temp2.equals("-"))) {
								if (temp2.equals("-")) {
									double result = num2 - num1;
									stack1.push_arith(result);
									stack2.pop_arith();
									stack2.pop_arith();
									stack2.push_arith(temp1);
								} else if (temp2.equals("+")) {
									double result = num1 + num2;
									stack1.push_arith(result);
									stack2.pop_arith();
									stack2.pop_arith();
									stack2.push_arith(temp1);
								}
							} else if ((temp1.equals("*") || temp1.equals("/") || temp1.equals("="))
									&& (temp2.equals("*") || temp2.equals("/"))) {
								if (temp2.equals("*")) {
									double result = num1 * num2;
									stack1.push_arith(result);
									stack2.pop_arith();
									stack2.pop_arith();
									stack2.push_arith(temp1);
								} else if (temp2.equals("/")) {
									double result = num2 / num1;
									stack1.push_arith(result);
									stack2.pop_arith();
									stack2.pop_arith();
									stack2.push_arith(temp1);
								}
							} else {
								break;
							}

						} // while (stack2.checksize_arith() != 1)
					} // if (stack2.checksize_arith()>= 2)
				}
		} // main�Լ� ����
}// EvaluatingArithmeticExpressions_main ����