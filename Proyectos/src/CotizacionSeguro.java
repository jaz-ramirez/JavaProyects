/**  
** @Clase: 		CasaCambio.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		23/10/2021
** @Descripción: Cotización de Seguros
*/ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CotizacionSeguro extends JFrame implements ActionListener{
	
	private JPanel panel1, panel2;
	private JButton botonSalir, botonCasa, botonSeguroAuto;
	private JTextField tipoCasa, tipoAuto, precio, precioTotal;
	private ImageIcon  imagenCasa, imagenAuto;
	private JLabel textoCasa, textoAuto;
	

	
	
	public static void main (String[] args){
		
		CotizacionSeguro marco= new CotizacionSeguro();
		
		marco.setSize(500, 600);
		marco.setTitle("Cotización seguro");
		marco.crearGUI();
		marco.setVisible(true);
		marco.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
	}
	
	public void crearGUI() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		
		Color colorBoton = new Color(117, 211, 255);
		Color colorPanel = new Color(255, 153, 255);
		Font fuenteBoton = new Font("CALIBRI", Font.BOLD, 16);
		
		
		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension (400, 300));
		panel1.setBackground(colorPanel);
		ventana.add(panel1);
		
		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension (400, 300));
		panel2.setBackground(colorPanel);
		ventana.add(panel2);
		
		
		botonCasa = new JButton("Casa");
		botonCasa.setBackground(colorBoton);
		botonCasa.setFont(fuenteBoton);
		botonCasa.addActionListener(this);
		ventana.add(botonCasa);
		
		botonSeguroAuto = new JButton("Seguro auto");
		botonSeguroAuto.setBackground(colorBoton);
		botonSeguroAuto.setFont(fuenteBoton);
		botonSeguroAuto.addActionListener(this);
		ventana.add(botonSeguroAuto);
		
		botonSalir = new JButton("Salir");
		botonSalir.setBackground(colorBoton);
		botonSalir.setFont(fuenteBoton);
		botonSalir.addActionListener(this);
		ventana.add(botonSalir);
		
		
		
		precio= new JTextField(20);
		precio.setFont(fuenteBoton);
		precio.setEditable(false);
		precio.setEnabled(false);
		precio.setForeground(Color.black);
		ventana.add(precio);
		
		precioTotal= new JTextField(20);
		precioTotal.setFont(fuenteBoton);
		precioTotal.setEditable(false);
		precioTotal.setEnabled(false);
		precioTotal.setForeground(Color.black);
		ventana.add(precioTotal);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Object origen = event.getSource();
		double metros = 0, precioCasa = 10000.00, precioCasaIva, precioAuto= 4000.00, precioAutoIva; 
		String cobertura, metrosCasa, limitada, amplia;
		imagenCasa = new ImageIcon ();
		imagenAuto = new ImageIcon ();
		
				
		
		
		Graphics r = panel1.getGraphics();
		Graphics b = panel2.getGraphics();
		
		
		//Precio de la casa
		if(origen == botonCasa) {
			imagenCasa = new ImageIcon ("ImgCasa.jpg");
			imagenCasa.paintIcon(this, r, 10, 10);
			
			r.drawString("Terreno 90 m construidos y un piso", 20, 20);
			
			metrosCasa = JOptionPane.showInputDialog("Ingresa los metros de tú casa (únicamente el número)");
	    	metros = Double.parseDouble(metrosCasa);
	    	
	    	
	    	
	    	
	    	if(metros == 90) {
	    		precio.setText("Precio sin IVA $" + precioCasa );
	    		
	    		precioCasaIva = precioCasa*1.16;
	    		precioTotal.setText("Precio con IVA $" + precioCasaIva);
	    	}
	    	else if(metros>90 && metros<=200) {
	    		precioCasa = 20000;
	    		precio.setText("Precio sin IVA $" + precioCasa );
	    		precioCasaIva = precioCasa*1.16;
	    		precioTotal.setText("Precio con IVA $" + precioCasaIva);
	    	}
	    	else {
	    		precioTotal.setText("Sin datos");
	    		precio.setText("Sin datos");
	    	}
	    	
	    	
	    	
	    	
	    	
		}
		//Precios de auto
		if(origen == botonSeguroAuto) {
			// Permite modificar el tamaño de la imagen
    		//imagenAuto = new ImageIcon(new ImageIcon("imagenAuto.png").getImage().getScaledInstance(200, 140, Image.SCALE_DEFAULT));

			imagenAuto = new ImageIcon ("ImgAuto.jpg");
			imagenAuto.paintIcon(this, b, 10, 10);
			
			b.drawString("Automóvil", 20,20);
			
			cobertura = JOptionPane.showInputDialog("Ingresa el tipo de cobertura en mayúsculas (AMPLIA, LIMITADA");
			
			limitada = "LIMITADA";
			amplia = "AMPLIA";
			
			if(limitada.equals(cobertura) ) {
				precio.setText("Precio sin IVA $" + precioAuto);
				
				precioAutoIva = precioAuto*1.16;
	    		precioTotal.setText("Precio con IVA $" + precioAutoIva);
			}
			else if(amplia.equals(cobertura)) {
				precioAuto= 11500.00;
				precio.setText("Precio sin IVA $" + precioAuto);
				
				precioAutoIva = precioAuto*1.16;
				
	    		precioTotal.setText("Precio con IVA $" + precioAutoIva);
			}
			else
			{
				precioTotal.setText("Sin datos");
	    		precio.setText("Sin datos");
			}
		}
		else if (origen == botonSalir) {
			System.exit(0);
		}
	
	}

}
