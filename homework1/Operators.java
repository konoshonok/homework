package homework1;

public class Operators {                            // Задание 1
    public static void main(String [] args){
        int a = 42;                     // 101010
        int b = 15;                     // 1111
        int c = -42;                    // 1 11010110
        int d = -15;                    // 1 11110001
        int e = 3;                      // 11
        System.out.println(~a);         // ~101010. Result = 1 11010101
        System.out.println(~b);         // ~1111. Result = 1 11110000
        System.out.println(~c);         // ~1 11010110. Result = 101001
        System.out.println(~d);         // ~1 11110001. Result = 1110
        System.out.println(a & b);      // 101010 & 1111. Result = 1010
        System.out.println(a &= b);     // 101010 &= 1111. Result = 1010
        System.out.println(c & d);      // 1 11010110 & 1 11110001. Result = 1 11010000
        System.out.println(c &= d);     // 1 11010110 &= 1 11110001. Result = 1 11010000

        a = 42;
        c = -42;
        System.out.println(a | b);      // 101010 | 1111. Result = 101111
        System.out.println(a |= b);     // 101010 |= 1111. Result = 101111
        System.out.println(c | d);      // 1 11010110 | 1 11110001. Result = 1 11110111
        System.out.println(c |= d);     // 1 11010110 |= 1 11110001. Result = 1 11110111

        a = 42;
        c = -42;
        System.out.println(a ^ b);      // 101010 ^ 1111. Result = 100101
        System.out.println(a ^= b);     // 101010 ^= 1111. Result = 100101
        System.out.println(c ^ d);      // 1 11010110 ^ 1 11110001. Result = 100111
        System.out.println(c ^= d);     // 1 11010110 ^= 1 11110001. Result = 100111

        a = 42;
        c = -42;
        System.out.println(a >> e);     // 101010 >> 11. Result = 101
        System.out.println(a >>= e);    // 101010 >>= 11. Result = 101
        System.out.println(b >> e);     // 1111 >> 11. Result = 1
        System.out.println(b >>= e);    // 1111 >>= 11. Result = 1
        System.out.println(c >> e);     // 1 11010110 >> 11. Result = 1 11111010
        System.out.println(c >>= e);    // 1 11010110 >>= 11. Result = 1 11111010
        System.out.println(d >> e);     // 1 11110001 >> 11. Result = 1 11111110
        System.out.println(d >>= e);    // 1 11110001 >>= 11. Result = 1 11111110

        a = 42;
        b = 15;
        c = -42;
        d = -15;
        System.out.println(a << e);     // 101010 << 11. Result = 101010000
        System.out.println(a <<= e);    // 101010 <<= 11. Result = 101010000
        System.out.println(b << e);     // 1111 << 11. Result = 1111000
        System.out.println(b <<= e);    // 1111 <<= 11. Result = 1111000
        System.out.println(c << e);     // 1 11010110 << 11. Result = 1 111010110000
        System.out.println(c <<= e);    // 1 11010110 <<= 11. Result = 1 111010110000
        System.out.println(d << e);     // 1 11110001 << 11. Result = 1 10001000
        System.out.println(d <<= e);    // 1 11110001 <<= 11. Result = 1 10001000

        a = 42;
        b = 15;
        c = -42;
        d = -15;
        System.out.println(a >>> e);    // 101010 >>> 11. Result = 101
        System.out.println(a >>>= e);   // 101010 >>>= 11. Result = 101
        System.out.println(b >>> e);    // 1111 >>> 11. Result = 1
        System.out.println(b >>>= e);   // 1111 >>>= 11. Result = 1
        System.out.println(c >>> e);    // 1 11010110 >>> 11. Result = 11111111111111111111111111010
        System.out.println(c >>>= e);   // 1 11010110 >>>= 11. Result = 11111111111111111111111111010
        System.out.println(d >>> e);    // 1 11110001 >>> 11. Result = 11111111111111111111111111110
        System.out.println(d >>>= e);   // 1 11110001 >>>= 11. Result = 11111111111111111111111111110
    }
}