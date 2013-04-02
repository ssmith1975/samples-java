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

public class Lines extends JApplet {
    final int width = 150;
    final int height = 150;
    final int segs = 10;

    public void paint(Graphics gr) {
        gr.setColor(Color.RED);
        gr.drawRect(0, 0, width-1, height-1);

        gr.setColor(Color.BLACK);
        gr.drawLine(0,height/2,  width, height/2);

        for(int i=0; i<=segs; i++){
            gr.drawLine(i*width/segs, height/2-5, i*width/segs, height/2+5);
        }
    }
}
