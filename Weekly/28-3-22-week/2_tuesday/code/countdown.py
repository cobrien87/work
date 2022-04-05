number = int(input("Enter your number here: "))
output = ""
while number > 0:
    output += str(number) + "..."
    number -= 2
print(output + "Blastoff!")

number = int(input("Enter your number here: "))
def countdown(number):
    if number <= 0:
        return "Blastoff!"
    else:
        return str(number) + "..." + countdown(number - 2)
print(countdown(number))
