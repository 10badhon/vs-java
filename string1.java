public class string1 {
    public static void main(String[] args){
        String firstname="Tanvir";
        String lastname=" Badhon";
        
        String fullname=firstname.concat(lastname); // firstname + lastname;
        System.out.println("           "+fullname);

        String upperName= fullname.toUpperCase();
        System.out.println("upeerName : "+upperName);

        String lowerName= fullname.toLowerCase();
        System.out.println("lowerName : "+lowerName);
        
        boolean b= firstname.startsWith("T");
        System.out.println("b : "+b);
        
        boolean last= lastname.endsWith("on");
        System.out.println("last : "+last);




        String[] names={"tanvir","ahmed","badhon"};// String array;
        for(String x: names){// for each loop
            System.out.println("for eachloop  :"+x);
        }
        for(int i=0; i<3; i++ ){
            System.out.println("for : "+names[i]);
        }
    }
}
