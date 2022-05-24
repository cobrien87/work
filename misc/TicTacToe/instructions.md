# Python TicTacToe Project: A guide for the perplexed Java coder

## Variables and control structures
Variables are similar to Java, but are much simpler.. They **do not** have to be initialized with a specific data type, can the same variable can be switched freely between distinct types of data. E.g.

    x = 2
    x = "2"
    x = 2.0
is a completely valid sequence of commands in Python.  This also means that all that casting crap isn't something you have to worry about in Python.

Control structures also work similarly, but again are much simpler.  

While loops:

    while x <2:
      print(x)
      x+=3

For loops:

    for i in range(3):
      print(i)
if-else statements:

    if x < 3:
      return x
    elif x == 3:
      return 0
    else:
      return x + 3

## Data types
Most Python data types are the same as Java (string, int, etc.). Two which work differently are *lists* and *2d lists*, discussed below.
### Lists
 A major difference: Python represents arrays using a data type called **List**, which behaves similarly to Java ArrayLists. Lists are represented with '[]'.

An example is below:

    students = ["Saad", "Rafiki", "Luis", "Yosuf", "Maddox"]

A given element can be accessed using []:

    students[0]

  will return "Saad", and so on.

  ### 2D Lists
  A 2d array (e.g. a tic tac toe board) can be represented using a 2d list.  This is simply a list of lists.  Each sub-list represents a row of the 2d array.

  Example: The tictactoe board below

      X|O|X
      O|X|O
      O|O|X
Can be represented by the 2D list:

    board = [
              ["X","O","X"],
              ["O","X","O"],
              ["O","O","X"]
              ]

## Helper Functions
This functions are provided for you.  You should use them!
### get_valid_index()
**parameter**: prompt (a message to the user).  a string

**output**: index. an integer representing a value between 0 and 2.


### game_is_over()
**parameter**: A 2d list representing a tic tac toe board

**output**: a boolean, depending on whether one player has filled up all of a row, column, or diagonal. Also prints a message indicating who won.

### print_board()
**parameter**:  A 2d list representing a tic tac toe board

**output**: None. prints the board.
