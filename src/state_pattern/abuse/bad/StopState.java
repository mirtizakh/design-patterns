package state_pattern.abuse.bad;

public class StopState implements StopWatchState {
    private final StopWatchAbuse stopWatch;

    public StopState(StopWatchAbuse stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setStopWatchState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
