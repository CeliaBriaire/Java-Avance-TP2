package fr.dauphine.javaavance.td2;

public class Sqr extends Expr {
	private double x;
	
	public Sqr() {
		this.x=0.0;
	}
	
	public Sqr(Expr z) {
		this.x= Math.sqrt(z.eval()) ;
	}
	
	public double eval() {
		return this.x;
	}
}
