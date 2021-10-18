from turtle import *
import tkinter

"""
This program draws four shapes on corners of the excers
different color
"""
penup()
setposition(-80,40)
#
pendown()

# Draws a red diamond
def diamond():
    color("red")
    begin_fill()
    circle(60,360,4)
    end_fill()
    penup()
    setposition(80,40)
    pendown()

diamond()

# Draws a blue circle due to 4 steps
color("blue")
begin_fill()
circle(60)
end_fill()
penup()
setposition(-100,-150)
pendown()

# Draws a yellow half circle due to 3 steps
color("yellow")
begin_fill()
circle(60,360,5)
pendown()

penup()
setposition(100,-150)
pendown()

#draws a upside down green pentagon
color("green")
begin_fill()
circle(60,360,5)
end_fill()
penup()




tkinter.mainloop()
