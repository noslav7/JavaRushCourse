package d_games.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private final static String HEAD_SIGN = "\uD83D\uDC7E";
    private final static String BODY_SIGN = "\u26AB";

    public boolean isAlive = true;

    private Direction direction = Direction.LEFT;

    private List<GameObject> snakeParts = new ArrayList<>();

    public int getLength() {
        return snakeParts.size();
    }

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            String sign = (i != 0) ? BODY_SIGN : HEAD_SIGN;
            if (isAlive) {
                game.setCellValueEx(part.x, part.y, Color.NONE, sign, Color.BLACK, 75);
            } else {
                game.setCellValueEx(part.x, part.y, Color.NONE, sign, Color.RED, 75);
            }
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x >= SnakeGame.WIDTH
                || newHead.x < 0
                || newHead.y >= SnakeGame.HEIGHT
                || newHead.y < 0) {
            apple.isAlive = false;
            return;
        }
        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        }
        snakeParts.add(0, newHead);

        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
        } else {
            removeTail();
        }
    }

    public GameObject createNewHead() {
        if (direction.equals(Direction.LEFT)) {
            return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        } else if (direction.equals(Direction.DOWN)) {
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        } else if (direction.equals(Direction.RIGHT)) {
            return new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        } else if (direction.equals(Direction.UP)) {
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        }
        return null;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }
 
    public void setDirection(Direction direction) {
        if ((this.direction == Direction.LEFT || this.direction == Direction.RIGHT) && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        }
        if ((this.direction == Direction.UP || this.direction == Direction.DOWN) && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        }
        
        if (direction == Direction.UP && this.direction == Direction.DOWN) {
            return;
        } else if (direction == Direction.LEFT && this.direction == Direction.RIGHT) {
            return;
        } else if (direction == Direction.RIGHT && this.direction == Direction.LEFT) {
            return;
        } else if (direction == Direction.DOWN && this.direction == Direction.UP) {
            return;
        }

        this.direction = direction;
    }

    public boolean checkCollision(GameObject gameObject) {
        boolean isCollision = false;
        for (int i = 0; i < snakeParts.size(); i++) {
            if (gameObject.x == snakeParts.get(i).x
                    && gameObject.y == snakeParts.get(i).y) {
                isCollision = true;
                break;
            }
        }
        return isCollision;
    }
}
