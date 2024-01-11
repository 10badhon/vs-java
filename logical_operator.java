/* logical operator 

   && ==>logical and
   || ==>logical or
   !  ==>logical not
 */
import java.util.Scanner;
public class logical_operator{
    public static void main(String[] args){
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.print("enter any letter : ");
        ch=input.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.print(" Vowel ");
        }
        else{
            System.out.print(" consonant ");
        }
    }
}