package java8;

public class DemonTest {
    interface Print{
        void printer(String val);
    }
    public void printSomeThing(String something, Print print){
        print.printer(something);
    }
    public static void main(String[] args) {
        DemonTest demonTest = new DemonTest();
        String val ="aaa";
//        Print print = new Print() {
//            @Override
//            public void printer(String val) {
//                System.out.println(val);
//            }
//        };
//        print.printer(val);
        demonTest.printSomeThing(val,var -> System.out.println(var));
    }
}
