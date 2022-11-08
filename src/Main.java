
import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a hexadecimal number: ");
//        String hexNumber = in.nextLine();
//        int number = Integer.parseInt(hexNumber,16);
//        System.out.println("Equivalenct decimal number is : " + number);
        // --------------------------------------------
//        29. Write a Java program to convert a hexadecimal to a binary number.
//        Input Data:
//        Enter Hexadecimal Number : 37
//        Expected Output
//
//        Equivalent Binary Number is: 110111
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Hexadecimal number: ");
//        String hexNumber = in.nextLine();
//        int number = Integer.parseInt(hexNumber,16);
//        String binaryNumber = Integer.toBinaryString(number);
//        System.out.println("Equivalent Binary Number is: " + binaryNumber);
        // --------------------------------------------
//        30. Write a Java program to convert a hexadecimal to a octal number.
//        Input Data:
//        Input a hexadecimal number: 40
//        Expected Output
//
//        Equivalent of octal number is: 100
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a hexadecimal number: ");
//        String hexadecimalNumber = in.nextLine();
//        int number = Integer.parseInt(hexadecimalNumber,16);
//        String octalNumber = Integer.toOctalString(number);
//        System.out.println("Eqquivalent of octal number is: " + octalNumber);
        // --------------------------------------------
//        31. Write a Java program to check whether Java is installed on your computer.
//        Expected Output
//
//        Java Version: 1.8.0_71
//        Java Runtime Version: 1.8.0_71-b15
//        Java Home: /opt/jdk/jdk1.8.0_71/jre
//        Java Vendor: Oracle Corporation
//        Java Vendor URL: http://Java.oracle.com/
//        Java Class Path: .
//        System.out.println("Java Version: " + System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: " + System.getProperty("java.home"));
//        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        // --------------------------------------------
//        32. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first integer: ");
//        int num1 = in.nextInt();
//        System.out.println("Input second integer: ");
//        int num2 = in.nextInt();
//        if(num1 < num2){
//            System.out.println(num1 + " != " + num2);
//            System.out.println(num1 + " < " + num2);
//            System.out.println(num1 + " <= " + num2);
//        } else if (num1 == num2) {
//            System.out.println(num1 + " = " + num2);
//        }else{
//            System.out.println(num1 + " > " + num2);
//        }
        // --------------------------------------------
//        33. Write a Java program and compute the sum of the digits of an integer.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7
//        long sum = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input an integer: ");
//        long num = in.nextInt();
//        while (num != 0){
//            sum = num%10 + sum;
//            num /= 10;
//        }
//        System.out.println("The sum of the digits is: " + sum);
        // --------------------------------------------
//        34. Write a Java program to compute the area of a hexagon.
//        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//        where s is the length of a side
//        Input Data:
//        Input the length of a side of the hexagon: 6
//        Expected Output
//
//        The area of the hexagon is: 93.53074360871938
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the length of a side of the hexagon: ");
//        double s = in.nextDouble();
//        double areaOfHexagon = (6*(s*s))/(4*Math.tan(Math.PI/6));
//        System.out.println("The area of the hexagon is: " + areaOfHexagon);
        // --------------------------------------------
//        35. Write a Java program to compute the area of a polygon.
//        Area of a polygon = (n*s^2)/(4*tan(π/n))
//        where n is n-sided polygon and s is the length of a side
//        Input Data:
//        Input the number of sides on the polygon: 7
//        Input the length of one of the sides: 6
//        Expected Output
//
//        The area is: 130.82084798405722
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the number of sides on the polygon: ");
//        int ns = in.nextInt();
//        System.out.println("Input the length of one of the sides: ");
//        double side = in.nextDouble();
//        double areaOfPolygon = (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
//        System.out.println("The area is: " + areaOfPolygon);
        // --------------------------------------------
