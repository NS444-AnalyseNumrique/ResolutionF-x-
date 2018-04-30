/*
NS444 - TP Analyse Numerique
Resolution d'un probleme du type F(x)=0
ce programme est utilise pour un but educatif
Il est permis d'utiliser, modifier et distribuer ce code.
Veuillez soumetre toute amelioration au code.
github.com/ResolutionF-x-/Cpp/SolveFx/SolveFx/SolveFx.cpp
Auteur : B BOUALEM
*/

#include "stdafx.h"

#include <iostream>

double F(double x);
double G(double x);
double Dichotomie(double a, double b, int itMax, double tol);
double pointFixe(double x0, int itMax, double tol);

int main()
{
	double solDicho = Dichotomie(0, 1, 30, 0.0005);
	double solPointFixe = pointFixe(0.5, 30, 0.0005);
	std::cout << "Solution par Dichotomie " << solDicho << std::endl;
	std::cout << "F( " << solDicho <<" ) = "<< F(solDicho) << std::endl;
	std::cout << "Solution par Point Fixe " << solPointFixe << std::endl;
	std::cout << "F( " << solPointFixe << " ) = " << F(solPointFixe) << std::endl;
	getchar();
    return 0;
}

double F(double x)
{
	return (pow(x,3) + x - 1.0);
}

double G(double x)
{
	return 1 / (pow(x,2)+1.0);
}

double Dichotomie(double a, double b, int itMax, double tol)
{
	double m=0.0;
	int i = 0;
	for (i = 0; i < itMax; i++)
	{
		m = (a + b) / 2;
		if (F(a)*F(m) < 0)
			b = m;
		else
			a = m;

		if (abs(b - a) < tol)
			break;
	}
	return a;
}

double pointFixe(double x0, int itMax, double tol)
{
	double x= 0.0;
	for (int i = 0; i < itMax; i++)
	{
		x = G(x0);
		if (abs(x - x0) < tol)
			break;
		x0 = x;
	}
	return x;
}