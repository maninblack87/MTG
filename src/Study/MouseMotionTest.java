package Study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseMotionPanel extends JPanel{
    JLabel label;

    public MouseMotionPanel(){
        this.setLayout(null);

        label = new JLabel("드래그 나를!");

        //드래그 앤 드롭을 위한 이벤트 리스너 추가
        label.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                Point p = e.getPoint();
                SwingUtilities.convertPointToScreen(p, label);
                label.setLocation(p);
            }
        });
        label.addMouseMotionListener(new MouseAdapter(){
            public void mouseDragged(MouseEvent e){
                Point p = e.getPoint();
                SwingUtilities.convertPointToScreen(p, label);
                label.setLocation(p);
            }
        });

        label.setSize(100, 50);

        this.add(label);
    }

}

public class MouseMotionTest extends JFrame {
    public MouseMotionTest(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new MouseMotionPanel());

        setVisible(true);
    }

    public static void main(String[] args) {

        MouseMotionTest t = new MouseMotionTest();

    }
}
