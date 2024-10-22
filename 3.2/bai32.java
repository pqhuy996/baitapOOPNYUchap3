public class bai32 {
    public static void main(String[] args){
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(3, 4);
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p1(2) = " + p1.evaluate(2));
        MyPolynomial p3 = p1.add(p2);
        System.out.println("p1 + p2: " + p3.toString());
        MyPolynomial p4 = p1.multiply(p2); 
        System.out.println("p1 * p2: " + p4.toString());
    }
}
