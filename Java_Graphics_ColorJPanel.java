
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java_Graphics_ColorJPanel extends JPanel {

    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    
    this.setBackground(Color.WHITE);
    
    //set new frawing color using integers
    g.setColor(new Color(206, 0, 0));
    g.fillRect(15, 25, 100, 20);
    g.drawString("Current RGB: " + g.getColor(), 130, 40);
    
    //set new drawing color using floats
    g.setColor(new Color(0.20f, 0.75f, 0.0f));
    g.fillRect(15, 50, 100, 20);
    g.drawString("Current RGB: " + g.getColor(), 130, 65);
    
    //set new drawing color using static color objects
    g.setColor(Color.ORANGE);
    g.fillRect(15, 75, 100, 20);
    g.drawString("Current RGB: " + g.getColor(),130, 90);
    
    //display individual RGB values
    Color color = Color.MAGENTA;
    g.setColor(color);
    g.fillRect(15, 100, 100, 20);
    g.drawString("RGB values: " + color.getRed() + "," + color.getGreen() + "," + color.getBlue(), 130, 115);
 
    } 
}
//end method paintComponent
    class ShowColors
    {
        public static void main(String[] args) 
        {
            JFrame frame = new JFrame("Using Colors");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Java_Graphics_ColorJPanel colorJPanel = new Java_Graphics_ColorJPanel();
            frame.add(colorJPanel);
            frame.setSize(500,200);
            frame.setVisible(true);
        }
    }

