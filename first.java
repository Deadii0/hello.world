import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter a base:");
        int b = pr.nextInt();
        System.out.println("Enter a height:");
        int h = pr.nextInt();
        System.out.println("The area is " + 1.0/2*b*h);
    }
}
