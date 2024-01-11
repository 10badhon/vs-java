/* unary operator

  +
  -
  ++
  --

 */
public class unary_operator{
    public static void main(String[] args){
         int x=-10;
         int result;

       result = +x;
       System.out.println("result is : "+result);

       result = -x;
       System.out.println("result is : "+result);

       int a=2,b;

       b=a++;//it will be incresed when he got a second time.
       System.out.println("post increment : "+b);

       b=a;
       System.out.println("post increment : "+b);


       b=++a;//it will increase instant...
       System.out.println("pre increment : "+b);

       // a--; ==> post decrement 
       // --a; ==> pre  decrement 



    }
}