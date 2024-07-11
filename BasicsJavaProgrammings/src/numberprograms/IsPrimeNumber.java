package numberprograms;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int number = 2;
		
		if (isPrme(number)==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not");
		}
	}

	private static boolean isPrme(int n) {
		if(n<2)
			return false;
		if(n==2)
			return true;
		for(int i=2; i<Math.sqrt(n);i++) {
			if (n%i==0) {
				return false;
		
			}else {
				return true;
			}
		}return false;
	}
}
