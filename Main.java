//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Check if a number is even or odd
        System.out.println("Hello World");
        System.out.println("See if you're number is even or odd");
        System.out.println("Type an integer");
        int n = 2;
        System.out.println("The integer is " + n);
        if (n%2==0){
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
        //find the largest of 3 numbers
            int a = 3; int b =4; int c =5;
            System.out.println("See which number is the largest");
            System.out.println(" Type an integer");
            if ((a>b) && (a>c)) {
                System.out.println("The largest number is " + a);
            } else if ((b>a) && (b>c)) {
                System.out.println("The smallest number is " + b);
            }else {
                System.out.println("The largest number is " + c);
            }
            //grade calculator
        System.out.println("Grade Calculator");
        System.out.println("What is your score?");
            int score = 95;
            if (score>=90) {
                System.out.println("Your grade is an A");
            }else if (score>=80) {
                    System.out.println("Your grade is a B");
                }else if (score>=70) {
                System.out.println("Your grade is a C");
            }else if (score>=60) {
                System.out.println("Your grade is a D");
            }else if (score>=50) {
                System.out.println("Your grade is a E");
            }
            // simple calculator
        System.out.println("Simple Calculator");
            System.out.println("Enter your numbers");
            int y = 8; int z = 9;
            System.out.println("What operation?");
            char operand = '*';
            switch (operand) {
                case '+': System.out.println("The answer is "+ (y+z));break;
                case'-': System.out.println("The answer is "+ (y-z));break;
                case '*': System.out.println("The answer is "+ (z*y));break;
                case '/': System.out.println("The answer is "+ (z/y));break;
                case '%': System.out.println("The answer is "+ (z%y));break;
                default: System.out.println("Invalid Operation"); break;
            }
            // Exit
        System.out.println("Goodbye");




        }
    }
