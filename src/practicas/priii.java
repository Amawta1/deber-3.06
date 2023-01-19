/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package practicas;

//import Grafica.Dibujo;
import bandera.PanelPaint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author amawt
 */
public class priii extends JFrame implements ActionListener {
    
    private Dibujo dibujo;
    private JPanel panelPrincipal;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    
    public priii(){
        this.setSize(1000, 600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1.0");
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Verde");
        this.jComboBox1.addActionListener(this);
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Estrella");
        this.jComboBox2.addItem("Circulo");
        this.jComboBox2.addItem("Cuadrado");
        this.jComboBox2.addActionListener(this);
        this.jTextField1 = new JTextField();
        this.jTextField1.setText("");
        this.jTextField2 = new JTextField();
        this.jTextField2.setText("");
        this.dibujo = new Dibujo();
        this.dibujo.setBackground(Color.white);
        this.setContentPane(this.dibujo);
        this.panelPrincipal = new JPanel(new BorderLayout());
        this.panelPrincipal.add(this.dibujo,BorderLayout.CENTER);
        this.panelPrincipal.add(this.jComboBox1,BorderLayout.WEST);
        this.panelPrincipal.add(this.jComboBox2,BorderLayout.EAST);
        this.panelPrincipal.add(this.jTextField1,BorderLayout.NORTH);
        this.panelPrincipal.add(this.jTextField2,BorderLayout.SOUTH);
        this.setContentPane(this.panelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String args[]) {
        new priii();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var f =this.jComboBox2.getSelectedItem().toString();
        var q =this.jTextField1.getText();
        var t = this.jTextField2.getText();
        
        if(this.jComboBox1.getSelectedIndex()==0){
            this.dibujo.setColorLinea(Color.red);
        }
        if(this.jComboBox1.getSelectedIndex()==1){
            this.dibujo.setColorLinea(Color.blue);
        }
        if(this.jComboBox1.getSelectedIndex()==2){
            this.dibujo.setColorLinea(Color.green);
        }
        
        this.dibujo.figura(f);
        this.dibujo.dimenciones(q, t);
    }
   
}
