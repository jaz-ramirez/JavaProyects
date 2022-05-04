/**
 * @(#) AreaRectangulo.java
 *
 * @Descripci�n Para mostrar como se realizan los m�todos definidos por el programador
 * Envi� de par�metros, uno regresa un par�metro 
 * el otro solamente ejecuta las instrucciones sin regresar ning�n par�metro
 * @author Profesora Adriana Vega Palos
 * @version 1.00
 * Fecha: utilizado en el M�dulo de Programaci�n
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
        marco.setTitle("Met�dos de Java");
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
    	dibujarLogo(papel, 10, 20);     // llama al m�todo
    	dibujarLogo(papel, 100, 100);   // vuelve a llamar al m�todo
	    //variable para el metodo
        int a;
        //variables para caja de mensaje entrada
        String cLongitud, cAnchura;

        //variables para asignar los valores de las cajas de mensaje
        int iLongitud, iAnchura;

        // Caja de mensaje de entrada de datos
        cLongitud = JOptionPane.showInputDialog("introduce Longitud", "introduce solo valores num�ricos ");
        cAnchura  = JOptionPane.showInputDialog("introduce Anchura");

        // Convierte los valores recibidos en las cajas de mensaje 
        iLongitud = Integer.parseInt(cLongitud);
        iAnchura  = Integer.parseInt(cAnchura);

	a = areaRectangulo(iLongitud, iAnchura);   //llama al m�todo y env�a par�metros
	JOptionPane.showMessageDialog(null, "El �rea es: " + a); //muestra el �rea enviado del m�todo que realiz� c�lculos del �rea
   }	

    // M�todos creados por el programador
    
    private int areaRectangulo(int longitud, int anchura) {
	int area;
	area = longitud * anchura;
	return area;
    }
    
    // M�todo creado por el programador
    private void dibujarLogo(Graphics areaDibujo,
		int xPos, int yPos) {
		areaDibujo.drawRect(xPos, yPos, 70, 110);
		areaDibujo.drawRect(xPos, yPos, 50, 100);
		areaDibujo.drawRect(xPos, yPos, 30, 90);
	}
}


