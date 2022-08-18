public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        int num = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(num + " is the value stored in the num variable");
        /*
        * Arrays - to store multiple values in one variable
        * */

        /*
        * here we declared an array and allocated memory for it
        * */

        int[] arr =  new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        //another way to create an Array
        int[] arr2 = {1,2,4,5,6};
        System.out.println(arr2[2]);

        /*
        * for loop
        * */

        for(int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }
        
        String[] name = {"rahul","shetty","selenium"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        /*
        * Enhanced for loop
        * from the array name on every iteration pick one value
        * that value store in the variable s
        * */
        for(String s : name){
            System.out.println(s);
        }






    }
}
