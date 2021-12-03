from turtle import *
import tkinter
penup()
backward(200)
pendown()

number = 5
radius = 15
def circle_move_down(radius):
    penup()
    forward(2*radius)
    pendown()
    circle(radius)


for i in range(number):
    circle_move_down(radius)
    radius+=15


tkinter.mainloop()
