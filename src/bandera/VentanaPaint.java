/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandera;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Juano
 */
public class VentanaPaint extends JFrame {
    
    private PanelPaint panelPaint;
    
    public VentanaPaint() {
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(100, 100);        
        this.setTitle("Paint 1.0");
        this.panelPaint= new PanelPaint();
        this.panelPaint.setBackground(Color.white);
        this.setContentPane(this.panelPaint);
        this.setVisible(true);
      
        
    }
    public static void main(String[] data){
        new VentanaPaint();
    }
            
    
}
