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














    }

}