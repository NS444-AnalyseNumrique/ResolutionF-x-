package TP01;
/**
 * NS444 - TP Analyse Numerique
 * utilisation des methode de dichotomie et du point fixe pour resoudre le probleme
 * F(x) = 0
 * @author B BOUALEM
 *
 */
public class ResolutionFx {

	public static void main(String[] args) {

		double solDicho = Dichotomie( 0, 1, 30, 0.0005);//Appel de la methode Dichotomie
		
		double solptFixe = pointFixe( 0.5, 30, 0.0005);//Appel de la methode PointFixe
		
		System.out.println(solDicho);//Afficher la solution par dichotomie 
		System.out.println(F(solDicho));//Remplacer la solution (dichotomie) dans F(x)
		System.out.println(solptFixe);//Afficher la solution par Point Fixe
		System.out.println(F(solptFixe));//Remplacer la solution (Point Fixe) dans F(x)
	}
	
	public static double F(double x) {
		// Methode qui calcul x^3+x-1
		return Math.pow(x, 3)+x-1;
	}


	public static double G(double x) {
		// Methode qui calcul 1/(x^2+1)
		return 1/(Math.pow(x, 2)+1);
	}
	/**
	 * methode de dichotomie
	 * @param a bonde inferieure de l'intervalle 
	 * @param b bonde superieure de l'intervalle
	 * @param itMax nombre maximal d'iterations
	 * @param tol l'erreur tolere
	 * @return solution de f(x)
	 */
	public static double Dichotomie (double a, double b, int itMax, double tol)
	{// methode de dichotomie
		double m;
		for (int i =0; i< itMax; i++)
		{
			m = (a+b)/2;
			
			if (F(a)*F(m)< 0)
				b=m;
			else 
				a=m;
			
			if (Math.abs(b-a) <tol)
				break;
					
		}
		
		return a;
	}
	/**
	 * methode du point fixe
	 * @param x0 condition initiale
	 * @param itMax nombre maximal d'iterations
	 * @param tol l'erreur tolere
	 * @return solution de f(x)
	 */
	public static double pointFixe (double x0, int itMax, double tol)
	{// methode du point fixe
		double x=0.0;
		for (int i =1; i< itMax; i++)
		{
			x= G(x0);
			
		
			if (Math.abs(x-x0) <tol)
				break;
			x0=x;
		}
		
		return x;
	}
}
