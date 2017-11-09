import java.util.Scanner;
/**
 * @author jackdaw14-9
 * @version 1.0 dated 10/08/2017
 */
 /**
 * Binary Exponentiation
 * for powering two numbers.
 * also useful for calculating - (a^b) % c
 */
public class binary_expo_I
{
    public static int b_expo(int a, int b)
    {
        /*
         * iterative solution
         */
        int res;
        for (res = 1; b > 0; a *= a, b >>= 1) {
            if ((b&1) == 1) {
                res *= a;
            }
        }
        return res;
        /*
         * recursive solution
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if ((b & 1) == 1) {
            return a * b_expo(a*a, b >> 1);
        } else {
            return b_expo (a*a, b >> 1);
        }
        */
    }
    public static long b_expo(long a, long b, long c)
    {
        /*
         * iterative solution
         */
        long res;
        for (res = 1l; b > 0; a *=a, b >>= 1) {
            if ((b&1) == 1) {
                res = ((res%c) * (a%c)) % c;
            }
        }
        return res;
        /*
         * recursive solution
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if ((b & 1) == 1) {
            return ((a%c) * (b_expo(a*a, b >> 1)%c))%c;
        } else {
            return b_expo (a*a, b >> 1)%c;
        }
        */
    }
}
