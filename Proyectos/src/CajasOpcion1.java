/**  

** @Clase: 		CajasOpcion1.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		27/10/2021
** @Descripción: Trabajar con checkbox .
*/ 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CajasOpcion1 extends JFrame 
implements ActionListener, ItemListener {
	private JCheckBox refresco, hamburguesa, papas;
	private JTextArea areaTexto;
	private JButton botonTermina;
	private JPanel panel1;
	private ImageIcon imagenDino;
	private int precioRefresco, precioHamburguesa, precioPapas, venta; //variables encapsuladas
	
	
	public static void main(String[] args) {
		CajasOpcion1 demo = new CajasOpcion1();
			demo.setSize(600,600);
			demo.setVisible(true);
			demo.setTitle("Las Super Dino Hamburguesas");
	}
	public CajasOpcion1() {
		setLayout(null);
		
		Container ventana = getContentPane();
		
		panel1 = new JPanel();
		panel1. setBounds(60,300,200,150);
		panel1.setPreferredSize(new Dimension(300,300));
		panel1.setBackground(Color.green);
		ventana.add(panel1);
		
		refresco = new JCheckBox("DinoSodaBig");
		refresco.setBounds(115,10,150,40);
		ventana.add(refresco);
		refresco.addItemListener(this);
		
		hamburguesa = new JCheckBox("DinoCheeseBurger Sencilla");
		hamburguesa.setBounds(115,50,180,30);
		ventana.add(hamburguesa);
		hamburguesa.addItemListener(this);
		
		papas = new JCheckBox("GajoDinoPapas");
		papas.setBounds(115,80,160,30);
		ventana.add(papas);
		papas.addItemListener(this);
		
		areaTexto= new JTextArea(5,3);
		areaTexto.setBounds(300,40,240,300);
		areaTexto.setEditable(false);
		ventana.add(areaTexto);
		
		botonTermina = new JButton("Cerrar Aplicacion");
		botonTermina.setBounds(40,140,140,100);
		ventana.add(botonTermina);
		botonTermina.addActionListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		String nuevaLinea = "\r \n";
		areaTexto.setText("");
		
		if (refresco.isSelected()) {
			areaTexto.append("Refresco Grande precio $35.00" + nuevaLinea);
			precioRefresco = 35;
			imagenDino = new ImageIcon();
			Graphics r = panel1.getGraphics();
			imagenDino= new ImageIcon("dinoSoda.jpg");
			imagenDino.paintIcon(this,r,10,10);
			r.drawString ("", 50,240);
		}
		
		if (hamburguesa.isSelected()) {
			areaTexto.append("Hamburguesa sencilla con queso $80.00" + nuevaLinea);
			precioHamburguesa = 80;
			imagenDino = new ImageIcon();
			Graphics r = panel1.getGraphics();
			imagenDino= new ImageIcon("donoBurguer.jpg");
			imagenDino.paintIcon(this,r,10,10);
			r.drawString ("", 50,240);
		}
		if (papas.isSelected()) {
			areaTexto.append("Papas de gajos $45.00" + nuevaLinea);
			precioPapas = 45;
			imagenDino = new ImageIcon();
			Graphics r = panel1.getGraphics();
			imagenDino= new ImageIcon("dinoPapas.png");
			imagenDino.paintIcon(this,r,10,10);
			r.drawString ("", 50,240);
		}
	}
	public void actionPerformed(ActionEvent event) {
		
		venta = precioPapas + precioHamburguesa + precioRefresco;
		JOptionPane.showMessageDialog(null, "Total consumo = " + venta);
		System.exit(0);
	}
}