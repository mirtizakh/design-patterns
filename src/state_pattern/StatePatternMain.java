package state_pattern;

public class StatePatternMain {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setToolType(new BrushITool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
