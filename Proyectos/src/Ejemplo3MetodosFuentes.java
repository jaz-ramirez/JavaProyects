
/***:
*@Programa:   CuadrosDialogoDolares.java
*@Autor:      Profra. Adriana Vega Palos
*@Fecha:      MANEJO DE VARIABLES
*@Descripción:Inicia POO Manejo de objetos y eventos
* 			  Instanciar fuentes con sus atributos, manejo de mensajes input, trabajar con variables.
*
***/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo3MetodosFuentes extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JTextField campoNombre;
    private JLabel etiquetaBienvenida;

    public static void main(String[] args) {
    	Ejemplo3MetodosFuentes marco = new Ejemplo3MetodosFuentes();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setTitle("Cambiar tipo de Letra ");
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	    etiquetaBienvenida = new JLabel("Escribe tu nombre");
	    // Se instancia la fuente primero para después utilizarla en el objeto.
	    Font tipoLetra2 = new Font("Serief",Font.BOLD,28);
	    etiquetaBienvenida.setFont(tipoLetra2);
	    etiquetaBienvenida.setForeground(Color.LIGHT_GRAY);
	    ventana.add(etiquetaBienvenida);
	     
	    campoNombre = new JTextField(10);
	    /*Se instancia la fuente con el tipo y el tamaño
	     * Se le da un nombre a tu fuente, después la 
	     * utilizas en el objeto*/
	    Font tipoLetra = new Font("Serief",Font.ITALIC,20);
	    campoNombre.setFont(tipoLetra);
	    campoNombre.setForeground(Color.blue);
	    campoNombre.setEditable(true);
	    campoNombre.setEnabled(true);
	    ventana.add(campoNombre);
	     
	 	boton = new JButton("Continuar");
	 	boton.setFont(tipoLetra2);
	 	boton.setForeground(Color.GREEN);
	 	ventana.add(boton);
	 	boton.addActionListener(this);
	    }
	
	    public void actionPerformed(ActionEvent event) {
		int totalCentavos;
		int dolares;
		int centavosRestantes;
		String totalCentavosString;
		String nombreUsuario;
		
		nombreUsuario= campoNombre.getText();
	
		totalCentavosString = JOptionPane.showInputDialog(nombreUsuario + " \n Escribe un monto en centavos \n "+ " para convertir a dolares \n ");
		totalCentavos = Integer.parseInt(totalCentavosString);
		dolares = totalCentavos / 100;
		centavosRestantes = totalCentavos % 100;
		
		JOptionPane.showMessageDialog(null, nombreUsuario + " tu tienes:   \n" +
			totalCentavosString + " centavos se dividen en:\n" +
			dolares + " dólares\n" +
			centavosRestantes + " centavos.");
	    }	
}