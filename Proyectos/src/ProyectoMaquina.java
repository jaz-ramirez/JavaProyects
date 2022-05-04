/**  
** @Clase: 		ProyectoMaquina.java
** @Autor: 		Karla Jazmín Ramírez Domínguez
** @Grupo:		62B
** @Profesora: 	Adriana Vega Palos
** @Fecha: 		19/11/2021
** @Descripción: Máquina expendedora de electrónicos
*/ 

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ProyectoMaquina extends JFrame implements ActionListener, ItemListener {
	private ButtonGroup art;
	private JRadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	private JButton comprar, limpiar, salir, mostrar;
	private ImageIcon  img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, mon1, mon2, mon5, mon10, licencia;
	private JLabel nombre;
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panelMonedas, creative;
	private JCheckBox uno, dos, cinco, diez;
	private int money=0, dinero=0, total, monedas10=0, monedas5=0, monedas2=0, monedas1=0, residuo=0, cambio=0;
	private String cantidadMonedas;
	private JTextArea areaTexto;
	
	public static void main (String [] ar) 
	{
		ProyectoMaquina tienda1 = new ProyectoMaquina();
		tienda1.setBounds(50,50, 1300, 750);
		tienda1.setTitle("Máquina expendedora de electrónicos");
		tienda1.setVisible(true);
		
	}
	
	public ProyectoMaquina() {

		Color fondoColor = new Color(189, 235, 255);
		Color colPanel = new Color(122, 178, 255);
		Font letra = new Font("Comic Sans MS",Font.BOLD,14);
		Font titulo = new Font("SERIF",Font.BOLD,24);
		this.getContentPane().setBackground(fondoColor);
		setLayout(null);
		
		//Panels con imágenes
		panel1 = new JPanel ();
		panel1.setBounds(20, 60, 180, 180);
		panel1.setBackground(colPanel);
		add(panel1);
		
		panel2 = new JPanel ();
		panel2.setBounds(220, 60, 180, 180);
		panel2.setBackground(colPanel);
		add(panel2);
		
		panel3 = new JPanel ();
		panel3.setBounds(420, 60, 180, 180);
		panel3.setBackground(colPanel);
		add(panel3);
		
		panel4 = new JPanel ();
		panel4.setBounds(620, 60, 180, 180);
		panel4.setBackground(colPanel);
		add(panel4);
		
		panel5 = new JPanel ();
		panel5.setBounds(820, 60, 180, 180);
		panel5.setBackground(colPanel);
		add(panel5);
		
		panel6 = new JPanel ();
		panel6.setBounds(20, 300, 180, 180);
		panel6.setBackground(colPanel);
		add(panel6);
		
		panel7 = new JPanel ();
		panel7.setBounds(220, 300, 180, 180);
		panel7.setBackground(colPanel);
		add(panel7);
		
		panel8 = new JPanel ();
		panel8.setBounds(420, 300, 180, 180);
		panel8.setBackground(colPanel);
		add(panel8);
		
		panel9 = new JPanel ();
		panel9.setBounds(620, 300, 180, 180);
		panel9.setBackground(colPanel);
		add(panel9);
		
		panel10 = new JPanel ();
		panel10.setBounds(820, 300, 180, 180);
		panel10.setBackground(colPanel);
		add(panel10);
		
	
		panelMonedas = new JPanel ();
		panelMonedas.setBounds(1025, 60, 110, 400);
		panelMonedas.setBackground(fondoColor);
		add(panelMonedas);
		
		creative = new JPanel ();
		creative.setBounds(80, 580, 190, 80);
		creative.setBackground(Color.white);
		add(creative);
		//Radio buttons
		art = new ButtonGroup();
		b1 = new JRadioButton("Capacitor $12");
		b1.setFont(letra);
		b1.setBounds(20, 245, 130, 30);
		b1.addActionListener(this);
		art.add(b1); 
		add(b1);

		b2= new JRadioButton("Potenciómetro $13");
		b2.setBounds(220, 245, 170, 30);
		b2.setFont(letra);
		b2.addActionListener(this);
		art.add(b2); 
		add(b2);
		
		b3= new JRadioButton("C.I. $18");
		b3.setBounds(420, 245, 130, 30);
		b3.setFont(letra);
		b3.addActionListener(this);
		art.add(b3); 
		add(b3);
		
		b4= new JRadioButton("Display $20");
		b4.setBounds(620, 245, 130, 30);
		b4.setFont(letra);
		b4.addActionListener(this);
		art.add(b4); 
		add(b4);
		
		b5= new JRadioButton("Transistor $14");
		b5.setBounds(820, 245, 130, 30);
		b5.setFont(letra);
		b5.addActionListener(this);
		art.add(b5); 
		add(b5);
		
		b6= new JRadioButton("Switch $8");
		b6.setBounds(20, 485, 130, 30);
		b6.setFont(letra);
		b6.addActionListener(this);
		art.add(b6); 
		add(b6);
		
		b7= new JRadioButton("Resistencias $3");
		b7.setBounds(220, 485, 150, 30);
		b7.setFont(letra);
		b7.addActionListener(this);
		art.add(b7); 
		add(b7);
		
		b8= new JRadioButton("Leds $5");
		b8.setBounds(420, 485, 150, 30);
		b8.setFont(letra);
		b8.addActionListener(this);
		art.add(b8); 
		add(b8);
		
		b9= new JRadioButton("Fotoresistencia $19");
		b9.setBounds(620, 485, 180, 30);
		b9.setFont(letra);
		b9.addActionListener(this);
		art.add(b9); 
		add(b9);
		
		b10= new JRadioButton("Cables conectores $15");
		b10.setBounds(820, 485, 200, 30);
		b10.setFont(letra);
		b10.addActionListener(this);
		art.add(b10); 
		add(b10);
		
		
		uno = new JCheckBox("$1 peso");
		uno.setBounds(1140,95,100,30);
		add(uno);
		uno.addItemListener(this);
		
		dos = new JCheckBox("$2 pesos");
		dos.setBounds(1140,185,100,30);
		add(dos);
		dos.addItemListener(this);
		
		cinco = new JCheckBox("$5 pesos");
		cinco.setBounds(1140,275,100,30);
		add(cinco);
		cinco.addItemListener(this);
		
		diez = new JCheckBox("$10 pesos");
		diez.setBounds(1140,372,100,30);
		add(diez);
		diez.addItemListener(this);

		nombre = new JLabel("MÁQUINA EXPENDEDORA: ELECTRÓNICOS");
		nombre.setBounds(310, 10, 810, 30);
		nombre.setFont(titulo);
		add(nombre);
		
		areaTexto= new JTextArea(5,3);
		areaTexto.setBounds(1100,470,150,90);
		areaTexto.setEditable(false);
		add(areaTexto);
		
		comprar = new JButton ("Comprar");
		comprar.setBounds(820, 570, 150, 30);
		comprar.setFont(letra);
		comprar.addActionListener(this);
		add(comprar);
		
		salir = new JButton ("Salir");
		salir.setBounds(580, 570, 150, 30);
		salir.setFont(letra);
		salir.addActionListener(this);
		add(salir);
		
		
	}
	public void paint(Graphics g) {

        super.paint(g);
        img1 = new ImageIcon(new ImageIcon("1capacitor.jpg").getImage().getScaledInstance(165, 140, Image.SCALE_DEFAULT));
        img2 = new ImageIcon(new ImageIcon("2potenciometro.jpg").getImage().getScaledInstance(150, 160, Image.SCALE_DEFAULT));
        img3 = new ImageIcon(new ImageIcon("3CI.jpg").getImage().getScaledInstance(165, 158, Image.SCALE_DEFAULT));
        img4 = new ImageIcon(new ImageIcon("4display.jpg").getImage().getScaledInstance(165, 150, Image.SCALE_DEFAULT));
        img5 = new ImageIcon(new ImageIcon("5transistor.jpg").getImage().getScaledInstance(165, 160, Image.SCALE_DEFAULT));
        img6 = new ImageIcon(new ImageIcon("6switch.jpg").getImage().getScaledInstance(165, 120, Image.SCALE_DEFAULT));
        img7 = new ImageIcon(new ImageIcon("7resistores.jpg").getImage().getScaledInstance(165, 120, Image.SCALE_DEFAULT));
        img8 = new ImageIcon(new ImageIcon("8led.jpg").getImage().getScaledInstance(165, 160, Image.SCALE_DEFAULT));
        img9 = new ImageIcon(new ImageIcon("9fotoresistencia.jpg").getImage().getScaledInstance(165, 140, Image.SCALE_DEFAULT));
        img10 = new ImageIcon(new ImageIcon("10 cables.jpg").getImage().getScaledInstance(168, 128, Image.SCALE_DEFAULT));
        
        
        mon1 = new ImageIcon(new ImageIcon("moneda1.png").getImage().getScaledInstance(110, 60, Image.SCALE_DEFAULT));
        mon2 = new ImageIcon(new ImageIcon("moneda2.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        mon5 = new ImageIcon(new ImageIcon("moneda 5.png").getImage().getScaledInstance(69, 69, Image.SCALE_DEFAULT));
        mon10 = new ImageIcon(new ImageIcon("moneda 10.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        licencia = new ImageIcon(new ImageIcon("licencia.png").getImage().getScaledInstance(180, 63, Image.SCALE_DEFAULT));
        

        Graphics a = panel1.getGraphics();
        Graphics b = panel2.getGraphics();
        Graphics c = panel3.getGraphics();
        Graphics d = panel4.getGraphics();
        Graphics e = panel5.getGraphics();
        Graphics f = panel6.getGraphics();
        Graphics g1 = panel7.getGraphics();
        Graphics h = panel8.getGraphics();
        Graphics i = panel9.getGraphics();
        Graphics j = panel10.getGraphics();
        
        Graphics k = panelMonedas.getGraphics();
        Graphics l = panelMonedas.getGraphics();
        Graphics m = panelMonedas.getGraphics();
        Graphics n = panelMonedas.getGraphics();
        
        Graphics lic = creative.getGraphics();

        img1.paintIcon(this, a, 5,10);
        img2.paintIcon(this, b, 5,10);
        img3.paintIcon(this, c, 5,10);
        img4.paintIcon(this, d, 5,10);
        img5.paintIcon(this, e, 5,10);
        img6.paintIcon(this, f, 5,10);
        img7.paintIcon(this, g1, 5,10);
        img8.paintIcon(this, h, 5,10);
        img9.paintIcon(this, i, 5,10);
        img10.paintIcon(this, j, 5,10);
        
        mon1.paintIcon(this, k, 5,30);
        mon2.paintIcon(this, l, 30,110);
        mon5.paintIcon(this, m, 30,200);
        mon10.paintIcon(this, n, 30,290);
        
        licencia.paintIcon(this, lic, 5,5);
        
    }
	@Override
	public void itemStateChanged(ItemEvent e) {
		String nuevaLinea = "\r \n";
		areaTexto.setText("");
		if(b1.isSelected()||b2.isSelected()||b3.isSelected()||b4.isSelected()||b5.isSelected()||b6.isSelected()||b7.isSelected()||b8.isSelected()||b9.isSelected()||b10.isSelected())
		{
			monedas10=0;
			monedas5=0;
			monedas2=0;
			monedas1=0;
		}
		
		if (uno.isSelected()) {
			if(money<=20)
			{
				cantidadMonedas = JOptionPane.showInputDialog("Ingresa la cantidad de monedas de 1 peso a introducir");
				dinero = Integer.parseInt(cantidadMonedas);
				money+=dinero;
				if(money>20||money>20)
				{
					JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos, intente de nuevo" );
					money-=dinero;
				}
				
			}
			else
			{
				areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
				JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos, intente de nuevo" );
				
			}
			areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
			
		}
		
		if (dos.isSelected()) {
			if(money<=20)
			{
				cantidadMonedas = JOptionPane.showInputDialog("Ingresa la cantidad de monedas de 2 pesos a introducir");
				dinero = Integer.parseInt(cantidadMonedas);
				dinero*=2;
				money+=dinero;
				if(dinero>20||money>20)
				{
					JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos" );
					money-=dinero;
				}
				
			}
			else
			{
				areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
				JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos, intente de nuevo" );
			}
			areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
			
		}
		if (cinco.isSelected()) {
			if(money<=20)
			{
				cantidadMonedas = JOptionPane.showInputDialog("Ingresa la cantidad de monedas de 5 pesos a introducir");
				dinero = Integer.parseInt(cantidadMonedas);
				dinero*=5;
				money+=dinero;
				if(dinero>20||money>20)
				{
					JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos" );
					money-=dinero;
				}
				
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos, intente de nuevo" );
			}
			areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
		}
		if (diez.isSelected()) {
			if(money<=20)
			{
				cantidadMonedas = JOptionPane.showInputDialog("Ingresa la cantidad de monedas de 10 pesos a introducir");
				dinero = Integer.parseInt(cantidadMonedas);
				dinero*=10;
				money+=dinero;
				if(dinero>20 || money>20)
				{
					JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos");
					money-=dinero;
				}
				else
				{
					areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
				}
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "La cantidad máxima de dinero que puedes ingresar es 20 pesos, intente de nuevo" );
			}
			areaTexto.append("Tu saldo es: " + money+ nuevaLinea);
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object origen = e.getSource();
		int capacitor=12, potenciometro=13, ci=18, display=20, transistor=14, interruptor=8, led=5, resistor=3, fotoresistor=19, cable=15;
		if(b1.isSelected()||b2.isSelected()||b3.isSelected()||b4.isSelected()||b5.isSelected()||b6.isSelected()||b7.isSelected()||b8.isSelected()||b9.isSelected()||b10.isSelected())
		{
			monedas10=0;
			monedas5=0;
			monedas2=0;
			monedas1=0;
		}
		if (e.getSource()==comprar) {
			
			if(b1.isSelected()) 
			{
				if(money<capacitor)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - capacitor;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: "+ monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b2.isSelected())
			{
				if(money<potenciometro)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - potenciometro;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b3.isSelected())
			{
				if(money<ci)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - ci;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b4.isSelected())
			{
				if(money<display)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - display;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				
				
			}
			else if(b5.isSelected())
			{
				if(money<transistor)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - transistor;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				
			}
			else if(b6.isSelected())
			{
				if(money<interruptor)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - interruptor;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b7.isSelected())
			{
				if(money<resistor)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - resistor;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b8.isSelected())
			{
				if(money<led)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - led;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				///JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b9.isSelected())
			{
				if(money<fotoresistor)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - fotoresistor;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else if(b10.isSelected())
			{
				if(money<cable)
				{
					JOptionPane.showMessageDialog(null, "Saldo insuficiente, introduzca más dinero" );
				}
				else {
					cambio = money - cable;
					if(cambio>=10)
					{
						monedas10=cambio/10;
						residuo= cambio%10;
					}
					else
					{
						residuo=cambio;
					}
					
					if(residuo>=5)
					{
						monedas5=residuo/5;
						residuo%=5;
					}
					if(residuo>=2)
					{
						monedas2=residuo/2;
						residuo%=2;
					}
					if(residuo>=1)
					{
						monedas1=residuo;
					}
					JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "
							+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
				}
				//JOptionPane.showMessageDialog(null, "Su cambio es: $"+ cambio +"\nMonedas de 10 pesos: " + monedas10 + "\n Monedas de 5 pesos: "+ monedas5 + "\n Monedas de 2 pesos: " + monedas2+"\n Monedas de 1 peso: " + monedas1);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción" );
			}
			
			
		}
		
		if (origen==salir){
			System.exit(0);
		}
		// TODO Auto-generated method stub
		
	}

}
