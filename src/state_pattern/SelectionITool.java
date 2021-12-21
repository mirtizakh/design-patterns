package state_pattern;

public class SelectionITool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a dashed rectangle");
    }
}
