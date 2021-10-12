package fr.dauphine.javaavance.td2;

public class Value extends Expr {
	private double x;
	
	public Value() {
		this.x=0;
	}
	
	public Value(double val) {
		this.x=val;
	}
	
	public double eval() {
		return this.x;
	}
	
}
