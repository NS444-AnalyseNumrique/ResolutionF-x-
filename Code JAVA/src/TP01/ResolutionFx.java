package TP01;

public class ResolutionFx {

	public static void main(String[] args) {

		double solDicho = Dichotomie( 0, 1, 30, 0.0005);
		
		double solptFixe = pointFixe( 0.5, 30, 0.0005);
		
		System.out.println(solDicho);
		System.out.println(F(solDicho));
		System.out.println(solptFixe);
		System.out.println(F(solptFixe));
	}
	public static double F(double x) {

		return Math.pow(x, 3)+x-1;
	}


	public static double G(double x) {

		return 1/(Math.pow(x, 2)+1);
	}
	public static double Dichotomie (double a, double b, int itMax, double tol)
	{
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
	public static double pointFixe (double x0, int itMax, double tol)
	{
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
