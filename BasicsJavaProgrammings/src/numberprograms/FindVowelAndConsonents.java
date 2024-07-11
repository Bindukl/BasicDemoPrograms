package numberprograms;

public class FindVowelAndConsonents {
	public static void main(String[] args) {
		String s1= "SDhu8%^";
		char[] ch = s1.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' ||
					ch[i]=='e' || ch[i]=='i' || ch[i]=='u' || ch[i]=='o') {
				System.out.println("Vowels are "+ch[i]);
			}else if(ch[i]>'A' && ch[i] <='Z' || ch[i]>'a' && ch[i] <='z'){
				System.out.println("Consonents are "+ch[i]);
			}
			
		}
	}
}
