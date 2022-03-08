# fill in the body of this function!
first = input("What is your first name?")
last = input("What is your last name?")

def initials(first, last):
    initials = first[0] + "." + last[0] + "."
    return initials


print(initials(first, last))
