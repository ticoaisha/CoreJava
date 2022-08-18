public class CoreJavaBrushUp3 {

    public static void main(String[] args) {

        /*
         * One way of creating Strings - String literal
         *
         * If I will declare Strings like this
         * it will not create new s1 String
         * first it will check if String with the same value already exists
         * if it exists, then s1 will point to the same value
         * */

        String s = "academy"; // object s is created
        String s1 = "academy";

        /*
         * Another way of creating String with "new" keyword
         * In this case s2 and s3 will be created
         * */

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String someString = "Rahul Shetty Academy";
//        String[] splittedString = someString.split(" ");
//        System.out.println(splittedString[0]);
//        System.out.println(splittedString[1]);

        String[] splittedString = someString.split("Shetty");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        //String is an object, that is why I can use for loop and treat as array
//        for (int i = 0; i < someString.length(); i++) {
//            System.out.println(someString.charAt(i));
//        }

        /*
        * Print the string in reverse order
        * */

        for (int i = someString.length()-1; i >=0; i--) {
            System.out.print(someString.charAt(i));
        }
    }
}


