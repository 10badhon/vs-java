/*assignment operator
   =
  +=
  -=
  *=
  /=
  %=

 */
public class assignment_operator{
    public static void main(String[] args){
           int x=10,y=5;
           
           x+=y;//x=x+y ==>15
           System.out.println("x = "+x);

           x-=y;//x=x-y ==> 15-5=10
           System.out.println("x = "+x);

           x*=y;//x=x*y ==> 10*5=50
           System.out.println("x = "+x);

           x=x/y;//x=x/y ==> 50/5=10
           System.out.println("x = "+x);

           x%=y;//x=x/y ==> 10%5=0
           System.out.println("x = "+x);

    }

}