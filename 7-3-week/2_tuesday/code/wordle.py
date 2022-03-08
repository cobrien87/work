def display(list):
    str = "[ "
    for item in list:
        str+=item+" "
    return str+"]"
target = "sword"
numGuesses = 5
for i in range(numGuesses):
    #print("You have " + str(numGuesses - i) + " guesses remaining.")
    guess= input("Enter a 5 letter word: ")
    while len(guess) != 5:
        guess = input("Enter a 5 letter word! try again: ")
    if guess== target:
        print("Correct! ")
        break
    str = ""
    wrongPos = [];
    for i in range(len(guess)):
        if guess[i] == target[i]:
            str+=guess[i]+" "
        print("str: " + str)
        print(guess[i] + " in string? " + str(guess[i] in str))
        if guess[i] in target and guess[i] not in str:
            wrongPos.append(guess[i])
            str+="_ "
        else:
            str+="_ "
    print("word: " + str)
    print("letters in word, but in wrong position: " + display(wrongPos))
