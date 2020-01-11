public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a,b);
    }
//Переопределить метод area() для четырёхугольника

    double area(){
        System.out.println("В области четырёхугольника");
        return dim1*dim2;
    }
}