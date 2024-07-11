package bindukl;

public class NewProject {
	
	public static void main(String[] args) {
		 int sum=0;
		  int x[]=new int[4];
		  x[0]=5;
		  x[1]=3;
		  x[2]=10;
		  x[3]=15;
		 for(int i=0;i<x.length;i++)
		 {
			 if(i%2==0)
				 sum=sum+x[i];
		 }
		 System.out.println(sum);
	
	     }

}
