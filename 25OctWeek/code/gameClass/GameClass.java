public class Game
{
private int numPlayers;
private boolean gameOver;

public Game()
{
numPlayers = 1;
gameOver = false;
}

public void addPlayer()
{
numPlayers++;
}

public void endGame()
{
gameOver = true;
}
}
