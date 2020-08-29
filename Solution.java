import java.util.Scanner;

/**
 * 326. Power of Three https://leetcode.com/problems/power-of-three/
 */
public class Solution {


    /**
     * Determine if 'n'' is a power of three.
     */
    static boolean isPowerOfThree(int n) {
        
        // **** not a power of three ****
        if (n < 1)
            return false;

        // **** ****
        while ((n % 3) == 0) {
            n /= 3;
        }

        // **** ****
        return (n == 1) ? true : false;
    }


    /**
     * Find the value of the largest power of n.
     * The returned value could be used as a constant.
     * In that case this function would not be used.
     * 
     */
    static int findLargestPower(int n) {

        // **** initialization ****
        int r = 1;

        // **** loop until we get an overflow exception ****
        for (int i = 1; true; i++) {

            // **** ****
            try {
                r = Math.multiplyExact(r, n);
            } catch (ArithmeticException e) {

                // ???? ????
                // System.out.println("findLargestPower <<< EXCEPTION e: " + e);

                // **** return the larget power of n ****
                return r;
            }

            // ???? ????
            // System.out.println("findLargestPower <<< i: " + i + " r: " + r);
        }
    }


    // **** for easy access after computing ****
    static int largestPowerOf3              = 0;

    // **** as a constant ****
    static final int LARGEST_POWER_OF_3    = 1162261467;


    /**
     * Determine if 'n'' is a power of three.
     * Runs in O(1) time.
     */
    static boolean isPowerOf3(int n) {
        if (n < 1)
            return false;
        else
            return (n != 0) && (LARGEST_POWER_OF_3 % n == 0);
    }


    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {
        
        // **** generate largest power of 3 ****
        largestPowerOf3 = findLargestPower(3);

        // **** ****
        System.out.println("main <<< largestPowerOf3: " + largestPowerOf3);

        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // *** read integer ***
        int n = sc.nextInt();

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** close scanner ****
        sc.close();

        // **** check and display if integer is power of three ****
        System.out.println("main <<< " + isPowerOfThree(n));

        // **** check and display if integer is power of three ****
        System.out.println("main <<< " + isPowerOf3(n));
    }
}