import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//        Expected Output :
//        Hello
//        Alexandra Abramov
//        System.out.println("Hello");
//        System.out.println("Alexandra Abramov");
        // --------------------------------------------
//        2. Write a Java program to print the sum of two numbers.
//        Test Data:
//        74 + 36
//        Expected Output :
//        110
//        System.out.println(74+36);
        // --------------------------------------------
//        3. Write a Java program to divide two numbers and print on the screen.
//        Test Data :
//        50/3
//        Expected Output :
//        16
//        int num = 50/3;
//        System.out.println(num);
        // --------------------------------------------
//        4. Write a Java program to print the result of the following operations.
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3
//        Expected Output :
//        43
//        1
//        19
//        13
//        int a = -5 + 8 * 6;
//        int b = (55+9) % 9;
//        int c = 20 + -3*5 / 8;
//        int d = 5 + 15 / 3 * 2 - 8 % 3;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        // --------------------------------------------
//        5. Write a Java program that takes two numbers as input and display the product of two numbers.
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = in.nextInt();
//        System.out.println(num1 + " x " + num2 + " = " + num1*num2);
        // --------------------------------------------
//        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = in.nextInt();
//        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
//        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
//        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
//        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
//        System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
        // --------------------------------------------
//        7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int num = in.nextInt();
//        for (int i = 1;i <= 10;i++){
//            System.out.println(num + " x " + i + " = " + num*i);
//        }
        // --------------------------------------------
//        8. Write a Java program to display the following pattern.
//        Sample Pattern :
//
//           J    a   v     v  a
//           J   a a   v   v  a a
//        J  J  aaaaa   V V  aaaaa
//         JJ  a     a   V  a     a
//        System.out.println("   J    a   v     v  a   ");
//        System.out.println("   J   a a   v   v  a a  ");
//        System.out.println("J  J  aaaaa   V V  aaaaa ");
//        System.out.println(" JJ  a     a   V  a     a");
        // --------------------------------------------
//        9. Write a Java program to compute the specified expressions and print the output.
//        Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//        Expected Output
//        2.138888888888889
//        double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//        System.out.println(num);
        // --------------------------------------------
//        10. Write a Java program to compute a specified formula.
//        Specified Formula :
//        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//        Expected Output
//        2.9760461760461765
//        double num = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(num);
        // --------------------------------------------
//        11. Write a Java program to print the area and perimeter of a circle.
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586
//        double radius = 7.5;
//        double perimeter = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);
        // --------------------------------------------
//        12. Write a Java program that takes three numbers as
//        input to calculate and print the average of the numbers.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Input third number: ");
//        int num3 = in.nextInt();
//        double avg = (num1+num2+num3)/3;
//        System.out.println("Average of " + num1 + "," + num2 + "," + num3 + " is " + avg);
        // --------------------------------------------
//        13. Write a Java program to print the area and perimeter of a rectangle.
//        Test Data:
//        Width = 5.5 Height = 8.5
//
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
//        double width = 5.5;
//        double height = 8.5;
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//        System.out.println("Area is " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter );
        // --------------------------------------------
//        14. Write a Java program to print an American flag on the screen. Go to the editor
//        Expected Output
//
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
        // --------------------------------------------
//        15. Write a Java program to swap two variables.
//        int a,b,c;
//        a = 10;
//        b = 2;
//        System.out.println("Before to swap variables: " + a + "," + b);
//        c = a;
//        a = b;
//        b = c;
//        System.out.println("After to swap variables: " + a + "," + b);
        // --------------------------------------------
//        16. Write a Java program to print a face.
//        Expected Output
//
//         +"""""+
//        [| o o |]
//         |  ^  |
//         | '-' |
//         +-----+
//        System.out.println(" +\"\"\"\"\"+ ");
//        System.out.println("[| o o |]");
//        System.out.println(" |  ^  | ");
//        System.out.println(" | '-' | ");
//        System.out.println(" +-----+");
        // --------------------------------------------
//        17. Write a Java program to add two binary numbers.
//        Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output
//
//        Sum of two binary numbers: 101
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print("\n");

//        int a=0b10;
//        int b=0b11;
//        int sum=a+b;
//        System.out.println("The sum of two binary no is:\n" + Integer.toBinaryString(sum));
        // --------------------------------------------
//        18. Write a Java program to multiply two binary numbers.
//        Input Data:
//        Input the first binary number: 10
//        Input the second binary number: 11
//        Expected Output
//
//        Product of two binary numbers: 110
//        long binary1, binary2, multiply = 0;
//        int digit, factor = 1;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input the second binary number: ");
//        binary2 = in.nextLong();
//        while (binary2 != 0)
//        {
//            digit = (int)(binary2 % 10);
//            if (digit == 1)
//            {
//                binary1 = binary1 * factor;
//                multiply = binaryproduct((int) binary1, (int) multiply);
//            }
//            else
//            {
//                binary1 = binary1 * factor;
//            }
//            binary2 = binary2 / 10;
//            factor = 10;
//        }
//        System.out.print("Product of two binary numbers: " + multiply+"\n");
//    }
//    static int binaryproduct(int binary1, int binary2)
//    {
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        int binary_prod_result = 0;
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
//            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0)
//        {
//            sum[i++] = remainder;
//        }
//        --i;
//        while (i >= 0)
//        {
//            binary_prod_result = binary_prod_result * 10 + sum[i--];
//        }
//        return binary_prod_result;

