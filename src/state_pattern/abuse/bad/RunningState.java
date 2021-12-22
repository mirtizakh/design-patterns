package state_pattern.abuse.bad;

public class RunningState implements StopWatchState {
    private final StopWatchAbuse stopWatch;

    public RunningState(StopWatchAbuse stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setStopWatchState(new StopState(stopWatch));
        System.out.println("Stopped");
    }
}
