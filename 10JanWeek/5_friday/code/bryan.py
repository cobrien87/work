role = input("What is your role? ")

if role == "administrator" or "teacher":
    print(" Administrators and teachers get keys!")

elif role == "student" :
    print("Students do not get keys!")

else:
    print("You can only be administrator, teacher, or student!")
