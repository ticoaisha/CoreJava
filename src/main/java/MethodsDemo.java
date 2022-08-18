public class MethodsDemo {

    public static void main(String[] args) {
        /*
        * why method
        * if you will have any set of lines of code, which I want to reuse every time,
        * I can wrap all these line in one block and for that block to give a name
        * this will be a method
        *
        * methods are written outside of the main method
        *
        * public - methods can be accessed by other classes also
        * */

        /*
        * we created object of this class to access methods in this class
        * */

        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
    }

    public String getData(){
        System.out.println("Hello World");
        return "rahul shetty";
    }
}
