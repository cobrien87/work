import math
class Point:
    def __init__(self,x,y):
        self.x = x;
        self.y = y;
    def getX(self):
        return self.x
    def getY(self):
        return self.y
def df(A, B):
    # A and B are objects of the Point class
    return math.sqrt((A.getX() - B.getX())**2 + (A.getY() - B.getY())**2)



S = Point(-3,5)
F = Point(3,7)
print(df(S,F))
