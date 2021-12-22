package state_pattern.abuse.bad;

public class StopWatchAbuse {
    private StopWatchState stopWatchState = new StopState(this);

    public void click() {
        stopWatchState.click();
    }

    public StopWatchState getStopWatchState() {
        return stopWatchState;
    }

    public void setStopWatchState(StopWatchState stopWatchState) {
        this.stopWatchState = stopWatchState;
    }
}
