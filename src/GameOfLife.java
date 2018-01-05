import javax.swing.*;

public class GameOfLife {
    public static void main(String [] args) throws Exception{
        JFrame frame = new JFrame("Conway's Game of Life");
        frame.setSize(1, 1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Grid grid = new Grid();

        grid.turnOn(14, 25);
        grid.turnOn(15, 25);
        grid.turnOn(16, 25);

        panel.add(grid);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        grid.run();
    }


}
