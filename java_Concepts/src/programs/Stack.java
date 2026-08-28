package programs;

public class Stack {

	public static void main(String[] args) {

		        String exp = "84-";

		        int len = exp.length() / 2;

		        String num = exp.substring(0, len + 1);
		        String opr = exp.substring(len+1);

		        int output = num.charAt(0) - '0';

		        for (int i = 0; i < opr.length(); i++) {

		            int value = num.charAt(i + 1) - '0';

		            switch (opr.charAt(i)) {

		                case '+':
		                    output += value;
		                    break;

		                case '-':
		                    output -= value;
		                    break;

		                case '*':
		                    output *= value;
		                    break;

		                case '/':
		                    output /= value;
		                    break;

		                default:
		                    System.out.println("Invalid Operator");
		            }
		        }

		        System.out.println(output);
		    }
	}


/*
 * separate the operators and numbers
 * numbers-num[0],num[1]
 * operator-opr[0]
 * funct(str[0],str[1])
 */
