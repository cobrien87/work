from numpy import *
A = array([[1,2], [3,4]])

x =  array([3,4])

print(str(A) + "*" + str(x) + " = " + str(dot(A,x)))
B = A + A
print(B)
