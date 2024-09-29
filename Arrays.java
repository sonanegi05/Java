import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int a[] = new int[n];

        // index: 0-9     0-(n-1)
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " number: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Length: " + a.length);

        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
        int j = 0;
        while(j < n) {
            System.out.println(a[j]);
            j++;
        }

        j = 0;
        do {
            System.out.println(" DO: " + a[j]);
            j++;
        } while(j<n);
    }
}