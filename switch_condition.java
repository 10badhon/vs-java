import java.util.Scanner;
public class switch_condition {
    public static void main(String[] args){
        int digit;
        System.out.print(" Enter any digit between 0-5 : " );
        Scanner input = new Scanner(System.in);
        digit=input.nextInt();

        switch(digit){
            case 0:
               System.out.print("Zero");
               break;
        
            case 1:
               System.out.print("One");
               break;
        
            case 2:
               System.out.print("Two");
               break;
        
            case 3:
               System.out.print("Three");
               break;
        
            case 4:
               System.out.print("Four");
               break;
            case 5:
               System.out.print("Five");
               break;
            default:
               System.out.print("invalid");
        }
    }
}
