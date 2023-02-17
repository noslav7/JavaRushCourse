package d_games.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    
    private Snake snake;
    private int turnDelay;
    private Apple apple;
    private boolean isGameStopped;
    private static final int GOAL = 28;
    private int score;

    @Override
    public void onKeyPress(Key key) {
        if (key.equals(Key.LEFT)) {
        snake.setDirection(Direction.LEFT);
        } else if (key.equals(Key.RIGHT)) {
            snake.setDirection(Direction.RIGHT);
        } else if (key.equals(Key.UP)) {
            snake.setDirection(Direction.UP);
        } else if (key.equals(Key.DOWN)){
            snake.setDirection(Direction.DOWN);
        }
        if (key.equals(Key.SPACE) && isGameStopped) {
            createGame();
        }
    }
        
    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        drawScene();
        score = 0;
        setScore(score);
    }

    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.RED, "GAME OVER", Color.BLACK, 75);
    }

    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void createNewApple() {
        Apple newApple;
        do {
            int x = getRandomNumber(WIDTH);
            int y = getRandomNumber(HEIGHT);
            newApple = new Apple(x, y);
        } while (snake.checkCollision(newApple));
        apple = newApple;
    }
    
    @Override
    public void onTurn(int step) {
        if (!apple.isAlive) {
            createNewApple();
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }
        if (!snake.isAlive) {
            gameOver();
        }
        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
        snake.move(apple);
    }

    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.RED, "YOU WIN", Color.BLACK, 75);
    }
}
