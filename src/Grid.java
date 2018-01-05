import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel{
    private class Cell{
        JPanel panel;
        private int val;
        public int getVal(){return val;}
        private void on(){
            val = 1;
        }
        private void off(){
            val = 0;
        }
        private void redraw(){
            if(val == 0){
                panel.setBackground(Color.LIGHT_GRAY);
            }
            else if(val == 1){
                panel.setBackground(Color.BLUE);
            }
        }
        private Cell(){
            panel = new JPanel();
            val = 0;
        }
    }

    private Cell[][] grid_matrix;
    private boolean run;
    private int w = 50;
    private int h = 50;

    public Grid(){
        setLayout(new GridLayout(h, w, 1, 1));
        grid_matrix = new Cell[w][h];
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                Cell newCell = new Cell();
                newCell.panel.setPreferredSize(new Dimension(10, 10));
                newCell.panel.setBackground(Color.GRAY);
                grid_matrix[i][j] = newCell;
                add(grid_matrix[i][j].panel);
            }
        }
        run = false;
    }

    public void turnOn(int row, int col){
        grid_matrix[col][row].on();
    }

    public void turnOff(int col, int row){
        grid_matrix[col][row].off();
    }

    public void stop(){run = false;}

    public void run() throws Exception{
        run = true;
        while(run){
            for(Cell [] row : grid_matrix){
                for(Cell c : row){
                    if(c.getVal() == 0){c.on();}
                    else{c.off();}
                }
            }

            // redraw the cells
            for(Cell [] row : grid_matrix){
                for(Cell c : row){
                    c.redraw();
                }
            }
        }
    }

//    private Cell[][] deepCopy(Cell[][] gm){
//        return null;
//    }
}
