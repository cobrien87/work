from turtle import *
import tkinter
shape("turtle")
radius = 50
def make_blue_square():
    color("blue")
    begin_fill()
    for i in range(4):
        forward(2*radius)
        left(90)
    end_fill()
def make_red_circle():
    color("red")
    begin_fill()
    circle(radius)
    end_fill()

make_blue_square()
penup()
forward(radius)
pendown()
make_red_circle()






tkinter.mainloop()
