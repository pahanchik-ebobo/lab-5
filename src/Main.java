public class Main {
    public static void main (String[] args){
        Overload obi = new Overload();
        obi.overload();
        System.out.println("-----------------------------------------------------------");
        Overload1 bibi = new Overload1();
        bibi.overload1();
        System.out.println("-----------------------------------------------------------");
        FindAreas bibi2 = new FindAreas();
        bibi2.findareas();
        System.out.println("-----------------------------------------------------------");
        AbstractDemo bibi3 = new AbstractDemo();
        bibi3.abstractdemo();
    }
}
