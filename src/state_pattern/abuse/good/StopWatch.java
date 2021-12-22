package state_pattern.abuse.good;

public class StopWatch {
    private boolean isRunning;

    public void click(){
        if(isRunning){
            isRunning = false;
            System.out.println("Stopped");
        }
        else if(!isRunning){
            isRunning = true;
            System.out.println("Running");
        }
    }
}
