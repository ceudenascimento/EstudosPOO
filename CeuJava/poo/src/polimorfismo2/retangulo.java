package polimorfismo2;

public class retangulo extends Formas{
	public double altura;
	public double base;
	
	public retangulo(double _altura, double _base) {
		this.altura=_altura;
		this.base=_base;
	}
	@Override
	public double area() {
		return this.altura*this.base;
	}
	public double perimetro() {
		return ((this.altura*2)+(this.base*2));
	}
}
