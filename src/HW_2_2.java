import java.util.Scanner;
public class HW_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial number:");
        int initial = scanner.nextInt();
        System.out.println("Enter end number:");
        int end = scanner.nextInt();
        for (int i = initial; i <= end; i++) {
            System.out.print("\t \t" + i);
        }
        System.out.println("\n");
        for (int a = initial; a <= end; a++) {
            System.out.print("--------");
        }
        System.out.println('\n');
        for (int j = initial; j <= end; j++) {
            System.out.print(j + "\t:");
            for (int i = initial; i <= end; i++) {
                System.out.print("\t" + (j * i) + "\t");
            }
            System.out.print("\n");
        }
    }
}




