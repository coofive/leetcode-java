package math.lesson1;

import static math.lesson1.Example1.decimalToBinary;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-06-21 08:24
 */
public class Example3 {

    /**
     * @param num1- 第一个数字，num2- 第二个数字
     * @return 二进制按位“或”的结果
     * @Description: 二进制按位“或”的操作
     */
    public static int or(int num1, int num2) {

        return (num1 | num2);

    }

    /**
     * @param num1- 第一个数字，num2- 第二个数字
     * @return 二进制按位“与”的结果
     * @Description: 二进制按位“与”的操作
     */
    public static int and(int num1, int num2) {

        return (num1 & num2);

    }

    /**
     * @param num1- 第一个数字，num2- 第二个数字
     * @return 二进制按位“异或”的结果
     * @Description: 二进制按位“异或”的操作
     */

    public static int xor(int num1, int num2) {

        return (num1 ^ num2);

    }

    public static void main(String[] args) {

        int a = 53;
        int b = 35;

        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘或’结果是 %d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), or(a, b), decimalToBinary(or(a, b)))); // 获取十进制数 53 和 35 的按位“或”

        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘与’结果是 %d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), and(a, b), decimalToBinary(and(a, b))));  // 获取十进制数 53 和 35 的按位“与”

        System.out.println(String.format(" 数字 %d(%s) 和数字 %d(%s) 的按位‘异或’结果是 %d(%s)",
                a, decimalToBinary(a), a, decimalToBinary(a), xor(a, a), decimalToBinary(xor(a, a))));  // 获取十进制数 53 和 35 的按位“异或”


    }
}
