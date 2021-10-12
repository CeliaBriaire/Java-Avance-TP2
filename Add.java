package fr.dauphine.javaavance.td2;

public class Add extends Expr {
	private final double x;
	
	public Add() {
		this.x=0.0;
	}
	
	public Add(Expr z,Expr y) {
		this.x= z.eval()+y.eval() ;
	}
	
	public double eval() {
		return this.x;
	}
}
