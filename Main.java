import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//1.Write a program that prints the numbers from 1 to 100 such that:
//If the number is a multiple of 3, you need to print "Fizz" instead of that
//number.
//If the number is a multiple of 5, you need to print "Buzz" instead of that
//number.
//If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//instead of that number.

        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5!=0){
             System.out.println("Fizz");
            } else if ((i%5==0 && i%3!=0)) {
             System.out.println("Buzz");
            } else if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else System.out.println(i);
        }
        System.out.println("********************");
        //*******************************************
//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT
        System.out.print("please enter any string to create a Reverse:");
        String normal_string= input.nextLine();
        String reverse="";

        for (int i=normal_string.length()-1 ;i>=0;i--){
            reverse+=normal_string.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("********************");
        //*******************************************
//       3).Write a program to find the factorial value of any number entered
//        through the keyboard.
        System.out.println("please enter number to find factorial value:");
        int number =input.nextInt();
        int factorial=1;
        for(int i=1 ;i<=number;i++){
           factorial=factorial*i;
        }
        System.out.println("The factorial of number "+number+" is "+factorial);

        System.out.println("********************");
        //*******************************************
//4)Two numbers are entered through the keyboard. Write a program to find
//he value of one number raised to the power of another. another. (Do not use Java
//built-in method)
        System.out.println("___ power of numbers___");
        System.out.print("Please enter first number:");
        int number1 =input.nextInt();
        System.out.print("Please enter second number:");
        int number2 =input.nextInt();
        int power=1;

        for (int i =1; i<=number2 ;i++){
            power =power* number1;
        }
        System.out.println("he value of " +number1+ " raised to the power of " +number2+" = "+power);
        System.out.println("********************");

        //*******************************************
//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.
        System.out.println("please enter tow numbers and it will be the range\n the sum of  odd & even");
        System.out.print("Enter the frist number");
        int start_range=input.nextInt();
        System.out.print("Enter the second number");
        int end_range_=input.nextInt();

        int sum_even=0;
        int sum_odd=0;
        for(int i=start_range;i<=end_range_;i++){
            if(i%2==0){
                sum_even=sum_even+i;
            }else sum_odd=sum_odd+i;
        }
        System.out.println("The sum of even number is: "+sum_even);
        System.out.println("the sum of odd number is: "+sum_odd);
        System.out.println("********************");
        //*******************************************
        //6)Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.
        boolean is_prime=false;
        do{
            System.out.print("Please Enter positive number to check if it prime");
            int num=input.nextInt();
            if (num<2)continue;
           is_prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                is_prime=false;
                break;
            }
        }
        System.out.println(is_prime ? "it's prime" : "it's not a prime");
        }while(!is_prime);
        System.out.println("********************");
        //*******************************************
        //7)Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        int week=1;
        while (week<=4){
            System.out.println("Week "+ week++);
            for (int i=1;i<8;i++){
                System.out.println("Day "+i);
            }
        }
        System.out.println("********************");
        //*******************************************
        //8)Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left
        input.nextLine();
     System.out.println("please enter word to check if it palindrome ");
        System.out.print("Enter the word:");
        String word=input.nextLine();
        int word_leng=word.length();
        String check_palindrome="";
        for (int i=word.length()-1 ;i>=0;i--){
            check_palindrome+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(check_palindrome))
            System.out.println("The word is palindrome ");
        else System.out.println("The word is not palindrome");









    }
}