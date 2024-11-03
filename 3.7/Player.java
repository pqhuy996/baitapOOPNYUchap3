public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;
    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move (float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public void jump (float zDisp) {
        this.z += zDisp;
    }
    public boolean near (Ball37 ball) {
        float dx = ball.getX() - x;
        float dy = ball.getY() - y;
        float distance = (float) Math.sqrt(dx * dx + dy * dy);
        return distance < 8;
    }
    public void kick (Ball37 ball) {
        if (near(ball)) {
            ball.setXYZ(ball.getX() + 7, ball.getY() + 7, ball.getZ());
        }
    }
    @Override
    public String toString() {
        return "Player " + number + " at (" + x + "," + y + "," + z + ")";
    }
}

