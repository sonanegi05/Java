public class Recursion {
    // RECURSION
    /**
     * a method calling itself makes recursion
     * 
     * it includes BASE CASE 
     * (from where you can return)
     */
    static void print(int n) {
        if(n == 0)  return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}