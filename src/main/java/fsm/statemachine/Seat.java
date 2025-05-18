package fsm.statemachine;

public class Seat {
    private SeatState state;

    public Seat() {
        this.state = SeatState.AVAILABLE;
    }
    public SeatState getState() {
        return state;
    }

    public boolean book() {
        if (state == SeatState.AVAILABLE) {
            state = SeatState.BOOKED;
            return true;
        }
        return false;
    }

    public boolean cancel() {
        if (state == SeatState.BOOKED) {
            state = SeatState.CANCELLED;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return state == SeatState.AVAILABLE;
    }

    public boolean isBooked() {
        return state == SeatState.BOOKED;
    }
}
