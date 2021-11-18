import tkinter
from turtle import *

penup()
setposition(0,-100)
pendown()
radius=100
def make_circle(radius):
    begin_fill()
    color("yellow")
#Tracy will only draw a circle if the count variable is less than 5.
    #count=int(input("What should the variable count be?"))
count = 1
    if count<5:
        circle(75)
    end_fill()
make_circle(100)
penup()
setposition(-25,0)
def eyes():
    begin_fill()
    color("black")
    circle(10)
    end_fill()
eyes()
eyes()
penup()
forward(50)
pendown()
eyes()
penup()
setposition(-50,-20)
pendown()
right(90)
pensize(7)
#Tracy would only make the smily face if you answer yes.
happy=input("Should i be happy?:")
if happy=="yes":
    circle(50,180)

tkinter.mainloop()
