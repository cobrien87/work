target_word = "Python"

guess = input("Enter a word: ")

for letter in guess:
    if letter in target_word:
        print(letter + " is in the target word")
    else:
        print(letter + " is not in the target word")
