public class Driver {
        public static void main(String[] args) {                 
        Rectangle r1 = new Rectangle(5, 7);
        Rectangle r2 = new Rectangle("green",10,2);
        Rectangle r3 = new Rectangle("Red",15,12);

        r1.draw();
        System.out.println(" ");
        r2.draw();
        System.out.println(" ");
        r3.draw();
    }
}