//search on google : java math class..... then select math item.
public class math_class {
    public static void main(String[] args){
        int a=10;
        int b=-10;
       
        
        int max=Math.max(a,b);
        System.out.println("maximum is : "+max);
        
        int min=Math.min(a,b);
        System.out.println("minimum is : "+min);
        
        int absolute=Math.abs(b);
        System.out.println("absoult value is : "+absolute);
        
        int x=2;
        int y=3;

        double power=Math.pow(x,y);
        System.out.println("power answer is : "+power);
        
        int round=Math.round(8.8f);// print an integer value depend on value after dot
        System.out.println(" round is :"+round);

        double pi=Math.PI;
        System.out.println("PI = "+pi);
    }
}
