/***:
*@Programa: Ejemplo1.java
*Autor:    Adriana Vega Palos
*Fecha:    dia/mes/a�o.
*Descripcion: Inicia POO Manejo de objetos y eventos
*             Trabajar con mas de un panel, con mas de un bot�n, m�todo exit y cajas de mensajes
*             Dibujar en los paneles
*
***/
/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ejemplo1 extends JFrame 
    implements ActionListener {

	    private JButton boton, salir, mensaje;
	    private JPanel panel,panel1;
	
	    public static void main(String[] args) {
	        Ejemplo1 marco = new Ejemplo1();
	        marco.setSize(800, 400);
	        marco.setTitle("Ejemplo 1");
	        marco.crearGUI();
	        marco.setVisible(true);
	    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(350, 280));
		panel.setBackground(Color.CYAN);
		ventana.add(panel);
	
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(350, 280));
		panel1.setBackground(Color.lightGray);
		ventana.add(panel1);
		
		boton = new JButton("Haga clic");
		ventana.add(boton);
		boton.addActionListener(this);
		
		mensaje = new JButton("mensaje");
		ventana.add(mensaje);
		mensaje.setEnabled(false);
		mensaje.setAlignmentX(CENTER_ALIGNMENT);
		mensaje.addActionListener(this);
		
		salir = new JButton("Salir");
		ventana.add(salir);
		salir.setEnabled(false);
		salir.setAlignmentX(CENTER_ALIGNMENT);
		salir.addActionListener(this);
	

    }

    public void actionPerformed(ActionEvent event) {

    	Object origen= event.getSource(); //permite trabajar con m�s de un bot�n
    	
        Graphics papel = panel.getGraphics();
        Graphics papel1 = panel1.getGraphics();
 
        if (origen == boton) {
        	papel.drawLine(20, 20, 150, 150);
        	papel.setColor(Color.GREEN);
        	papel.drawOval(25, 25, 70, 70);
        	papel.setColor(Color.BLACK);
        	papel.drawString("Este es un texto que se dibuja .______..........",80,80);
        	papel.setColor(Color.YELLOW);
        	papel.drawRect(50, 50, 120, 120);
        	papel.fillRect(90, 90, 120, 120);
        	salir.setEnabled(true);
        	mensaje.setEnabled(true);          
        }
        else if (origen==mensaje){
        	JOptionPane.showMessageDialog(null, "Hola Bienvenido a POO"); //mensaje
        	papel1.setColor(Color.GREEN);
        	papel1.drawString("Rect�ngulo 3d...........",25,25);
        	papel.drawString("hola quiero estar en el primer panel",20,50);
        	papel1.draw3DRect(100, 100, 150, 150, true); 
        	papel1.setColor(Color.BLUE);
        	papel1.fillRoundRect(110, 110, 150, 150, 150, 150);
        	papel1.setColor(Color.MAGENTA);
        	papel1.drawString("Segundo Rect�ngulo...........",120,120);
        	papel1.setColor(Color.white);
        	papel1.drawOval(2, 2, 20, 20);
        	papel1.setColor(Color.MAGENTA);
        	papel1.fillOval(150,70, 10, 10);
        	for(int i = 15; i <20; i++)
        	{
        		papel1.setColor(Color.ORANGE);
        		JOptionPane.showMessageDialog(null, "Variable i muestra los incrementos"+ i); //mensaj
        		papel1.fillOval(i, i, 70, 70);
        		papel1.setColor(Color.YELLOW);
        		papel1.drawOval(i, i, 70, 70);
        		papel1.setColor(Color.BLUE);
        		papel1.drawOval(i, i, 70, 70);
        	}
        	
        } else {
        	 System.exit(0);// Sale del Sistema
        	 }
        
    
    
    }
    
}
