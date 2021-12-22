package state_pattern.exmple;

public class Canvas {
    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public Tool getTool() {
        return currentTool;
    }

    public void setToolType(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
