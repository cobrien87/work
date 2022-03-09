from wordlist import *
def display(list):
    my_str = "[ "
    for item in list:
        my_str+=item+" "
    return my_str+"]"
target =  "snows"





#game
numGuesses = 5
notInWord = [];
for i in range(numGuesses):
    print("You have " + str(numGuesses - i) + " guesses remaining.")
    guess= input("Enter a 5 letter word (all lower case): ")
    while True:
        if len(guess) != 5:
            guess = input("Enter a 5 letter word! try again: ")
        if not(wordInList(guess)):
            guess = input("That's not a word! Try again: ")
    if guess== target:
        print("Correct! You win. ")
        break
    my_str = ""
    wrongPos = [];

    for i in range(len(guess)):
        if guess[i] == target[i]:
            my_str+=guess[i]+" "


        elif guess[i] in target and guess[i] not in my_str:
            wrongPos.append(guess[i])
            my_str+="_ "
        else:
            notInWord.append(guess[i])
            my_str+="_ "
        #print("is " + guess[i] +" in my_string?:" )

    print("word: " + my_str)
    print("letters guessed, but not in word: " + display(notInWord))
    print("letters in word, but in wrong position: " + display(wrongPos))
    boo = input("Do you want to quit? (y/n) ")
    if boo == 'y':
        break

print("The correct word was: " + target)
