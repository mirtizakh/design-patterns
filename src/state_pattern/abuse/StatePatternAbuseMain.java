package state_pattern.abuse;

import state_pattern.abuse.bad.StopWatchAbuse;

public class StatePatternAbuseMain {
    public static void main(String[] args) {
        //StopWatch stopWatch = new StopWatch();

        StopWatchAbuse stopWatch = new StopWatchAbuse();

        stopWatch.click();
        stopWatch.click();
        stopWatch.click();

    }
}
