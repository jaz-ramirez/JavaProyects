/**
 * @(#) AreaRectangulo.java
 *
 * @Descripción Para mostrar como se realizan los métodos definidos por el programador
 * Envió de parámetros, uno regresa un parámetro 
 * el otro solamente ejecuta las instrucciones sin regresar ningún parámetro
 * @author Profesora Adriana Vega Palos
 * @version 1.00
 * Fecha: utilizado en el Módulo de Programación
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AreaRectangulo extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
    	AreaRectangulo marco = new AreaRectangulo();
        marco.setSize(600, 400);
        marco.crearGUI();
        marco.setTitle("Metódos de Java");
        marco.setVisible(true);
    }

    private void crearGUI() {
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    Container ventana = getContentPane();
	    ventana.setLayout(new FlowLayout() );
	
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 300));
		panel.setBackground(Color.white);
		ventana.add(panel);
	
		boton = new JButton("Haga clic");
		ventana.add(boton);
		boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
    	Graphics papel = panel.getGraphics();
    	dibujarLogo(papel, 10, 20);     // llama al método
    	dibujarLogo(papel, 100, 100);   // vuelve a llamar al método
	    //variable para el metodo
        int a;
        //variables para caja de mensaje entrada
        String cLongitud, cAnchura;

        //variables para asignar los valores de las cajas de mensaje
        int iLongitud, iAnchura;

        // Caja de mensaje de entrada de datos
        cLongitud = JOptionPane.showInputDialog("introduce Longitud", "introduce solo valores numéricos ");
        cAnchura  = JOptionPane.showInputDialog("introduce Anchura");

        // Convierte los valores recibidos en las cajas de mensaje 
        iLongitud = Integer.parseInt(cLongitud);
        iAnchura  = Integer.parseInt(cAnchura);

	a = areaRectangulo(iLongitud, iAnchura);   //llama al método y envía parámetros
	JOptionPane.showMessageDialog(null, "El área es: " + a); //muestra el área enviado del método que realizá cálculos del área
   }	

    // Métodos creados por el programador
    
    private int areaRectangulo(int longitud, int anchura) {
	int area;
	area = longitud * anchura;
	return area;
    }
    
    // Método creado por el programador
    private void dibujarLogo(Graphics areaDibujo,
		int xPos, int yPos) {
		areaDibujo.drawRect(xPos, yPos, 70, 110);
		areaDibujo.drawRect(xPos, yPos, 50, 100);
		areaDibujo.drawRect(xPos, yPos, 30, 90);
	}
}


