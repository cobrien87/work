import random
from turtle import *
import tkinter
x = random.randint(-200,200)
y = random.randint(-200, 200)

print("( " + str(x) + ", "+ str(y) +")")

penup()
setposition(x,y)
pendown()

circle(20)


tkinter.mainloop()
