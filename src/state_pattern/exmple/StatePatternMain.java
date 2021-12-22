package state_pattern.exmple;

import state_pattern.exmple.BrushITool;
import state_pattern.exmple.Canvas;

public class StatePatternMain {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setToolType(new BrushITool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
