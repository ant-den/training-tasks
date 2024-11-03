import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int target;

        System.out.println("Enter 5 positive integers for the array:");
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Number " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    int input = sc.nextInt();
                    if (input > 0) {
                        nums[i] = input;
                        break;
                    } else {
                        System.out.println("Please enter a positive integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); // Clear invalid input
                }
            }
        }

        
        System.out.print("Enter the target integer: ");
        while (true) {
            if (sc.hasNextInt()) {
                target = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear invalid input
            }
        }

       
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of numbers that add up to target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; 
    }
}
