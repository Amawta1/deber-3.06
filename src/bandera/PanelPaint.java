/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandera;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Juano
 */
public class PanelPaint extends JPanel {

    @Override
    public void paint(Graphics g) {
       

        g.setColor(new Color(51, 153, 255));
        g.fillRect(100, 100, 300, 70);

        g.setColor(Color.white);
        g.fillRect(100, 170, 300, 70);

        g.setColor(new Color(51, 153, 255));
        g.fillRect(100, 240, 300, 70);

        g.setColor(new Color(255, 204, 0));
        g.fillOval(210, 175, 60, 60);

        g.setColor(new Color(255, 153, 0));
        g.drawOval(210, 175, 60, 60);

        g.setColor(new Color(255, 153, 0));
        g.drawOval(220, 190, 15, 10);

        g.setColor(new Color(255, 153, 0));
        g.drawOval(245, 190, 15, 10);

        g.setColor(new Color(255, 153, 0));
        g.drawLine(240, 210, 240, 200);
        g.drawArc(220, 185, 30, 40, 210, 80);
        for (int i = 250; i < 300; i+=20) {
            for (int j = 100; j < 300; j+=20) {
                g.setColor(Color.black);
                g.drawLine(240, 205, i, j);

            }

        }

    }

}
