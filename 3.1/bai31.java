public class bai31 {
        public static void main(String[] args) {
            MyComplex c1 = new MyComplex(3, 4);
            MyComplex c2 = new MyComplex(1, -1);
            System.out.println("Real part of c1: " + c1.getReal());
            System.out.println("Imaginary part of c1: " + c1.getImag());
            c1.setReal(5);
            c1.setImag(6);
            System.out.println("Updated c1: " + c1.toString());
            System.out.println("Is c1 real? " + c1.isReal());
            System.out.println("Is c1 imaginary? " + c1.isImaginary());
            System.out.println("c1 equals c2? " + c1.equals(c2));
            MyComplex c3 = new MyComplex(5, 6);
            System.out.println("c1 equals c3? " + c1.equals(c3));
            System.out.println("Magnitude of c1: " + c1.magnitude());
            System.out.println("Argument of c1 (in radians): " + c1.argument());
            c1.add(c2);
            System.out.println("c1 after addition with c2: " + c1.toString());
            MyComplex c4 = c1.addNew(c3);
            System.out.println("New c4 (c1 + c3): " + c4.toString());
            c1.subtract(c2);
            System.out.println("c1 after subtraction with c2: " + c1.toString());
            MyComplex c5 = c1.subtractNew(c3);
            System.out.println("New c5 (c1 - c3): " + c5.toString());
            c1.multiply(c2);
            System.out.println("c1 after multiplication with c2: " + c1.toString());
            c1.divide(c2);
            System.out.println("c1 after division with c2: " + c1.toString());
            MyComplex conjugate = c1.conjugate();
            System.out.println("Conjugate of c1: " + conjugate.toString());
        }
}

