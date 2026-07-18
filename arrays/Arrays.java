import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 elements:");

        // Insert elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        // Print elements
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        sc.close();
    }
}