public class bai37 {
    public static void main(String[] args) {
        Ball37 ball = new Ball37(5, 5, 0);
        Player player = new Player(10, 0, 0);
        System.out.println("Initial state:");
        System.out.println(ball);
        System.out.println(player);
        player.move(3, 4);
        System.out.println("\nAfter moving player:");
        System.out.println(player);
        if (player.near(ball)) {
            System.out.println("Player is near the ball.");
        } else {
            System.out.println("Player is not near the ball.");
        }
        player.kick(ball);
        System.out.println("\nAfter player kicks the ball:");
        System.out.println(ball);
        player.jump(5);
        System.out.println("\nAfter player jumps:");
        System.out.println(player);
    }
}
