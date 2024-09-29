import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a != 0 && b != 0 && c != 0) {
            if (a==b && b==c) {
                System.out.println("This is an  Equilateral triangle");
            } else if(a==b || b==c || a==c) {
                System.out.println(" This is an iso triangle ");
            } else {
                System.out.println("this is an scalen triangle");
            }
        } else {
            System.out.println("Value found as '0'");
        }
    }  
}

    // aise hi chal gaya
    /*
    * ap syntax error kare ho if else me.... copy me likho aur check karao roj mujhe..... tab seekh paoge
 * oku love <3..
 * roj ke at least 5 questions..... minimum 5... max jitne ho sake utna... bahut simple question me 
 * error hori hai, to dikkat ki baat hai ye
 * :( ji padhai ....:| ji love maine kehan par galat kiya tha ????
 * oku or vo sc.nextint me bbji bhi errror dikha ra tha uska kya //. 
 * it was not an error, it was a warning. you can ignore warnings..
 * love
 * 
 *  yes yes 
 * 
 your phone is switched off
 * 
 */