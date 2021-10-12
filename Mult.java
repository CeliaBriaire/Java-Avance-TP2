package fr.dauphine.javaavance.td2;

public class Mult extends Expr {
	private double x;
	
	public Mult() {
		this.x=0.0;
	}
	
	public Mult(Expr z,Expr y) {
		this.x= z.eval()*y.eval() ;
	}
	
	public double eval() {
		return this.x;
	}
}