//        36. Write a Java program to compute the distance between two points on the surface of earth.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
//        Expected Output
//
//        The distance between those points is: 1480.0848451069087 km
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input latitude of cordinate1 : ");
//        double x1 = sc.nextDouble();
//        System.out.print("Input longitude of cordinate1 : ");
//        double y1 = sc.nextDouble();
//        System.out.print("Input latitude of cordinate2 : ");
//        double x2 = sc.nextDouble();
//        System.out.print("Input latitude of cordinate2 : ");
//        double y2 = sc.nextDouble();
//
//        double lat1 = Math.toRadians(x1);
//        double long1 = Math.toRadians(y1);
//        double lat2 = Math.toRadians(x2);
//        double long2 = Math.toRadians(y2);
//        double d = 6371.01 * Math.acos((Math.sin(lat1)*Math.sin(lat2))+(Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2)));
//        System.out.println("The distance between those point is : "+d);
        // --------------------------------------------
//        37. Write a Java program to reverse a string.
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a string: ");
//        String str = in.nextLine();
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
        // --------------------------------------------
//        38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
//        Expected Output
//
//        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//        letter: 23
//        space: 9
//        number: 10
//        other: 6
//        int letter = 0;
//        int space = 0;
//        int num = 0;
//        int other = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str = in.nextLine();
//        char[] ch = str.toCharArray();
//        for (int i = 0; i< str.length(); i++){
//            if (Character.isLetter(ch[i])){
//                letter++;
//            } else if (Character.isSpaceChar(ch[i])) {
//                space++;
//            } else if (Character.isDigit(ch[i])) {
//                num++;
//            }else{
//                other++;
//            }
//        }
//        System.out.println("letter: " + letter);
//        System.out.println("space: " + space);
//        System.out.println("number: " + num);
//        System.out.println("other: " + other);
        // --------------------------------------------
