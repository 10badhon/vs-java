public class string2 {
    public static void main(String[] args){

        String country="Bangladesh is my country";
        System.out.println(country);

        char ch=country.charAt(0);// print index number character
        System.out.println("ch : "+ch);

        int ascii=country.codePointAt(0);// print index number character ascii value
        System.out.println("ascii : "+ascii);

        int pos=country.indexOf("n");// print postion of parameter String
        System.out.println("first n position : "+pos);
        
        pos=country.lastIndexOf("n");// print last position number of n
        System.out.println("last n position : "+pos);

        String s2="   badhon   ";
        System.out.print(s2.trim());// s2.trim() is removing extra space in starts & ends
    }
}
