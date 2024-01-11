/*
  &     bitwise and     ==>thats work only with binary number
  |     bitwise or
  ^     bitwise exor
  >>    bitwise shift right
  <<    bitwise shift left
  ~     bitwise not
 */
public class bitwise_operator{
    
    public static void main(String[] args){
        int a=32,b=12;
        int c;
        c=a&b;// we using integer thats a decimal system
              // first 32 will convert in binary number (1 0 0 0 0 0)
              //then 12 will convert in binary number   (0 0 1 1 0 0)
              //then multiply each other                 0 0 0 0 0 0 =>0
        System.out.println(c);
        
        c=a^b;//a and b will convert in binary number
                                      //  a(1 0 0 0 0 0)
                                      //  b(0 0 1 1 0 0)
          //then summation each other      (1 0 1 1 0 0) =>44
              // convert this binary digit into decimal number
        System.out.print(c);      
    }

}
