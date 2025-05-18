import fsm.statemachine.Theater;

public class bookTest {
    public static void main(String[] args) {
        Theater theater = new Theater(5, 10);

        theater.bookSeat(1, 5);
        theater.bookSeat(1, 5);
        theater.bookSeat(4,8);

        theater.printSeating();
        System.out.println("=====");
        theater.cancelSeat(1,5);
        theater.printSeating();
    }
}
