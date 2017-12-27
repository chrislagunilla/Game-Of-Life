import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel{
    private class Cell{
        JPanel panel;
        private int val;
        public int getVal(){return val;}
        public void setOne(){val = 1;}
        public void setZero(){val = 0;}

        private Cell(){
            panel = new JPanel();
            val = 0;
        }
    }

    private Cell[][] grid_matrix;

    public Grid(){
        int w = 50;
        int h = 50;
        setLayout(new GridLayout(h, w, 1, 1));
        grid_matrix = new Cell[w][h];
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                Cell newCell = new Cell();
                newCell.panel.setPreferredSize(new Dimension(10, 10));
                newCell.panel.setBackground(Color.LIGHT_GRAY);

                grid_matrix[i][j] = newCell;
                add(grid_matrix[i][j].panel);
            }
        }
    }

    public void turnOn(int x, int y){
        grid_matrix[x][y].panel.setBackground(Color.GREEN);
    }

    public void turnOff(int x, int y){
        grid_matrix[x][y].panel.setBackground(Color.LIGHT_GRAY);
    }
}
