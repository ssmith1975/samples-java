/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.applet.Applet;
import java.awt.Graphics;

public class DrawStringApplet extends Applet {
    String input_from_page;

    public void init() {
        input_from_page = getParameter("String");
    }
    
    public void paint(Graphics g) {
        g.drawString(input_from_page, 50, 25);
    }
}
