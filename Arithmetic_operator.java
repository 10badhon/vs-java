/* Arithmetic operator
   +
   -
   *
   /
   %
*/
import java.util.Scanner;
public class Arithmetic_operator{
     public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        
        System.out.print("Enter first number : ");
        num1=input.nextInt();

        System.out.print("Enter second number : ");
        num2=input.nextInt();
        

        result= num1+num2;
        System.out.println("sum is : "+result);
        
        result=num1-num2;
        System.out.println("sub is : "+result);

        result=num1*num2;
        System.out.println("mul is : "+result);

        result=num1/num2;
        System.out.println("div is : "+result);

        result=num1%num2;
        System.out.println("rem is : "+result);
        
     }
}