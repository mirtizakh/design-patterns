package state_pattern.exmple;

public class BrushITool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Daw a line");
    }
}
