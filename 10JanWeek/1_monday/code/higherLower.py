my_float = round(3.3312,2)

while True:
    number=float(input(" Enter a guess:"))
    if number > my_float:
        print("Too high")
    elif number < my_float:
        print("Too low")
    else:
        print("Correct!")
        break
