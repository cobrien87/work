f = lambda x: 4*x**3 + 8*x**2 + 3
g = lambda y: f(y) + 3
x = float(input("x = "))
print("g(x) = "+str(g(x)))
