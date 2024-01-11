public class for_each_loop{
    public static void main(String[] args){
        
        String[] name={"tanvir","ahmed","badhon"};

        for(String x : name){// name arrays all value assigned in x 
            System.out.println(x);
        }
        
        int[] num={10,20,30,40,50};
        int sum=0;
        for(int x: num){
            System.out.println(x);
            sum+=x;
        }
        System.out.println("sum is "+sum);
    }
}