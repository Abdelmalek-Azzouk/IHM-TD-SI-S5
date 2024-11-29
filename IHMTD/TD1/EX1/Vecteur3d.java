package EX1;

public class Vecteur3d {
	private double x, y, z;

	Vecteur3d(double a, double b, double c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}
	
	public void show() {
		System.out.println("<"+x+","+y+","+z+">");
	}
	
	
	public double norme() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	
	public static Vecteur3d somme(Vecteur3d v1, Vecteur3d v2) {
		return new Vecteur3d(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
	}
	
	
	public double produit(Vecteur3d v){
		return (x*v.x + y*v.y + z*v.z);
	}
	
	public static void main(String[] args) {
		Vecteur3d V1, V2, Vs;
		V1 = new Vecteur3d(0.3,1.5,0.25);
		V2 = new Vecteur3d(-10.0,-11.1,-12.2);
		System.out.println("DATA:");
		V1.show();
		V2.show();
		System.out.println("NORME:\n Vecteur 1 = " + V1.norme() + "\nVecteur 2 = " + V2.norme() + "\n Le Produit = " + V1.produit(V2) + "\n La Somme = ");
		Vs = Vecteur3d.somme(V1, V2);
		Vs.show();
	} //fin main

}