//        39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
//        Expected Output
//
//        123
//        124
//        ...
//
//        431
//        432
//        Total number of the three-digit-number is 24
//        int threeDigitNumberCount = 0;
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= 4; j++){
//                for(int k = 1; k <= 4; k++){
//                    if(k != i && k != j && i != j){
//                        threeDigitNumberCount++;
//                        System.out.println(i + "" + j + "" + k);
//                    }
//                }
//            }
//        }
//        System.out.println("Total number of three-digit-number is " + threeDigitNumberCount);
        // --------------------------------------------
//        40. Write a Java program to list the available character sets in charset objects.
//        Expected Output
//
//        List of available character sets:
//        Big5
//        Big5-HKSCS
//        CESU-8
//        EUC-JP
//        EUC-KR
//        GB18030
//                GB2312
//        GBK
//
//        ...
//
//        x-SJIS_0213
//        x-UTF-16LE-BOM
//        X-UTF-32BE-BOM
//        X-UTF-32LE-BOM
//        x-windows-50220
//        x-windows-50221
//        x-windows-874
//        x-windows-949
//        x-windows-950
//        x-windows-iso2022jp
//        System.out.println("List of available character sets: ");
//        for (String str : Charset.availableCharsets().keySet()){
//            System.out.println(str);
//        }
        // --------------------------------------------
//        41. Write a Java program to print the ascii value of a given character.
//        Expected Output
//
//        The ASCII value of Z is :90
//        int chr = 'Z';
//        System.out.println("The ASCII value of Z is: " + chr);
        // --------------------------------------------
//        43. Write a Java program to print the following string in a specific format (see the output).
//        Sample Output
//
//        Twinkle, twinkle, little star,
//                How I wonder what you are!
//                        Up above the world so high,
//                        Like a diamond in the sky.
//        Twinkle, twinkle, little star,
//                How I wonder what you are
//        System.out.println("Twinkle, twinkle, little star," +
//                "\n\t\tHow I wonder what you are!" +
//                "\n\t\t\tUp above the world so high," +
//                "\n\t\t\tLike a diamond in the sky." +
//                "\nTwinkle, twinkle, little star," +
//                "\n\t\tHow I wonder what you are");
        // --------------------------------------------
//        44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//        Sample Output:
//
//        Input number: 5
//        5 + 55  + 555
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the integer number: ");
//        int n = in.nextInt();
//        System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
        // --------------------------------------------
//        45. Write a Java program to find the size of a specified file.
//        Sample Output:
//
//        /home/students/abc.txt  : 0 bytes
//            /home/students/test.txt : 0 bytes
//        String pathFile = "C:\\Users\\tf\\JavaProjects\\test.txt";
//        File file = new File(pathFile);
//        if (file.exists()){
//            System.out.println(file.getAbsolutePath() + ": " + file.length());
//        }
        // --------------------------------------------
//        46. Write a Java program to display the system time.
//        Sample Output:
//
//        Current Date time: Fri Jun 16 14:17:40 IST 2017
//        Date d = new Date();
//        System.out.println("Current datetime is: " + d);
        // --------------------------------------------
//        47. Write a Java program to display the current date time in specific format.
//        Sample Output:
//
//        Now: 2017/06/16 08:52:03.066
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
        // --------------------------------------------
//        48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go
//        Sample Output:
//
//        1
//        3
//        5
//        7
//        9
//        11
//        ....
//
//        91
//        93
//        95
//        97
//        99
//        for (int i = 1; i < 100; i++){
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
        // --------------------------------------------
//        49. Write a Java program to accept a number and check the number is even
//        or not. Prints 1 if the number is even or 0 if the number is odd.
//        Sample Output:
//
//        Input a number: 20
//        1
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int num = in.nextInt();
//        if (num % 2 == 0){
//            System.out.println(1);
//        }else{
//            System.out.println(0);
//        }
        // --------------------------------------------
//        50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
//        Sample Output:
//
//        Divided by 3:
//        3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//                , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
//
//        Divided by 5:
//        5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
//                95,
//
//        Divided by 3 & 5:
//        15, 30, 45, 60, 75, 90,
//        System.out.println("Divided by 3: ");
//        for (int i = 0;i < 100;i++){
//            if (i % 3 == 0){
//                System.out.print(i + ",");
//            }
//        }
//        System.out.println("\nDivided by 5: ");
//        for (int i = 0;i < 100;i++){
//            if (i % 5 == 0){
//                System.out.print(i + ",");
//            }
//        }
//        System.out.println("\nDivided by 3 & 5: ");
//        for (int i = 0;i < 100;i++){
//            if (i % 3 == 0 && i % 5 ==0){
//                System.out.print(i + ",");
//            }
//        }
        // --------------------------------------------
//        51. Write a Java program to convert a string to an integer in Java.
//        Sample Output:
//
//        Input a number(string): 25
//        The integer value is: 25
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a number(String): ");
//        String num = in.nextLine();
//        int intNumber = Integer.parseInt(num);
//        System.out.println("The integer value is: " + intNumber);
        // --------------------------------------------
//        52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Input the third number: ");
//        int num3 = in.nextInt();
//        if (num1 + num2 == num3){
//            System.out.println("The result is: ture");
//        }else{
//            System.out.println("The result is: false");
//        }
        // --------------------------------------------
//        53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Input the third number: ");
//        int num3 = in.nextInt();
//        System.out.println("The result is: " + test(num1,num2,num3,true));
        // --------------------------------------------
//        54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Input the third number: ");
//        int num3 = in.nextInt();
//        System.out.println("The result is: " + test54(num1,num2,num3));
        // --------------------------------------------
//        55. Write a Java program to convert seconds to hour, minute and seconds.
//        Sample Output:
//
//        Input seconds: 86399
//        23:59:59
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input second: ");
//        int second = in.nextInt();
//        int s = second % 60;
//        int minutes = second / 60;
//        int m = minutes % 60;
//        int hour = minutes / 60;
//        int h = hour % 24;
//        int day = hour / 24;
//        int d = day % 365;
//        int year = day / 365;
//        System.out.print(year + " year " + d + " day " + h + ":" + m + ":" + s);
        // --------------------------------------------
//        56. Write a Java program to find the number of values in a given range divisible by a given value.
//        For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//        Sample Output:
//
//        5
//        Scanner in = new Scanner(System.in);
//        System.out.println("Range minimum: ");
//        int minimum = in.nextInt();
//        System.out.println("Range maximum: ");
//        int maximum = in.nextInt();
//        System.out.println("Div: ");
//        int div = in.nextInt();
//        for (int i = minimum + 1; i < maximum; i++) {
//            if (i % div == 0) {
//                System.out.println(i + ",");
//            }
//        }
        // --------------------------------------------
//        57. Write a Java program to accepts an integer and count the factors of the number.
//        Sample Output:
//
//        Input an integer: 25
//        3
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input and integer: ");
//        int num = in.nextInt();
//        int count = 0;
//        for (int i = 1;i <= num; i++){
//            if (num % i == 0){
//                count++;
//            }
//        }
//        System.out.println(count);
        // --------------------------------------------
//        58. Write a Java program to capitalize the first letter of each word in a sentence.
//        Sample Output:
//
//        Input a Sentence: the quick brown fox jumps over the lazy dog.
//        The Quick Brown Fox Jumps Over The Lazy Dog.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a Sentence: ");
//        String word = "";
//        StringBuffer sb = new StringBuffer();
//        String str = in.nextLine();
//        String[] stringArray = str.split(" ");
//        for (String s: stringArray){
//            word = s.substring(0,1).toUpperCase() + s.substring(1,s.length()) + " ";
//            sb.append(word);
//        }
//        System.out.println(sb);
        // --------------------------------------------
//        59. Write a Java program to convert a given string into lowercase.
//        Sample Output:
//
//        Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//        the quick brown fox jumps over the lazy dog.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a String: ");
//        String lowerStr = in.nextLine().toLowerCase();
//        System.out.println(lowerStr);
        // --------------------------------------------
//        60. Write a Java program to find the penultimate (next to last) word of a sentence.
//        Sample Output:
//
//        Input a String: The quick brown fox jumps over the lazy dog.
//        Penultimate word: lazy
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a String: ");
//        String str = in.nextLine();
//        String[] stringArray = str.split(" ");
//        String penultimateWord = stringArray[stringArray.length -2];
//        System.out.println(penultimateWord);
        // --------------------------------------------
//        61. Write a Java program to reverse a word. Go to the editor
//        Sample Output:
//
//        Input a word: dsaf
//        Reverse word: fasd
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a word: ");
//        String str = in.nextLine();
//        StringBuffer sb = new StringBuffer();
//        sb.append(str).reverse().toString();
//        System.out.println(sb);
        // --------------------------------------------
//        62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.
//        Sample Output:
//
//        Input the first number : 15
//        Input the second number: 20
//        Input the third number : 25
//        false
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Input the third number: ");
//        int num3 = in.nextInt();
//        System.out.println((Math.abs(num1 - num2) >= 20 || Math.abs(num2 - num3) >= 20 || Math.abs(num3 - num1) >= 20));
        // --------------------------------------------
//        63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6. Go to the editor
//        Sample Output:
//
//        Input the first number : 12
//        Input the second number: 13
//        Result: 13
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Result: " + test63(num1,num2));
        // --------------------------------------------
//        64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
//        Sample Output:
//
//        Input the first number : 35
//        Input the second number: 45
//        Result: true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println("Result: " + test64(num1,num2));
        // --------------------------------------------
//        65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
//        Sample Output:
//
//        Input the first number : 19
//        Input the second number: 7
//        5
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int num1 = in.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = in.nextInt();
//        System.out.println(test65(num1,num2));
        // --------------------------------------------
//        66. Write a Java program to compute the sum of the first 100 prime numbers.
//        Sample Output:
//
//        Sum of the first 100 prime numbers: 24133
//        int sum = 2;
//        int count = 1;
//        for (int i = 3; count < 100; i += 2){
//            if (test66(i)){
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println("Sum of the first 100 prime numbers: " + sum);
        // --------------------------------------------
//        67. Write a Java program to insert a word in the middle of the another string.
//        Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
//        Sample Output:
//
//        Python Tutorial 3.0
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a string: ");
//        String str = in.nextLine();
//        String[] strArray = str.split(" ");
//        StringBuffer sb = new StringBuffer();
//        for (String s: strArray){
//            if (s != strArray[strArray.length -1]){
//                sb.append(s + " Tutorial ");
//            }else{
//                sb.append(s);
//            }
//        }
//        System.out.println(sb.toString());
        // --------------------------------------------
//        68. Write a Java program to create a new string of 4 copies
//        of the last 3 characters of the original string. The length
//        of the original string must be 3 and above.
//        Sample Output:
//
//        3.03.03.03.0
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str = in.nextLine();
//        String lastThreeChar = str.substring(str.length() -3);
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < 4; i++){
//            sb.append(lastThreeChar);
//        }
//        System.out.println(sb.toString());
        // --------------------------------------------
//        69. Write a Java program to extract the first half of a string of even length.
//        Test Data: Python
//        Sample Output:
//        Pyt
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str = in.nextLine();
//        String firstHalfStr = str.substring(0,(str.length() / 2));
//        System.out.println(firstHalfStr);
        // --------------------------------------------
//        70. Write a Java program to create a string in the form
//        short_string + long_string + short_string from two strings.
//        The strings must not have the same length.
//        Test Data: Str1 = Python
//        Str2 = Tutorial
//        Sample Output:
//
//        PythonTutorialPython
//        String finalString = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your first string: ");
//        String str1 = in.nextLine();
//        System.out.println("Input your second string: ");
//        String str2 = in.nextLine();
//        if (str1.length() == str2.length()){
//            System.out.println("The strings must not have the same length");
//        }else {
//            if (str1.length() > str2.length()){
//                finalString = str2 + str1 + str2;
//            }else{
//                finalString = str1 + str2 + str1;
//            }
//        }
//        System.out.println(finalString);
        // --------------------------------------------
//        71. Write a Java program to create the concatenation of the
//        two strings except removing the first character of each string.
//        The length of the strings must be 1 and above.
//        Test Data: Str1 = Python
//        Str2 = Tutorial
//        Sample Output:
//
//        ythonutorial
//        String newString = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input first string:");
//        String str1 = in.nextLine();
//        System.out.println("Input your second string: ");
//        String str2 = in.nextLine();
//        str1 = str1.substring(1);
//        str2 = str2.substring(1);
//        newString = str1 + str2;
//        System.out.println(newString);
        // --------------------------------------------
//        72. Write a Java program to create a new string taking first three characters
//        from a given string. If the length of the given string is less than 3 use "#"
//        as substitute characters.
//        Test Data: Str1 = " "
//        Sample Output:
//
//        ###
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str = in.nextLine();
//        StringBuffer sb = new StringBuffer();
//        if (str.length() < 4){
//            for (int i = 0 ; i < str.length(); i++){
//                sb.append("#");
//            }
//        }else{
//            sb.append(str);
//        }
//        System.out.println(sb.toString());
        // --------------------------------------------
//        73. Write a Java program to create a new string taking
//        first and last characters from two given strings.
//        If the length of either string is 0 use "#" for missing character.
//        Test Data: str1 = "Python"
//        str2 = " "
//        Sample Output:
//
//        P#
//        String newString = "";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str1 = in.nextLine();
//        System.out.println("Input your second string: ");
//        String str2 = in.nextLine();
//        if (str1.length() == 0 || str2.length() == 0){
//            if (str1.length() > str2.length()){
//                str1 = str1.substring(0,1);
//                str2 = "#";
//            }else {
//                str2 = str2.substring(0,1);
//                str1 = "#";
//            }
//        }
//        newString = str1 + str2;
//        System.out.println(newString);
        // --------------------------------------------
//        74. Write a Java program to test if 10 appears as either
//        the first or last element of an array of integers.
//        The length of the array must be greater than or equal to 2.
//        Sample Output:
//        Test Data: array = 10, -20, 0, 30, 40, 60, 10
//
//        true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store: ");
//        int n = in.nextInt();
//        int[] intArray = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Result: " + test74(intArray));
        // --------------------------------------------
//        75. Write a Java program to test if the first and the last element
//        of an array of integers are same. The length of the array must be greater
//        than or equal to 2.
//        Test Data: array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output:
//
//        false
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store: ");
//        int n = in.nextInt();
//        int[] intArray = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Result: " + test74(intArray));
        // --------------------------------------------
//        76. Write a Java program to test if the first or the last element
//        of two array of integers are same.
//        The length of the array must be greater than or equal to 2.
//        Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
//        array2 = 45, 20, 10, 20, 30, 50, 11
//        Sample Output:
//
//        false
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for first array: ");
//        int firstArrayLength = in.nextInt();
//        System.out.println("Enter the elements of the first array: ");
//        int[] firstArray = new int[firstArrayLength];
//        for (int i = 0; i < firstArrayLength; i++){
//            firstArray[i] = in.nextInt();
//        }
//        System.out.println("Enter the number of elements you want to store for second array: ");
//        int secondArrayLength = in.nextInt();
//        System.out.println("Enter the elements of the second array: ");
//        int[] secondArray = new int[secondArrayLength];
//        for (int i = 0; i < secondArrayLength; i++){
//            secondArray[i] = in.nextInt();
//        }
//        System.out.println(test76(firstArray,secondArray));
        // --------------------------------------------
//        77. Write a Java program to create a new array of length 2 from
//        two arrays of integers with three elements and the new array will contain
//        the first and last elements from the two arrays.
//        Test Data: array1 = 50, -20, 0
//        array2 = 5, -50, 10
//        Sample Output:
//
//        Array1: [50, -20, 0]
//        Array2: [5, -50, 10]
//        New Array: [50, 10]
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for first array: ");
//        int firstArrayLength = in.nextInt();
//        System.out.println("Enter the elements of the first array: ");
//        int[] firstArray = new int[firstArrayLength];
//        for (int i = 0; i < firstArrayLength; i++){
//            firstArray[i] = in.nextInt();
//        }
//        System.out.println("Enter the number of elements you want to store for first array: ");
//        int secondArrayLength = in.nextInt();
//        System.out.println("Enter the elements of the first array: ");
//        int[] secondArray = new int[secondArrayLength];
//        for (int i = 0; i < secondArrayLength; i++){
//            secondArray[i] = in.nextInt();
//        }
//        System.out.println(test77(firstArray,secondArray) == null ? "Invalid array" : Arrays.toString(test77(firstArray,secondArray)));
        // --------------------------------------------
//        78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
//        Sample Output:
//
//        Original Array: [5, 7]
//        true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println(test78(intArray));
        // --------------------------------------------
//        79. Write a Java program to rotate an array (length 3) of integers in left direction.
//        Sample Output:
//
//        Original Array: [20, 30, 40]
//        Rotated Array: [30, 40, 20]
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Rotate Array: " + Arrays.toString(test79(intArray)));
        // --------------------------------------------
//        80. Write a Java program to get the larger value between first and last element
//        of an array (length 3) of integers .
//        Sample Output:
//
//        Original Array: [20, 30, 40]
//        Larger value between first and last element: 40
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Larger value between first and last elements: " + test80(intArray));
        // --------------------------------------------
//        81. Write a Java program to swap the first
//        and last elements of an array (length must be at least 1) and create a new array.
//        Sample Output:
//
//        Original Array: [20, 30, 40]
//        New array after swapping the first and last elements: [40, 30, 20]
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(test81(intArray)));
        // --------------------------------------------
