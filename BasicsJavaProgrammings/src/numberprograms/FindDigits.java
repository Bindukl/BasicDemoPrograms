package numberprograms;

public class FindDigits {
	public static void main(String[] args) {
		String s1="1231Kgf";
		String s2=null;
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='0' && ch[i]<='9') {
				System.out.print(ch[i]);
			}
			
		}
	}
}
