public class string{
    public static void main(String[] args){
        String s1="BADHON";
        String s2=new String("badhon");
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        int len =s1.length();/////
        System.out.println("length of s1 "+len);

        if(s1.equals(s2)){// this (==) operator only check objects are equal or not // dont check those values  
            System.out.println("s1.equals(s2) : equal");
        }
        else{
            System.out.println("s1.equals(s2) : not equal");
        }


        if(s1.equalsIgnoreCase(s2)){// s1.equalsIgnoreCase(s2) // this class dont match upper and lower case alphabet
             System.out.println("s1.equalsIgnoreCase(s2) : equal");
        }
        else{
            System.out.println("s1.equalsIgnoreCase(s2) : not equal");
        }

        boolean con= s1.contains("ami");// this method check any word are matching in parameter string 
        System.out.println("contains : "+con);

        boolean b = s1.isEmpty();// this method check string is empty or not 
        System.out.println("chk empty : "+b);
    }
}