import java.util.Scanner;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200];
        int[] indexT = new int[200];
        int len = s.length();
        
        if (len != t.length()) {
            return false;
        }
        
        for (int i = 0; i < len; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String t = scanner.nextLine();
        
        Solution solution = new Solution();
        boolean result = solution.isIsomorphic(s, t);
        
        System.out.println("Are the strings isomorphic? " + result);
        
        scanner.close();
    }
}
