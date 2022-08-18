public class MethodsDemo3 {

    public static void main(String[] args) {
/*
* when method is marked as static, it means that it belongs to the class, not object
* and you can access this method directly w/o creating an object
*
* */
        String someName = getSomeData();
        getSomeData();
        System.out.println(someName);
    }

    public static String getSomeData(){
        System.out.println("Hello World");
        return "rahul shetty";
    }
}