//        82. Write a Java program to find the largest element between first, last,
//        and middle values from an array of integers (even length).
//        Sample Output:
//
//        Original Array: [20, 30, 40, 50, 67]
//        Largest element between first, last, and middle values: 67
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Largest element between first, last and middle values: " + test82(intArray));
        // --------------------------------------------
//        83. Write a Java program to multiply corresponding elements of two arrays of integers.
//        Sample Output:
//
//        Array1: [1, 3, -5, 4]
//
//        Array2: [1, 4, -5, -2]
//
//        Result: 1 12 25 -8
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            intArray[i] = in.nextInt();
//        }
//        System.out.println("Enter the number of elements you want to store for array: ");
//        int n2 = in.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int[] intArray2 = new int[n2];
//        for (int i = 0; i < n; i++) {
//            intArray2[i] = in.nextInt();
//        }
//        System.out.println("Result: " + Arrays.toString(test83(intArray,intArray2)));
        // --------------------------------------------
//        84. Write a Java program to take the last three characters
//        from a given string and add the three characters at both the front and back of the string.
//        String length must be greater than three and more.
//        Test data: "Python" will be "honPythonhon"
//        Sample Output:
//
//        honPythonhon
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input string: ");
//        String str = in.nextLine();
//        String newString = str.substring(2);
//        str = newString + str + newString;
//        System.out.println(str);
        // --------------------------------------------
