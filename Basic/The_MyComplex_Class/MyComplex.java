package The_MyComplex_Class;

public class MyComplex {
	
	private double real = 0.0, imag = 0.0;
	
	MyComplex(){
		
	}
	
	
	MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	
	public double getReal() {
		return this.real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return String.format("%f+%fi", this.real, this.imag);
	}
	
	public boolean isReal() {
		if (imag == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isImaginary() {
		if (real == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag== another.imag);
	}
	
	public double magnitude() {
		return Math.sqrt(real*real + imag*imag);
	}
	
	public MyComplex addInto(MyComplex right) {
		this.real = this.real + right.real;
		this.imag = this.imag + right.imag;
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		double newInstanceReal = this.real + right.real;
		double newInstanceImag = this.imag + right.imag;
		return new MyComplex(newInstanceReal, newInstanceImag);
	}
}
