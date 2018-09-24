
/**
 * @author quent
 *
 */
public class Complex {
	double real;
	double img;
	
	/** Build a complex
	 * @param real, real part of the complex
	 * @param img, imaginary part of the complex
	 */
	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}
	
	/**
	 * @return real value
	 */
	public double get_real() {
		return this.real;
	}
	
	/**
	 * @return imaginary value
	 */
	public double get_img() {
		return this.img;
	}
	
	/**
	 * @param real * Set real value
	 */
	public void set_real(double real) {
		this.real = real;
	}

	/**
	 * @param img Set img value
	 */
	public void set_img(double img) {
		this.img = img;
	}

	/**
	 * @param complex, the complex to add
	 * @return the addition of 2 complex, (a new one is created)
	 */
	public Complex add(Complex complex) {
		Complex res = new Complex(this.real + complex.get_real(), this.img + complex.get_img());
		return res;
	}
	
	/**
	 * @return the module of the complex
	 */
	public double modulus() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.img, 2));
	}
	
	/**
	 * @return the argument of a real number
	 */
	public double arg() {
		if (this.real > 0) {
			return 2 * Math.atan(this.img / (this.real + this.modulus()));
		}
		else {
			return Math.PI;
		}
	}
	
	/**
	 * @param complex, the complex to multiply
	 * @return return the result in a new complex
	 */
	public Complex multiply(Complex complex) {
		Complex res = new Complex(this.real * complex.real - this.img * complex.img, this.real * complex.img + this.img * complex.real);
		return res;
	}
	
	public Complex substract(Complex complex) {
		Complex res = new Complex(this.real - complex.real, this.img - complex.img);
		return res;
	}
}
