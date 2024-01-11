public class string3 {
    public static void main(String[] args){

        String s1="My-name-is-badhon";
        System.out.println(s1);

        String s2=s1.replace("badhon","tanvir"); 
        System.out.println(s2);
        
        String[] s=s1.split("-");// array string cause when find parameter object they will split in each string
        for(String x: s){
            System.out.println(x);
        }

    }
}
