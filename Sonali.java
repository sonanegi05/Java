public class Sonali {
	public int a;
	private int b;

	public void hello() {
		b=0;
		System.out.println("Hello from chonu");
	}

	public static void main (String[] args) {
	    int a = 15;
	    int b = 11;
	    int c = 3;
	    String surName = "Sonali Negi";
	    System.out.println("Length of surName: " + surName.length());
	    
	    // Logical Operators
	    //
	    /* AND -> && (All statements should be true) */
	    /* OR -> || (any one statements should be true) */
	    
	    /**
	     * Comparison Operators
	     * 
	     * > Greater Than
	     * < Less Than
         * == Equal To
	     */
	    
	    System.out.println("Boolean: " + (a == b));
	    if (c > b || (a == b && false) ) {
	        System.out.println("bhoo");
	    } else if (a > b && c < b) {
	        System.out.println("demnnn");
	    } else {
	        System.out.println("chonu");
	    }
	    
	    System.out.println("CODE ENDED RIGHT HERE...");
	}
}