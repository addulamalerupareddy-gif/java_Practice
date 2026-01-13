import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();
        

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("World");
        } else if (button == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Invalid button");
        }
       

        sc.close();
    }
}