//        short a, b;
//        a = 0b10;
//        b = 0b11;
//
//        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(a*b));
        // --------------------------------------------
//        19. Write a Java program to convert a decimal number to binary number.
//        Input Data:
//        Input a Decimal Number : 5
//        Expected Output
//
//        Binary number is: 101

//        int dec_num, quot, i=1, j;
//        int bin_num[] = new int[100];
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Input a Decimal Number : ");
//        dec_num = scan.nextInt();
//
//        quot = dec_num;
//
//        while(quot != 0)
//        {
//            bin_num[i++] = quot%2;
//            quot = quot/2;
//        }
//
//        System.out.print("Binary number is: ");
//        for(j=i-1; j>0; j--)
//        {
//            System.out.print(bin_num[j]);
//        }
//        System.out.print("\n");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Input a decimal number: ");
//        int decimal = input.nextInt();
//        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
        // --------------------------------------------
//        20. Write a Java program to convert a decimal number to hexadecimal number.
//        Input Data:
//        Input a decimal number: 15
//        Expected Output
//
//        Hexadecimal number is : F

//        int dec_num,rem;
//        String hexdec_num = "";
//        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Input a decimal number: ");
//        dec_num = in.nextInt();
//
//        while (dec_num > 0){
//            rem = dec_num % 16;
//            System.out.println("rem: " + rem);
//            hexdec_num = hex[rem] + hexdec_num;
//            System.out.println("hexdec_num: " + hexdec_num);
//            dec_num = dec_num/16;
//            System.out.println("dec_num: " + dec_num);
//        }
//        System.out.println("Hexadecimal number is : " + hexdec_num + "\n");
        // --------------------------------------------
//        21. Write a Java program to convert a decimal number to octal number.
//        Input Data:
//        Input a Decimal Number: 15
//        Expected Output
//
//        Octal number is: 17

//        int num,rem;
//        char[] octal = {'0','1','2','3','4','5','6','7','8'};
//        String octal_num = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a decimal number: ");
//        num = in.nextInt();
//        while (num > 0){
//            rem = num % 8;
//            octal_num = octal[rem] + octal_num;
//            num = num /8;
//        }
//        System.out.println("Octal number is: " + octal_num);
        // --------------------------------------------
//        22. Write a Java program to convert a binary number to decimal number.
//        Input Data:
//        Input a binary number: 100
//        Expected Output
//
//        Decimal Number: 4
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a binary number: ");
//        String binaryNumber = in.nextLine();
//        int num = Integer.parseInt(binaryNumber,2);
//        System.out.println("Decimal Number: " + num);
        // --------------------------------------------
//        23. Write a Java program to convert a binary number to hexadecimal number.
//        Input Data:
//        Input a Binary Number: 1101
//        Expected Output
//
//        HexaDecimal value: D
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a binary number: ");
//        String binaryNumber = in.nextLine();
//        int decimalNumber = Integer.parseInt(binaryNumber,2);
//        String hexadecimalNumber = Integer.toHexString(decimalNumber);
//        System.out.println("Hexadecimal value: " + (hexadecimalNumber).toUpperCase());
        // --------------------------------------------
//        24. Write a Java program to convert a binary number to a Octal number.
//        Input Data:
//        Input a Binary Number: 111
//        Expected Output
//
//        Octal number: 7
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a binary number: ");
//        String binaryNum = in.nextLine();
//        int num = Integer.parseInt(binaryNum,2);
//        String octalNumber = Integer.toOctalString(num);
//        System.out.println("Octal number: " + octalNumber);
        // --------------------------------------------
//        25. Write a Java program to convert a octal number to a decimal number.
//        Input Data:
//        Input any octal number: 10
//        Expected Output
//
//        Equivalent decimal number: 8
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input any octal number: ");
//        String octalNumber = in.nextLine();
//        int decimalNumber = Integer.parseInt(octalNumber,8);
//        System.out.println("Equivalent decimal number: "  + decimalNumber);
        // --------------------------------------------
//        26. Write a Java program to convert a octal number to a binary number.
//        Input Data:
//        Input any octal number: 7
//        Expected Output
//
//        Equivalent binary number: 111
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input any octal number: ");
//        String octalNumber = in.nextLine();
//        int number = Integer.parseInt(octalNumber,8);
//        String binaryNumber = Integer.toBinaryString(number);
//        System.out.println("Equivalent binary number: " + binaryNumber);
        // --------------------------------------------
//        27. Write a Java program to convert a octal number to a hexadecimal number.
//        Input Data:
//        Input a octal number : 100
//        Expected Output
//
//        Equivalent hexadecimal number: 40
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a octal number: ");
//        String octalNumber = in.nextLine();
//        int decimalNumber = Integer.parseInt(octalNumber,8);
//        String hexNumber = Integer.toHexString(decimalNumber);
//        System.out.println("Equivalent hexadecimal number: " + hexNumber);
        // --------------------------------------------
//        28. Write a Java program to convert a hexadecimal to a decimal number.
//        Input Data:
//        Input a hexadecimal number: 25
//        Expected Output
//
//        Equivalent decimal number is: 37










    }

}