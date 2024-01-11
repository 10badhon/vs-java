public class format_specifier{
   public static void main(String[] args){
        boolean a=true;
        char b='a';
        short c=325;
        int d=105353;
        float e=1.11f;
        double f=2.33;
      
        System.out.printf("boolean b = %b\n",a);// for boolean use %b
        System.out.printf("character c = %c\n",b);// for character use %c
        System.out.printf("short s = %d\n",c);// for short use %d
        System.out.printf("integar i = %d\n",d);// for integer use %d
        System.out.printf("float f = %f\n",e);// for float use %f
        System.out.printf("double d = %f\n",f);// for double use %f
        
        System.out.printf("float f = %.1f\n",e);// for limitation use .number
        System.out.printf("double d = %.2f\n",f);// for limitation use .number 


    }
}