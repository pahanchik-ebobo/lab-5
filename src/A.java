public abstract class A {
    abstract  void callme();
    //абстрактные классы всё же могут содержать конкретные методы
    void callmetoo(){
        System.out.println("Это конкретный метод");
    }
}
