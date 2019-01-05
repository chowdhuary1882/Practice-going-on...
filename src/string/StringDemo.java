package string;



public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Arif";
        String s2 = new String("Chowdhuary");

        char [] s3 = { 'a', 'r','i','f'};

        System.out.println("My First Name :"+s1);
        System.out.println("My Last Name :"+s2);
        System.out.println(s3);

        // find the length of string
        int length = s1.length();
        System.out.println("Length of s1 :"+length);

        //compare the string

        if(s1==s2){
            System.out.println("Strings are Equal");
        }
            else{
            System.out.println("Strings are Not Equal");
        }

        //compare the string value by equal method

        if(s1.equals(s2)){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }

        //check the similar value contain or not by contain method

        if(s1.contains("Arif")){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }

        //check the similar value contain or not, also Uppercase and lowercase free by equalsIgnoreCase method

        if(s1.equalsIgnoreCase("arif")){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }

        // boolean check by contain method
        boolean con = s1.contains("Arif");
        System.out.println(con);

        //isempty method
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);

    }
}
