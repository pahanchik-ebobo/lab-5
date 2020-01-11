public class Overload1 {
    public static void overload1(){
        OverloadDemo1 mi = new OverloadDemo1();
        int i = 88;

        mi.test();
        mi.test(10,20);
        mi.test(i);
        mi.test(123.2);
    }
}