//        85. Write a Java program to check if a string starts with a specified word.
//        Sample Data: string1 = "Hello how are you?"
//        Sample Output:
//
//        true
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your string: ");
//        String str = in.nextLine();
//        String[] newStringArray = str.split(" ");
//        System.out.println(test85(newStringArray));
        // --------------------------------------------
//        86. Write a Java program start with an integer n, divide n by 2
//        if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = in.nextInt();
//        test86(n);
        // --------------------------------------------
//        87. Write a Java program than read an integer and calculate the sum of its digits
//        and write the number of each digit of the sum in English.
//        int n = 9382748;
//        System.out.println("Result: " + test87(n));
        // --------------------------------------------
//        88. Write a Java program to get the current system environment and system properties.
//        System.out.println(System.getenv());
//        System.out.println(System.getProperties());
        // --------------------------------------------
//        89. Write a Java program to check whether a security manager
//        has already been established for the current application or not.
//        System.out.println("System security interface: ");
//        System.out.println(System.getSecurityManager());
        // --------------------------------------------
//        90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
//        System.out.println("\nEnvironment variable PATH: ");
//        System.out.println(System.getenv("PATH"));
//        System.out.println("\nEnvironment variable TEMP: ");
//        System.out.println(System.getenv("TEMP"));
//        System.out.println("\nEnvironment variable USERNAME: ");
//        System.out.println(System.getenv("USERNAME"));
        // --------------------------------------------
