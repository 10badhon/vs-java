import java.util.Scanner;
public class ternary_operator{
    public static void main(String[] args){
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number : ");
        num1=input.nextInt();

        System.out.print("Enter second number : ");
        num2=input.nextInt();

        int large=(num1>num2)? num1:num2;

        System.out.print("the large number is : "+large);

    }
}