package fr.dauphine.javaavance.td2;

public class Main {
	public static void main(String[] args) {
	Expr val = new Value(1337.0);
	System.out.println(val.eval()); //affiche 1337.0
	
	Expr add = new Add(new Value(327.0), val);
	System.out.println(add.eval()); //affiche 1664.0
	
	Expr e = new Add(new Value(350.0), add);
	System.out.println(e.eval()); //affiche 2014.0  
	
	Expr mlt = new Mult(new Value(2.0), e);
	System.out.println(mlt.eval()); //affiche 4028.0
	
	Expr car = new Sqr(new Value(25.0));
	System.out.println(car.eval()); //affiche 5.0
}
}

