include image
###################################################
japan-flag =  image-url("https://code.pyret.org/shared-image-contents?sharedImageId=1RwzIn5GQmctrO6weX8kmu6sxxFLW8TQq")

####################################################

#DO NOW: Open this starter file japan_flag.arr on GOOGLE CLASSROOM.  Two shapes are defined for you:
background = rectangle(300, 200, "outline", "black")
dot = circle(60, "solid", "red")

#Be sure to...
# 1) Click run and type "japan-flag" into the interactions window to see what the flag of Japan should look like. In your notes, describe the image you're going to build, using as much detail as possible!


# WARM UP
# 1)  Make a prediction: Do you think that japan_1 will match japan_flag (the image you started with)? Explain why or why not, then run your code to find out!
japan_1 = overlay(background, dot)



# 2) Compare "japan_2" (the image the code builds) to "japan-flag. How can you adjust this code so that the images match?

japan_2 = put-image(dot, 50, 40, background)


# 3) How are put-image() and overlay() similar? How are they different? Explain in your notebook!
