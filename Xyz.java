package Encapsulation;

class ComplexNumber {
    public float real;
    public float imaginary;

    // Define constructor here
    public ComplexNumber(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber x){
        // Complete the function
        float realPart = this.real + x.real;
        float imagPart = this.imaginary + x.imaginary;
        return new ComplexNumber(realPart, imagPart);
    }

    public ComplexNumber subtract(ComplexNumber x){
        // Complete the function
        float realPart = this.real - x.real;
        float imagPart = this.imaginary - x.imaginary;
        return new ComplexNumber(realPart, imagPart);
    }

    public ComplexNumber multiply(ComplexNumber x){
        // Complete the function
        float realPart = this.real * x.real - this.imaginary * x.imaginary;
        float imagPart = this.real * x.imaginary + this.imaginary * x.real;
        return new ComplexNumber(realPart, imagPart);
    }

    public ComplexNumber divide(ComplexNumber x){
        // Complete the function
        float divisor = x.real * x.real + x.imaginary * x.imaginary;
        float realPart = (this.real * x.real + this.imaginary * x.imaginary) / divisor;
        float imagPart = (this.imaginary * x.real - this.real * x.imaginary) / divisor;
        return new ComplexNumber(realPart, imagPart);
    }
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
public class Xyz {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(10, 5);
        ComplexNumber b = new ComplexNumber(2, 3);

        ComplexNumber c1 = a.add(b);
        ComplexNumber c2 = a.subtract(b);
        ComplexNumber c3 = a.multiply(b);
        ComplexNumber c4 = a.divide(b);

        System.out.println("Number a: " + a);
        System.out.println("Number b: " + b);
        System.out.println("Sum: " + c1);
        System.out.println("Difference: " + c2);
        System.out.println("Product: " + c3);
        System.out.println("Division: " + c4);
    }

}


