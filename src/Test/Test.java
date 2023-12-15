package Test;

import javax.swing.*;

class MyBoard extends JFrame {
    JPanel board;
    public MyBoard(){
        setSize(1200, 800);
        setTitle("TestMTG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new JPanel();

        this.add(board);
        setVisible(true);
    }

    class
}

public class Test {
    public static void main(String[] args) {
        MyBoard newBoard = new MyBoard();
    }
}
