package Study;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class MyImageFrameTest extends JFrame {
    BufferedImage img = null;
    public MyImageFrameTest(){
        setTitle("Image Load Test");
        try{
            img = ImageIO.read(new File("src/Study/img/main3.jpg"));
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        add(new MyImagePanel());
        pack();
        setVisible(true);
    }
    class MyImagePanel extends JPanel{
        public void paint(Graphics g){
            g.drawImage(img, 0, 0, null);
        }
    }
    public Dimension getPreferredSize(){
        if(img==null){
            return new Dimension(100, 100);
        }else{
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }
    public static void main(String[] args) {
        new MyImageFrameTest();
    }
}
