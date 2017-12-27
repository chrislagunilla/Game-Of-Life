import javax.swing.*;

public class GameOfLife {
    public static void main(String [] args){
        JFrame frame = new JFrame("Conway's Game of Life");
        frame.setSize(1, 1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Grid grid = new Grid();
        grid.turnOn(30, 15);
        panel.add(grid);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
