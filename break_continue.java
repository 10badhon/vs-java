// break continute statement
public class break_continue {
    
    public static void main(String[] args){
        for(int i=0; i<=100; i++){
            
            if(i==10){
                break;//when compiler find break---- that will be exit for loop
            }
            System.out.println("1s for"+i);
        }
        for(int i=0; i<20; i++){
            if(i==10){
             continue;
               // when compiler find continue statement that will go in starting loop again
               // 10 will not printed;
            }       
            System.out.println("2nd for"+i);
        }
    }
}
