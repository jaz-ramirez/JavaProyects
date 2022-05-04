/**  
** @Clase: 		CasaCambio.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		11/10/2021
** @Descripción: Casa de cambio. Conversión de dólares a pesos y de pesos a dólares.
*/ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CasaCambio extends JFrame implements ActionListener
{
    private JButton salir, dolaresPesos, pesosDolares;
    private JTextField textoImporte, textoConvertir;
    private JLabel etiquetaImporte, etiquetaConversion;
    
    public static void main(String[] args)
    {
	CasaCambio marco = new CasaCambio();
	marco.setSize(500, 150);
	marco.setTitle("Casa de cambio");
	marco.crearGUI();
	marco.setVisible(true);
    }
    
    private void crearGUI()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		
	
		//Se intancian fuentes 
	    Font tipoLetra = new Font("Serief",Font.BOLD,20);
	    Font tipoLetra2 = new Font("Calibrí",Font.BOLD,16);
	    
	    //Se instancias colores para trabajar rgb
	    Color guinda = new Color(100, 0, 45);
	    Color rosa = new Color(255, 175, 175);
	    Color azul = new Color(179, 237, 255);
	    	    
	    //Importe
		etiquetaImporte = new JLabel("Importe");
	    etiquetaImporte.setFont(tipoLetra2);
	    ventana.add(etiquetaImporte);
		
	    textoImporte = new JTextField(10);
	    textoImporte.setEditable(true);
	    textoImporte.setEnabled(true);
	    textoImporte.setFont(tipoLetra2);
	    textoImporte.setForeground(Color.BLACK);
	    ventana.add(textoImporte);
	    
		//A convertir
		etiquetaConversion = new JLabel("Dinero a convertir");
	    ventana.add(etiquetaConversion);
	    etiquetaConversion.setFont(tipoLetra);
	    etiquetaConversion.setForeground(guinda);
	    
	    textoConvertir = new JTextField(20);
	    textoConvertir.setEditable(false);
	    textoConvertir.setEnabled(false);
	    textoConvertir.setFont(tipoLetra);
	    textoConvertir.setForeground(guinda);
	    ventana.add(textoConvertir);
	    
	   
	    
	    //Botones
		dolaresPesos = new JButton("De dólares a pesos");
		dolaresPesos.setEnabled(true);
		dolaresPesos.addActionListener(this);
		dolaresPesos.setAlignmentX(CENTER_ALIGNMENT);
		dolaresPesos.setForeground(guinda);
		dolaresPesos.setBackground(azul);
		ventana.add(dolaresPesos);

		pesosDolares = new JButton("De pesos a dólares");
		pesosDolares.setEnabled(true);
		pesosDolares.addActionListener(this);
		pesosDolares.setAlignmentX(CENTER_ALIGNMENT);
		pesosDolares.setForeground(guinda);
		pesosDolares.setBackground(azul);
		ventana.add(pesosDolares);
		
		salir = new JButton("Salir");
		salir.setEnabled(true);
		salir.addActionListener(this);
		salir.setAlignmentX(CENTER_ALIGNMENT);
		salir.setForeground(Color.BLACK);
		salir.setBackground(azul);
		ventana.add(salir);
		
		
		

	}
    
    public void actionPerformed(ActionEvent event)
    {    	
    	Object origen= event.getSource();
    	double tipoCambioDolarD=0, resultado=0, importe=0;
    	String tipoCambioDolar, cambioDolar;
    	textoConvertir.setText("");
    	
    	
	    if (origen == salir)
	    {
	    	System.exit(0);
	    }
	    else if (origen == dolaresPesos)
	    {
	    	tipoCambioDolar = JOptionPane.showInputDialog("Ingresa el tipo de cambio del día de hoy");
	    	tipoCambioDolarD = Double.parseDouble(tipoCambioDolar);
	    	
	    	cambioDolar = textoImporte.getText();
	    	importe = Double.parseDouble(cambioDolar);
	    	resultado= tipoCambioDolarD * importe;
	    	
	    	textoConvertir.setText("" + resultado);
	    }
	    else {
	    	
	    	textoConvertir.setText("");
	    	tipoCambioDolar = JOptionPane.showInputDialog("Ingresa el tipo de cambio del día de hoy");
	    	tipoCambioDolarD = Double.parseDouble(tipoCambioDolar);
	    	
	    	cambioDolar = textoImporte.getText();
	    	importe = Double.parseDouble(cambioDolar);
	    	resultado= importe / tipoCambioDolarD;
	    	
	    	textoConvertir.setText("" + resultado);
	    	
	    	
	    }
	}
}
