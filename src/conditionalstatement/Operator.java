package conditionalstatement;

public class Operator {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		if(num1>num2) {
			System.out.println(num1 + " is bigger than "+ num2);
		}else if(num1<num2){
			System.out.println(num2 + " is bigger than "+ num1);
		}else if(num1==num2){
			System.out.println(num2 + " is equals to "+ num1);
		}

	}

}
