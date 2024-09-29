import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println( "write a number \n  1 for student's marks \n  0 to stop");
            n = sc.nextInt();
            if(n == 1){
                System.out.println("enter student marks");
                int a = sc.nextInt();
                if( a >= 90){
                    System.out.println("This is good");
                }
                else if( a >= 60 ){
                    System.out.println("This is also Good ");
                }
                else if( a>=0){
                    System.out.println("This is Good as well ");
                }
            }
        } while(n != 0);
    }
}
        
        
    
    

