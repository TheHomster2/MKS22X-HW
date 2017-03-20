public class Recursion{
	public static String name(){
		return "Hom,Anthony";
	}
	public static double sqrt(double n){
		if (n < 0){
			throw new IllegalArgumentException("Sorry only values greater than 0");
		}
		else {
			return anotherSqrt(n, 1);
		}
	}

	public static double anotherSqrt(double n, double guess){
		if(n == 0){
			return 0.0;
		}
		
		double betterGuess = (n / guess + guess) / 2;
		//Checks for the percent difference between the two values given;
		if(Math.abs(n - betterGuess * betterGuess) / n  * 100 <= 0.00000000001){
			return betterGuess;
		}
		else{
			return anotherSqrt(n, betterGuess);
		}
	}

	public static void main(String[]args){
		System.out.println(anotherSqrt(100, 1));
		System.out.println(sqrt(9));
		System.out.println(sqrt(-1));
	}
}