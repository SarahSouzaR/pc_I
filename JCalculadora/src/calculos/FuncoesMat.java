package calculos;


public class FuncoesMat{
	
	//só para salvar
	
	public double adicao(double a, double b) {
		double total = a + b;
		return total;
	}
	
	public double subtracao(double c, double d) {
		double total = c - d;
		return total;
	}
	
	public double multiplicacao(double e, double f) {
		double total = e * f;
		return total;
	}
	
	public double divisao(double g, double h) {
		double total = g / h;
		return total;
	}
	
	public double MaisMenos(double x) {
		double y = -x;
		return y;
	}
	
	public double raiz(double z) {
		double total = Math.sqrt(z);
		
		return total;
	}
	
	public double porcentagem(double r, double s) { //vai depender se é soma, sub, div ou mult... 
		double total = (r * s)/100;
		return total;
	}
	
	public double fracao(double t) {
		double total = 1/t;
		return total;
	}
}
