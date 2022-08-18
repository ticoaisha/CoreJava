import java.util.ArrayList;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {
        int[]arr3 = {1,2,3,5,6,7,8,99,122};

        //print values from the Array, only if the remainder after division by 2 is 0

//        for(int i=0; i< arr3.length; i++){
//
//            if(arr3[i] % 2 == 0){
//                System.out.println(arr3[i]);
//            }
//            else{
//                System.out.println(arr3[i] + " is not multiple of 2");
//            }
//        }

        //check if array has multiple of 2
        //so enough if you even have one multiple of 2
        //here we will use break - to exit
        //so here after break if will not go further once the condition met

        for(int i=0; i< arr3.length; i++){

            if(arr3[i] % 2 == 0){
                System.out.println(arr3[i]);
                break;
            }
            else{
                System.out.println(arr3[i] + " is not multiple of 2");
            }
        }

        /*Arraylist allows to dynamically grow the size of the array
        * ArrayList is a class in Java
        *
        * new operator allocates memory
        * we are creating an object to get access to the methods from the class
        * */

        ArrayList a = new ArrayList();

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("rahul");
        stringArrayList.add("shetty");
        stringArrayList.add("academy");
        stringArrayList.add("selenium");
//        stringArrayList.remove(2);
        System.out.println(stringArrayList.get(2));



    }
}