//        91. Write a Java program to measure how long some code takes to execute in nanoseconds.
//        long startTime = System.nanoTime();
//        int i;
//        for (i = 1;i <= 10; i++){
//            System.out.println(i);
//        }
//        long estimatedTime = System.nanoTime() - startTime;
//        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);
        // --------------------------------------------
//        92. Write a Java program to count the number of even and odd elements in a given array of integers.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the size of array you want: ");
//        int n = in.nextInt();
//        int[] intArray = new int[n];
//        System.out.println("Input the numbers you want store the array: ");
//        for (int i = 0; i < n; i++){
//            intArray[i] = in.nextInt();
//        }
//        test92(intArray);
        // --------------------------------------------
//        93. Write a Java program to test if an array of integers contains an element
//        10 next to 10 or an element 20 next to 20, but not both.


































































    }

    public static boolean test(int num1, int num2, int num3, boolean bl) {
        if (bl) {
            return (num3 > num2);
        }
        return (num3 > num2 && num2 > num1);
    }

    public static boolean test54(int num1, int num2, int num3) {
        return (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num3 % 10 == num1 % 10);
    }

    public static int test63(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 % 6 == num2 % 6) {
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        } else {
            if (num1 < num2) {
                return num2;
            } else {
                return num1;
            }
        }
    }

    public static boolean test64(int num1, int num2) {
        if (num1 < 75 && num1 > 25 && num2 < 75 && num2 > 25) {
            if (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 / 10 == num2 / 10) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int test65(int num1, int num2) {
        if (num1 > num2) {
            int times = num1 / num2;
            return num1 - (num2 * times);
        } else {
            int times = num2 / num1;
            return num2 - (num1 * times);
        }
    }

    public static boolean test66(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean test74(int[] intArray) {
        if (intArray.length < 2) {
            return false;
        } else if (intArray[0] == 10 && intArray[intArray.length - 1] == 10) {
            return true;
        }
        return false;
    }

    public static boolean test76(int[] intArray1, int[] intArray2) {
        if (intArray1.length < 2 || intArray2.length < 2) {
            return false;
        } else if (intArray1[0] == intArray2[0] || intArray1[intArray1.length - 1] == intArray2[intArray2.length - 1]) {
            return true;
        }
        return false;
    }

    public static int[] test77(int[] intArray1, int[] intArray2) {
        int[] newArray = new int[2];
        if (intArray1.length < 2 || intArray2.length < 2) {
            return null;
        }
        newArray[0] = intArray1[0];
        newArray[1] = intArray2[intArray2.length - 1];
        return newArray;
    }

    public static boolean test78(int[] intArray) {
        for (int i : intArray) {
            if (i == 5 || i == 7) {
                return true;
            }
        }
        return false;
    }

    public static int[] test79(int[] intArray) {
        int length = intArray.length;
        int[] outArray = new int[length];
        for (int i = 0; i < length - 1; i++) {
            outArray[i] = intArray[i + 1];
        }
        outArray[length - 1] = intArray[0];
        return outArray;
    }

    public static int test80(int[] intArray) {
        int num = 0;
        for (int i : intArray) {
            if (i > num) {
                num = i;
            }
        }
        return num;
    }

    public static int[] test81(int[] intArray) {
        int n = intArray[0];
        intArray[0] = intArray[intArray.length - 1];
        intArray[intArray.length - 1] = n;
        return intArray;
    }

    public static int test82(int[] intArray) {
        if (intArray[0] > intArray[intArray.length - 1] && intArray[0] > intArray[intArray.length / 2]) {
            return intArray[0];
        } else if (intArray[intArray.length - 1] > intArray[0] && intArray[intArray.length - 1] > intArray[intArray.length / 2]) {
            return intArray[intArray.length - 1];
        } else {
            return intArray[intArray.length / 2];
        }
    }

    public static int[] test83(int[] intArray1, int[] intArray2) {

        int[] newArray = new int[intArray1.length > intArray2.length || intArray1.length == intArray2.length ? intArray1.length : intArray2.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = intArray1[i] * intArray2[i];
        }
        return newArray;
    }

    public static boolean test85(String[] strArray){
        return strArray[0].equalsIgnoreCase("hello");
    }

    public static void test86(int n){
        while (n != 1){
            if (n % 2 != 0){
                n = n * 3 +1;
            }else{
                n = n / 2;
            }
            System.out.println(n);
        }
    }

    public static String test87(int num){
        int n = 0;
        String[] numberString = {"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
        while (num != 0){
            n += num % 10;
            num /= 10;
        }
        int numbers = n;
        System.out.println(numbers);
        int length = 0;
        for (int i = 0; i < n; i++){
            length++;
            n /= 10;
        }
        String[] newStringArray = new String[length];
        for (int i = 0; i < newStringArray.length; i++){
            newStringArray[i] = numberString[numbers % 10];
            numbers /= 10;
        }
        String[] reverseArray = new String[newStringArray.length];
        int newStringArrayLength = newStringArray.length;
        for (int i = 0; i < reverseArray.length; i++){
            reverseArray[i] = newStringArray[newStringArrayLength -1];
            newStringArrayLength--;
        }
        return Arrays.toString(reverseArray);
    }

    public static void test92(int[] intArray){
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i : intArray){
            if (i % 2 == 0){
                evenNumber++;
            }else{
                oddNumber++;
            }
        }
        System.out.println("Quantity of even number: " + evenNumber);
        System.out.println("Quantity of odd number: " + oddNumber);

    }
}