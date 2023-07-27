import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PrintService<Integer> ps = new PrintService<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);

        }

        ps.print();
        System.out.println("First: " + ps.first());
        sc.close();

    }
}