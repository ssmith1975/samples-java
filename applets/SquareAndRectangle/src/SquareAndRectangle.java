/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import javax.swing.JApplet;
import java.awt.*;

// assume the drawing area is 150 by 150
public class SquareAndRectangle extends JApplet {
    final int areaSide = 150;
    final int width = 100, height = 50;

    public void paint (Graphics gr) {
        gr.setColor(Color.white);
        gr.fillRect(0, 0, 150, 150);

        gr.setColor(Color.blue);
        // outline the drawing area
        gr.drawRect(0, 0, areaSide - 1, areaSide-1);

        // draw interior rectangle
        gr.drawRect(areaSide/2 - width/2, areaSide/2 - height/2, width, height);
    }
}
