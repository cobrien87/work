from turtle import *
import tkinter
radius = 30

def circle_move_down(radius):
    circle(radius)
    penup()
    right(90)
    forward(radius)
    left(90)
    pendown()

for i in range(4):
    circle_move_down(radius)
    radius = radius + 30


tkinter.mainloop() 
