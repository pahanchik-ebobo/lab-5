public class Overload {
    public void overload(){
        OverloadDemo ob=new OverloadDemo();
        double result;
        //вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result= ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25):"+result);

    }
}
