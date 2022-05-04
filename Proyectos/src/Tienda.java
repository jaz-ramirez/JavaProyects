/**  
** @Clase: 		Tienda.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		02/11/2021
** @Descripción: Venta de artículos científicos
*/ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tienda extends JFrame implements ActionListener {
	private JTextField cantidad, valor1, valor2, valor3;
	private ButtonGroup art;
	private JRadioButton teles, micros, oscilos;
	private JButton comprar, limpiar, salir, mostrar;
	private ImageIcon  imgTeles, imgOscilos, imgMicros;
	private JLabel etiquetaCantidad;
	private JPanel panel1, panel2, panel3;
	
	public static void main (String [] ar) 
	{
		Tienda tienda1 = new Tienda();
		tienda1.setBounds(50,50, 950, 700);
		tienda1.setTitle("Venta de artículos científicos");
		tienda1.setVisible(true);
		
		
		
	}
	
	public Tienda () {

		Color fondoColor = new Color(189, 235, 255);
		Color colPanel = new Color(122, 178, 255);
		Font letra = new Font("Comic Sans MS",Font.BOLD,18);
		this.getContentPane().setBackground(fondoColor);
		setLayout(null);
		//Panels con imágenes
		panel1 = new JPanel ();
		panel1.setBounds(40, 60, 250, 250);
		panel1.setBackground(colPanel);
		add(panel1);
		
		panel2 = new JPanel ();
		panel2.setBounds(320, 60, 250, 250);
		panel2.setBackground(colPanel);
		add(panel2);
		
		panel3 = new JPanel ();
		panel3.setBounds(600, 60, 250, 250);
		panel3.setBackground(colPanel);
		add(panel3);
		
		//Radio buttons
		art = new ButtonGroup();
		teles = new JRadioButton("Telescopio");
		teles.setFont(letra);
		teles.setBounds(50, 320, 130, 40);
		teles.addActionListener(this);
		art.add(teles); 
		add(teles);

		micros = new JRadioButton("Microscopio");
		micros.setBounds(330, 320, 150, 40);
		micros.setFont(letra);
		micros.addActionListener(this);
		art.add(micros); 
		add(micros);
		
		oscilos = new JRadioButton("Osciloscopio");
		oscilos.setBounds(610, 320, 140, 40);
		oscilos.setFont(letra);
		oscilos.addActionListener(this);
		art.add(oscilos); 
		add(oscilos);
		
		//Precios
		valor1 = new JTextField(20);
		valor1.setBounds(190, 320, 80, 40);
		valor1.setEditable(false);
	    valor1.setEnabled(true);
	    valor1.setFont(letra);
	    valor1.setForeground(Color.black);
		add(valor1);
		
		valor2 = new JTextField(20);
		valor2.setBounds (490, 320, 80, 40);
		valor2.setEditable(false);
	    valor2.setEnabled(true);
	    valor2.setForeground(Color.black);
	    valor2.setFont(letra);
		add(valor2);
		
		valor3 = new JTextField(20);
		valor3.setBounds(760, 320,80, 40);
		valor3.setEditable(false);
	    valor3.setEnabled(true);
	    valor3.setFont(letra);
		valor3.setForeground(Color.black);
		add(valor3);
		
		//Cantidad
		etiquetaCantidad = new JLabel("Cantidad: ");
		etiquetaCantidad.setBounds(310, 430, 200, 30);
		etiquetaCantidad.setFont(letra);
		add(etiquetaCantidad);
		
		cantidad = new JTextField(30);
		cantidad.setBounds(430, 430, 150, 30);
		add(cantidad);
		
		//Botones
		mostrar = new JButton ("Mostrar artículos");
		mostrar.setBounds(320, 10, 200, 30);
		mostrar.setFont(letra);
		mostrar.addActionListener(this);
		add(mostrar);
		
		
		comprar = new JButton ("Comprar");
		comprar.setBounds(120, 530, 150, 30);
		comprar.setFont(letra);
		comprar.addActionListener(this);
		add(comprar);
		
		
		limpiar = new JButton ("Limpiar");
		limpiar.setBounds(360, 530, 150, 30);
		limpiar.setFont(letra);
		limpiar.addActionListener(this);
		add(limpiar);
		
		salir = new JButton ("Salir");
		salir.setBounds(580, 530, 150, 30);
		salir.setFont(letra);
		salir.addActionListener(this);
		add(salir);
		
		
	}
	
	
	public void actionPerformed(ActionEvent event)
	{
		Object origen = event.getSource();
		double telescopio = 8550, microscopio = 6980, osciloscopio = 9446, precioFinal=0, precioNormal=0, precioDesc=0;
		String articulo = "No selecccionado";
		imgTeles  = new ImageIcon ();
		imgOscilos  = new ImageIcon ();
		imgMicros  = new ImageIcon ();
		Graphics r = panel1.getGraphics();
		Graphics b = panel2.getGraphics();
		Graphics c = panel3.getGraphics();
		
		if(teles.isSelected()) 
		{
			valor1.setText("$" + telescopio);
		}
		else if (micros.isSelected()) {
			valor2.setText("$" + microscopio);
		}
		else if (oscilos.isSelected()) {
			valor3.setText("$" + osciloscopio);
		}
		
		
		
		
		if(origen==mostrar) {
			imgTeles  = new ImageIcon ("imgTelescopio.png");
			imgTeles .paintIcon(this, r, 30, 10);
			
			imgMicros  = new ImageIcon ("imgMicroscopio.jpg");
			imgMicros.paintIcon(this, b, 50, 10);
			
			imgOscilos  = new ImageIcon ("imgOsciloscopio.jpg");
			imgOscilos.paintIcon(this, c, 10, 40);

		}
		
		else if (origen==comprar) {
			double valorCant = Double.parseDouble(cantidad.getText());
			if(teles.isSelected()) 
			{
				if(valorCant <=3 && valorCant >=1) {
					precioFinal = telescopio*valorCant;
					precioNormal= precioFinal;
				}
				else if(valorCant >3 && valorCant<= 10){
					precioNormal= telescopio*valorCant;
					precioDesc = precioNormal*(0.05);
					precioFinal = precioNormal-precioDesc;
				}
				else if(valorCant >10 ){
					precioNormal= telescopio*valorCant;
					precioDesc = precioNormal*(0.10);
					precioFinal = precioNormal-precioDesc;
				}
				articulo = "Telescopio(s)";
				JOptionPane.showMessageDialog(null, "Felicidades, su compra se ha realizado con éxito\n\n"
						+ "Artículo: " + articulo + "\nPrecio: $" + microscopio + " \nArtículo(s): " + valorCant +
						"\nPrecio sin descuento: $" + precioNormal + "\nDescuento: $"+precioDesc+"\nImporte total: $"+precioFinal+
						"\n\nGracias por su compra. :)");
			}
			else if(micros.isSelected())
			{
				
				if(valorCant <=3 && valorCant >=1) {
					precioFinal = microscopio*valorCant;
					precioNormal= precioFinal;
				}
				else if(valorCant >3 && valorCant<= 10){
					precioNormal= microscopio*valorCant;
					precioDesc = precioNormal*(0.05);
					precioFinal = precioNormal-precioDesc;
				}
				else if(valorCant >10 ){
					precioNormal= microscopio*valorCant;
					precioDesc = precioNormal*(0.10);
					precioFinal = precioNormal-precioDesc;
				}
				articulo = "Microscopio(s)";
				JOptionPane.showMessageDialog(null, "Felicidades, su compra se ha realizado con éxito\n\n"
						+ "Artículo: " + articulo + "\nPrecio: $" + telescopio + " \nArtículo(s): " + valorCant +
						"\nPrecio sin descuento: $" + precioNormal + "\nDescuento: $"+precioDesc+"\nImporte total: $"+precioFinal+
						"\n\nGracias por su compra. :)");
			}
			else if(oscilos.isSelected())
			{
				
				if(valorCant <=3 && valorCant >=1) {
					precioFinal = microscopio*valorCant;
					precioNormal= precioFinal;
				}
				else if(valorCant >3 && valorCant<= 10){
					precioNormal = osciloscopio*valorCant;
					precioDesc = precioNormal*(0.05);
					precioFinal = precioNormal-precioDesc;
				}
				else if(valorCant >10 ){
					precioNormal = osciloscopio*valorCant;
					precioDesc = precioNormal*(0.10);
					precioFinal = precioNormal-precioDesc;
				}
				articulo = "Osciloscopio(s)";
				JOptionPane.showMessageDialog(null, "Felicidades, su compra se ha realizado con éxito\n\n"
						+ "Artículo: " + articulo + "\nPrecio: $" + osciloscopio + " \nArtículo(s): " + valorCant +
						"\nPrecio sin descuento: $" + precioNormal + "\nDescuento: $"+precioDesc+"\nImporte total: $"+precioFinal+
						"\n\nGracias por su compra. :)");
			}
			
			
			
			
			
		}
		else if(origen==limpiar) {
			cantidad.setText("");
			valor1.setText("");
			valor2.setText("");
			valor3.setText("");
		}
		else if (origen==salir){
			System.exit(0);
		}
	}

			
}
