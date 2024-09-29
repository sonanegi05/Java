public class TestProgram{
	public static void triangle(int n) {
		for(int i = 1; i <= n ;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void invertedTriangle(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void rhombus(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void numberPyramid( int n) {
		/**
		 *      1
		 *     2 2
		 *    3 3 3
		 *   4 4 4 4
		 *  5 5 5 5 5
		 */
		for(int i=1; i<=n; i++){
			for(int k = n;k>i;k--){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++ ){
				System.out.print(i + " ");
			} 
			System.out.println();
		}
	}

	public static void palindromicNoPyramid(int n) {
		/*
		 *1      1
		 *2     212
		 *3    32123
		 *4   4321234
		 *5  543212345
		 */
		for(int i= 1; i<=n ; i++) {
			for(int l = n; l > i; l--) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) { 
				System.out.print(j);
			}
			for(int k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void main(String a[]){
		int n = 5;
		// triangle(n);
		// invertedTriangle(n);
		// rhombus(n)
		//numberPyramid(n);
		palindromicNoPyramid(n);
	}
}