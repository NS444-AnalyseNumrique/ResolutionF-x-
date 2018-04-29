import numpy as np
import matplotlib.pyplot as plt


def f(x):
    return x**3 + x -1
def g(x):
    return 1/(x**2 + 1)

x0 = 0.5;

itMax = 30;
tol = 0.0005;


x= np.array([x0])

for i in np.arange(itMax):

   x= np.append(x,g(x[i]))

   if (np.linalg.norm(x[i]-x[i-1])< tol):
        break;

print (i)
print (x[i+1])
print (f(x[i+1]))
plt.plot(x)
plt.show()
