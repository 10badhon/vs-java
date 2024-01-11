/*conditional statement 
 1.if              
 2.if
   else           //else condion not required.
 3.if 
   else if
   else

 */
import java.util.Scanner;
public class conditional_statement{

    public static void main(String[] args){

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger number ");
        num=input.nextInt();

        if(num>0){
            System.out.print(" Positive ");
        }
        else if(num<0){
            System.out.print(" Negative ");
        }
        else{
            System.out.print("Equal to zero");
        }
    }

}