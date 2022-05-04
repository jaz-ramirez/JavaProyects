/**  
** @Clase: 		Opciones.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		27/10/2021
** @Descripción: Seleccionar la operación aritmética.
*/ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Opciones extends JFrame implements ActionListener
{
	private JTextField tf1, tf2;
	private ButtonGroup bg, ec;
	private JRadioButton radio1, radio2, radio3, radio4, c, v, d;
	private JButton boton1, botonTermina, limpiar;
	private double acumulaOperaciones=0, resultado;
	private JLabel valor1, valor2;
	
	public static void main (String [] ar) 
	{
		Opciones formulario1 = new Opciones();
		formulario1.setBounds(100,100, 380, 350);
		formulario1.setTitle("Maneo de radio Botón");
		formulario1.setVisible(true);
	}
	
	public Opciones () 
	{
		
		setLayout(null);
		tf1 = new JTextField();
		tf1.setBounds(60, 10, 80, 30);
		add(tf1);
		
		valor1 = new JLabel("Valor 1: ");
		valor1.setBounds(10, 10, 80, 30);
		add(valor1);
		
		valor2 = new JLabel("Valor 2: ");
		valor2.setBounds(10, 50, 80, 30);
		add(valor2);
		
		
		tf2 = new JTextField();
		tf2.setBounds(60, 50, 80, 30);
		add(tf2);
		
		bg = new ButtonGroup();
		radio1 = new JRadioButton("Sumar");
		radio1.setBounds(10, 110, 100, 30);
		bg.add(radio1); //incluir el JRadioButton a el grupo
		add(radio1);
		
		//bg = new ButtonGroup();
		radio2 = new JRadioButton("Restar");
		radio2.setBounds(120, 110, 100, 30);
		bg.add(radio2); //incluir el JRadioButton a el grupo
		add(radio2);
		
		//bg = new ButtonGroup();
		radio3 = new JRadioButton("Multiplicar");
		radio3.setBounds(10, 140, 100, 30);
		bg.add(radio3); //incluir el JRadioButton a el grupo
		add(radio3);
		
		//bg = new ButtonGroup();
		radio4 = new JRadioButton("Dividir");
		radio4.setBounds(120, 140, 100, 30);
		bg.add(radio4); //incluir el JRadioButton a el grupo
		add(radio4);
		
		boton1 = new JButton ("Resultado");
		boton1.setBounds(40, 180, 100, 30);
		boton1.addActionListener(this);
		add(boton1);
		
		limpiar = new JButton ("Limpiar");
		limpiar.setBounds(180, 180, 100, 30);
		limpiar.addActionListener(this);
		add(limpiar);
		
		botonTermina = new JButton ("Cerrar apliacación");
		botonTermina.setBounds(105, 230, 140, 30);
		botonTermina.addActionListener(this);
		add(botonTermina);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource()==boton1) {
			double v1 = Double.parseDouble(tf1.getText());
			double v2 = Double.parseDouble(tf2.getText());
			
			if(radio1.isSelected()) 
			{
				resultado = v1 + v2;
				acumulaOperaciones = acumulaOperaciones+resultado;//Acumulador
				setTitle(String.valueOf(resultado));
				JOptionPane.showMessageDialog(null, "Resultado : "+ resultado + 
						"\n La acumulación de las operaciones que has realizado es : " + acumulaOperaciones );
				
			}
			else if(radio2.isSelected())
			{
				resultado = v1 -v2;
				acumulaOperaciones = acumulaOperaciones+resultado;//Acumulador
				setTitle(String.valueOf(resultado));
				JOptionPane.showMessageDialog(null, "Resultado : "+ resultado + 
						"\n La acumulación de las operaciones que has realizado es : " + acumulaOperaciones );
			}
			else if(radio3.isSelected())
			{
				resultado = v1 *v2;
				acumulaOperaciones = acumulaOperaciones+resultado;//Acumulador
				setTitle(String.valueOf(resultado));
				JOptionPane.showMessageDialog(null, "Resultado : "+ resultado + 
						"\n La acumulación de las operaciones que has realizado es : " + acumulaOperaciones );
			}
			else if(radio4.isSelected())
			{
				
				
				if(v2 ==0)
				{
					JOptionPane.showMessageDialog(null, "Las divisiones entre cero están indeterminadas" +
							"por lo que no se puede realizar lo solicitado. Introduzca otro número.");
				}
				else
				{
					resultado = v1 / v2;
					acumulaOperaciones = acumulaOperaciones+resultado;//Acumulador
					setTitle(String.valueOf(resultado));
					JOptionPane.showMessageDialog(null, "Resultado : "+ resultado + 
							"\n La acumulación de las operaciones que has realizado es : " + acumulaOperaciones );
				}
				
			}
			
			
		}
		else if(e.getSource()==limpiar) {
			tf1.setText("");
			tf2.setText("");
			acumulaOperaciones =0;
		}
		else if(e.getSource()==botonTermina) {
			System.exit(0);
		}
	}


	
}