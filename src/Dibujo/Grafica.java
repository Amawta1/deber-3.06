/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author amawt
 */
public class Grafica extends JPanel implements MouseListener {
    private int x1=0;
    private int y2=0;
    private int numFigura=0;
    private Color colorLinea = Color.BLACK;
     private int dimx=0;
    private int dimy=0;
    
    public Grafica (){
        this.addMouseListener(this);
    }
    public void figura(String e){
        if(e.equalsIgnoreCase("Circulo")){
        this.numFigura=0;
        }
        if(e.equalsIgnoreCase("Cuadrado")){
        this.numFigura=1;
        }
        
    }
    public void dimenciones(String e1,String e2){
        this.dimx=Integer.valueOf(e2).intValue();
        this.dimy=Integer.valueOf(e2).intValue();
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        if(this.numFigura==0){
            g.setColor(colorLinea);
            g.drawOval(x1, y2, 10, 30);
        }
        if(this.numFigura==1){
            g.setColor(colorLinea);
            g.drawRect(x1, y2, 10, 30);
        }
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        this.x1=e.getX();
        this.y2=e.getY();
        
        super.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  public int getX1(){
      return x1;
  }
  public int getY2(){
      return y2;
  }
   public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }
    
}
