import numpy as np

def f(x):
    return x**3 + x -1

a = 0;
b = 1;

itMax = 500;
tol = 0.0005;




for i in np.arange(itMax):

    m= (a+b)/2

    if (f(a) * f(m) < 0):
        b=m;
    else:
        a=m;

    if (np.linalg.norm(b-a)< tol):
        break;

print (i)
print (a)
print (f(a))
       
