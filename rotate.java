import java.util.Scanner;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the original string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the goal string: ");
        String goal = scanner.nextLine();

        // Creating an object of Solution class
        Solution solution = new Solution();
        boolean result = solution.rotateString(s, goal);

        // Printing the result
        System.out.println("Is the goal string a rotated version of the original? " + result);

        scanner.close();
    }
}
