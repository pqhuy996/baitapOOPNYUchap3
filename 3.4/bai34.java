public class bai34 {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time);
        time.nextSecond();
        System.out.println("After nextSecond(): " + time);
        time.setTime(12, 59, 59);
        time.nextMinute();
        System.out.println("After nextMinute(): " + time);
        time.setTime(23, 0, 0);
        time.nextHour();
        System.out.println("After nextHour(): " + time);
        time.setTime(0, 0, 0);
        time.previousSecond();
        System.out.println("After previousSecond(): " + time);
        time.setTime(1, 0, 0);
        time.previousMinute();
        System.out.println("After previousMinute(): " + time);
        time.setTime(0, 0, 0);
        time.previousHour();
        System.out.println("After previousHour(): " + time);
    }
}
