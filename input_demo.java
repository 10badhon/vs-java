import java.util.Scanner;

public class input_demo{
    public static void main(String[] args){
           Scanner input=new Scanner(System.in);// input is a variable name 
           int number;

           System.out.print("Enter numbers : ");
           number=input.nextInt();// input is a variable that was declared in 5th line

           System.out.println("The number is : "+number);
           //
           //
           Scanner input1= new Scanner(System.in);
           String name;
           System.out.print("Enter your name : ");
           name=input1.nextLine();
           System.out.print("Welcome : "+name);

    }

}