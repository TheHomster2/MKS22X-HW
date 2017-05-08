import java.util.Stack;

public class StackCalc{

	public static double eval(String s){
		String[] tokens = s.split(" ");
		Stack <String> values = new Stack <String>();
		for (String token:tokens){
			if(isOperator(token)){
				values.push(apply(token, values.pop(), values.pop()));
			}
			else{
				values.push(token);
			}
		}
		return Double.parseDouble(values.pop());	
	}

	private static boolean isOperator(String s){
		char index = s.charAt(0);
		return (index == '+' || index == '-' || index == '*' || index == '/' || index == '%');
	}

	private static String apply(String op, String a, String b){
		char operator = op.charAt(0);
		double one = Double.parseDouble(a);
		double two = Double.parseDouble(b);
		if (operator == '+'){
			return one + two + "";
		}
		if (operator == '-'){
			return two - one + "";
		}
		if (operator == '*'){
			return one * two + "";
		}
		if (operator == '/'){
			return two / one + "";
		}
			return two % one + "";
	}

	public static void main(String[]args){
		System.out.println(eval("5 2 + 3 * 8 -"));
	}
}
