package numberprograms;

public class NthPrimeNumbe {
	public static void main(String[] args) {
		int num=2,n=4,count=0;
		while(count<n) {
			if(isPrime(num)) {
				count++;
				if(count == n) {
					System.out.println(n+" Prime number is "+num);
				}
			}
		}num++;
	}

	private static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		if(num== 2||num==3) {
			return true;
		}
		if(num>3) {
			for(int i = 2; i<=Math.sqrt(num);i++) {
				if(num%i==0) 
					return false;
			
			}
		}
		return true;
	}
}
