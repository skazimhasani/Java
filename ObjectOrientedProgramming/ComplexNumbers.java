package ObjectOrientedProgramming;

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c = new Complex(5, 6);
        Complex d = new Complex(7, 8);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();

    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.real * b.imag)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}
