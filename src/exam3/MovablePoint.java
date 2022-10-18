package exam3;

public class MovablePoint extends Point{

    private  int xSpeed;
    private  int ySpeed;

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x = " +  getX() + "," + " y = " + getY() + "," + "xSpeed = " + getxSpeed() + "," + "ySpeed = " + getySpeed();
    }
}
