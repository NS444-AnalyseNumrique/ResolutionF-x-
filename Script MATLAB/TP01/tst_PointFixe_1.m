clear all
clc

% definition du nombre max d'iteration
itMax = 30;
% l'erreur toleré
tol = 0.0005;
x0 = 0.5;
x(1) = x0;
for i=2:30

  x(i)= G(x(i-1));
  if ( norm(x(i)-x(i-1)) < tol) % si la largeur de l'intervalle est inferieur à la tolerence
    break;% arreter le calcul
  end
 
end
n = length(x);
x(n) % solution 
f= x(n)^3 + x(n) -1 % verification
plot(0:n-1, x)% dessiner l'evolution de la solution