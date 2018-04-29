clear all
clc
% definition de l'intervalle
a = 0;
b = 1;
% definition du nombre max d'iteration
itMax = 30;
% l'erreur toleré
tol = 0.0005;


for i=1:30
  m=(a+b)/2; % calcul du milieu de l'intervalle
  fa = a^3 + a -1;% F(a)
  fm = m^3 + m -1; % F(m)
  
 if (fa*fm < 0)% si la solution est entre a et m 
    b=m; % b = m
  else % sinon
    a=m;  % a = m
  end
  
  if ( norm(a-b) < tol) % si la largeur de l'intervalle est inferieur à la tolerence
    break;% arreter le calcul
  end
 
end

a % solution 
fa = a^3 + a -1 % verification