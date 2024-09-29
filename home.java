import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            int b = sc.nextInt("write second no.S");

            int operator = sc.nextInt(); 
            System.out.println("Select an Operator" + 
                "1 =  + (Addition) a + b" +
                "2 =  - (Subtraction) a - b" +
                "3 =  * (Multiplication) a * b" +
                "4 = / (Division) a / b" +
                "5 = % (Modulo or remainder) a % b");
                switch (operator) {
                    case 1: a+b
                        break;
                    case 2: a-b
                        break;
                    case 3: a*b
                        break;
                    case 4: a/b
                        break;
                    case 5: a%b
                        break;
                
                    default:System.out.println("invalid operator");
                        break;
                }



            
            

            }

    }
    

