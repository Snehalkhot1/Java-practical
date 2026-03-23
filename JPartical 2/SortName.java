import java.util.Arrays;
import java.util.Scanner;

public class SortName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("\nNames in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}