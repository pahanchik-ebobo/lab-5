//Применить автоматическое преобразование типов к перегрузке
public class OverloadDemo1 {
    void test() {
        System.out.println("Параметры отсутсвуют");
    }
//Перегружаемый метод, проверяющий наличие двух целочисленныз параметров

    void test(int a, int b){
        System.out.println("a и b " + a + " " + b);
    }
//Пергружаемый метод, проверяющий наличие параметра типа double

    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}