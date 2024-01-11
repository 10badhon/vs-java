public class array {
    public static void main(String[] args){
        int[] number;//declaration
        number = new int[5];//creation     // [5] is array size and index is 0 to 4
        
        int[] number1=new int[10];// declaration & creation in one line
        
        number[0]=10;
        number[1]=15;
        number[2]=10;
        number[3]=5;
        number[4]=5;
        
        int len=number.length;// length of an array
        System.out.println("array size : "+len);


        int sum=number[0] + number[1] + number[2];
        System.out.println("sum of three index : "+sum);


        System.out.print("4th number index value is  : "+number[4]);


    }
}
