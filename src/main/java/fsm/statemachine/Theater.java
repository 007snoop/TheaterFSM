package fsm.statemachine;

public class Threater {
    private Seat[][] seats;

    public Threater(int rows, int cols) {
        seats = new Seat[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; cols++) {
                seats[i][j] = new Seat();
            }
        }
    }

    public boolean bookSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            return seats[row][col].book();
        }
        return false;
    }

    public boolean cancelSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            return seats[row][col].cancel();
        }
        return false;
    }

    public boolean isSeatAvailable(int row, int col) {
        return isValidSeat(row, col) && seats[row][col].isAvailable();
    }

    private boolean isValidSeat(int row, int col) {
        return (row >= 0
                && col >= 0
                && row < seats.length
                && col < seats[0].length);
    }


    public void printSeating() {
        System.out.println("Seating Chart: ");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                SeatState state = seats[i][j].getState();
                String symbol = switch (state) {
                    case AVAILABLE -> "O";
                    case BOOKED -> "X";
                    case CANCELLED -> "-";
                };
                System.out.println(symbol + " ");
            }
            System.out.println();
        }
    }
}
