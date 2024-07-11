package numberprograms;

public class ReverseNumber {
public static void main(String[] args) {
	int number= 2132;
	System.out.println(reverseNum(number));
}
private static int reverseNum(int num) {
	int rev=0;
	while (num!=0) {
		rev=rev*10+num%10;
		num= num/10;
	}return rev;
	}
}
