package PatternPrograme;

import java.util.Iterator;

public class LeftTriangle {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		
	int n=5;
//		for(int i=0; i<=n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
	
//	---------------------------------------------------------
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
//	for(int i=0; i<=n; i++) {
//		for(int j=i; j<=n; j++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//	}
//	--------------------------------------------------------------------
	
//	  * * * * 
//	    * * * 
//	      * * 
//	        * 
//	for(int i=0; i<=n; i++) {
//		for(int j=0; j<=n; j++) {
//			if(j<=i)
//			System.out.print("  ");
//			else
//				System.out.print("* ");
//		}
//		System.out.println("");
//	}
//	---------------------------------------------------------------
	
//	  * * * * 
//	  *   * * * 
//	  * *   * * 
//	  * * *   * 
//	  * * * *     
//	for(int i=0; i<=n; i++) {
//		for(int j=0; j<=n; j++) {
//			if(j==i)
//			System.out.print("  ");
//			else
//				System.out.print("* ");
//		}
//		System.out.println("");
//	}
//      -------------------------------------------------------
	
//           * 
//         * * 
//       * * * 
//     * * * * 
//   * * * * *
//	for(int i=n; i>=0; i--) {
//		for(int j=0; j<=n; j++) {
//			if(j<i)
//			System.out.print("  ");
//			else
//				System.out.print("* ");
//		}
//		System.out.println("");
//	}
//	-------------------------------------------------------------
	
//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * * 
//	for(int i=n; i>=0; i--) {
//		for(int j=0; j<=n; j++) {
//			if(j<i)
////				print a single space 
//			System.out.print(" ");
//			else
//				System.out.print("* ");
//		}
//		System.out.println("");
//	}
//	-----------------------------------------------------------------
	
//	* * * * * * 
//	 * * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     * 
	for(int i=n; i>=0; i--) {
		for(int j=0; j<=n; j++) {
			if(j+i>=n)
//				print a single space 
			System.out.print("* ");
			else
				System.out.print(" ");
		}
		System.out.println("");
	}
	
	
	
	}
}
