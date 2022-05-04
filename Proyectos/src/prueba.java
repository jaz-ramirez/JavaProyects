import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prueba extends JFrame implements ActionListener{
    private JTextField tf1;
    private JPanel panel1, panel2, panel3, panel4;
    private ButtonGroup bg;
    private JRadioButton radio1, radio2, radio3;
    private JButton boton1, botonTermina, botonLimpiar;
    private double costop1, precio1=95, des5=0.05, descmediop1, des10=0.10, desccompp1, preciop1a, preciop1b; 
    private double costop2, precio2=359, descmediop2, desccompp2, preciop2a, preciop2b; 
    private double costop3, precio3=399, descmediop3, desccompp3, preciop3a, preciop3b; 
    private JLabel titulo, etqv1, esp, esp1, esp2, esp3;
    private ImageIcon imagen;
public static void main(String[] ar){
    prueba marco = new prueba();
    marco.setSize(600, 600);
    marco.crearGUI();
    marco.setTitle("Cotizacion de Seguros");        
    marco.setVisible(true);
}

void crearGUI(){

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container ventana = getContentPane();
    ventana.setLayout(new FlowLayout());
    panel1 = new JPanel();
    panel1.setBounds(20,50,170,240);
    ventana.add(panel1);

    panel2 = new JPanel();
    panel2.setBounds(200,50,170,240);
    ventana.add(panel2);

    panel3 = new JPanel();
    panel3.setBounds(380,50,170,240);
    ventana.add(panel3);

    panel4 = new JPanel();
    panel4.setBounds(360,430,150,100);
    ventana.add(panel4);
  
    titulo = new JLabel("Tienda de Juegos de Mesa");
    titulo.setBounds(200, 10, 200,30);
    add(titulo);
    setLayout(null);
    etqv1 = new JLabel("Cantidad");
    etqv1.setBounds(310, 310, 100, 30);
    tf1=new JTextField();
    tf1.setBounds(200,310,100,30);
    add(tf1);
    add(etqv1);

    bg = new ButtonGroup();
    radio1=new JRadioButton("Articulo1");
    radio1.setBounds(10,260,100,30);
    bg.add(radio1);
    radio1.addActionListener(this);
    add(radio1);

    radio2=new JRadioButton("Articulo2");
    radio2.setBounds(200,260,100,30);
    bg.add(radio2);
    radio2.addActionListener(this);
    add(radio2);

    radio3=new JRadioButton("Articulo3");
    radio3.setBounds(380,260,100,30);//posición del objeto
    bg.add(radio3);
    radio3.addActionListener(this);
    add(radio3);

    boton1 = new JButton("Comprar");
    boton1.setBounds(20,380,160,30);
    boton1.addActionListener(this);
    add(boton1);

    botonTermina = new JButton("Salir");
    botonTermina.setBounds(380,380,160,30);
    add(botonTermina);
    botonTermina.addActionListener(this);
    
    botonLimpiar = new JButton("Limpiar");
    botonLimpiar.setBounds(200,380,160,30);
    add(botonLimpiar);
    botonLimpiar.addActionListener(this);
    
    esp = new JLabel("ESPECIFICACIONES DE LOS PRODUCTOS");
    esp.setBounds(20, 430, 400,30);
    add(esp);

    esp1 = new JLabel("1. De 1 a 3 articulos, costo normal");
    esp1.setBounds(20, 460, 400,30);
    add(esp1);

    esp2 = new JLabel("2. De 4 a 10 articulos, 5% de descuento ");
    esp2.setBounds(20, 480, 400,30);
    add(esp2);

    esp3 = new JLabel("3. De 11 articulos en adelante, 10% de descuento");
    esp3.setBounds(20, 500, 400,30);
    add(esp3);
  
  }


public void actionPerformed(ActionEvent e) {
    Object origen = e.getSource();
    imagen = new ImageIcon();//Instanciando el objeto imagen
    Graphics r = panel1.getGraphics();
    Graphics b = panel2.getGraphics();
    Graphics g = panel3.getGraphics();  
    Graphics a = panel4.getGraphics();  
   
    if(radio1.isSelected())
    {
      imagen = new ImageIcon("jmesa1.png");
      imagen = new ImageIcon(new ImageIcon("jmesa1.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
      imagen.paintIcon(this, r, 20, 10);
      imagen = new ImageIcon("fondo1.png");
      imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
      imagen.paintIcon(this, b, 20, 10);
      imagen.paintIcon(this, g, 20, 10);
      r.drawString("Precio: $95", 100, 230);
      imagen = new ImageIcon("fondo1.png");
      imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(80, 40, Image.SCALE_DEFAULT));
      imagen.paintIcon(this, b, 85, 210);
      imagen.paintIcon(this, g, 95, 210);
      imagen = new ImageIcon("logo3.png");
      imagen = new ImageIcon(new ImageIcon("logo3.png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
      imagen.paintIcon(this, a, 20, 10);
    }
  if(radio2.isSelected())
  {
    imagen = new ImageIcon("jmesa2.png");
    imagen = new ImageIcon(new ImageIcon("jmesa2.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, b, 20, 10);
    imagen = new ImageIcon("fondo1.png");
    imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, r, 20, 10);
    imagen.paintIcon(this, g, 20, 10);
    b.drawString("Precio: $359", 100, 230);
    imagen = new ImageIcon("fondo1.png");
    imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(80, 40, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, r, 85, 210);
    imagen.paintIcon(this, g, 95, 210);
    imagen = new ImageIcon("logo3.png");
    imagen = new ImageIcon(new ImageIcon("logo3.png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, a, 20, 10);
  }
  if(radio3.isSelected())
  {
    imagen = new ImageIcon("jmesa3.png");
    imagen = new ImageIcon(new ImageIcon("jmesa3.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, g, 20, 10);
    g.drawString("Precio: $399", 100, 230);
    imagen = new ImageIcon("fondo1.png");
    imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, b, 20, 10);
    imagen.paintIcon(this, r, 20, 10);
    imagen = new ImageIcon("fondo1.png");
    imagen = new ImageIcon(new ImageIcon("fondo1.png").getImage().getScaledInstance(80, 40, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, b, 85, 210);
    imagen.paintIcon(this, r, 85, 210);
    imagen = new ImageIcon("logo3.png");
    imagen = new ImageIcon(new ImageIcon("logo3.png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
    imagen.paintIcon(this, a, 20, 10);
  }
  
    if(origen==boton1){
        double v1=Double.parseDouble(tf1.getText());
    
    if(radio1.isSelected())
    {
       if(v1 <= 3){
           costop1= v1*precio1;
            JOptionPane.showMessageDialog(null, "El costo es de: " + costop1, "Comprar", JOptionPane.INFORMATION_MESSAGE);
       }
       else if(v1 >= 4 && v1<=10){
         costop1= precio1*v1;
         descmediop1 = des5 * costop1;
         preciop1a= costop1 - descmediop1;
         JOptionPane.showMessageDialog(null, "El costo es de: " + preciop1a, "Descuento del 5%", JOptionPane.INFORMATION_MESSAGE);
       }
       else if(v1 >= 11){
         costop1= precio1*v1;
         desccompp1 = des10 * costop1;
         preciop1b= costop1 - desccompp1;
         JOptionPane.showMessageDialog(null, "El costo es de: " + preciop1b, "Descuento del 10%", JOptionPane.INFORMATION_MESSAGE);
       }
    }
    if(radio2.isSelected())
    {
        if(v1 < 3){
            costop2= v1*precio2;
             JOptionPane.showMessageDialog(null, "El costo es de: " + costop2, "Comprar", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(v1 >= 4 && v1<=10){
          costop2= precio2*v1;
          descmediop2 = des5 * costop2;
          preciop2a= costop2 - descmediop2;
          JOptionPane.showMessageDialog(null, "El costo es de: " + preciop2a, "Descuento del 5%", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(v1 >= 11){
          costop2= precio2*v1;
          desccompp2 = des10 * costop2;
          preciop2b= costop2 - desccompp2;
          JOptionPane.showMessageDialog(null, "El costo es de: " + preciop2b, "Descuento del 10%", JOptionPane.INFORMATION_MESSAGE);
        }  
    }
   if(radio3.isSelected())
   {
    if(v1 < 3){
        costop3= v1*precio3;
         JOptionPane.showMessageDialog(null, "El costo es de: " + costop3, "Comprar", JOptionPane.INFORMATION_MESSAGE);
    }
    else if(v1 >= 4 && v1<=10){
      costop3= precio3*v1;
      descmediop3 = des5 * costop3;
      preciop3a= costop3 - descmediop3;
      JOptionPane.showMessageDialog(null, "El costo es de: " + preciop3a, "Descuento del 5%", JOptionPane.INFORMATION_MESSAGE);
    }
    else if(v1 >= 11){
      costop3= precio3*v1;
      desccompp3 = des10 * costop3;
      preciop3b= costop3 - desccompp3;
      JOptionPane.showMessageDialog(null, "El costo es de: " + preciop3b, "Descuento del 10%", JOptionPane.INFORMATION_MESSAGE);
    }
    }
  }
    else if (origen == botonLimpiar) 
    {
        tf1.setText("");
    }
    else if (origen == botonTermina)
    {
        System.exit(0);
    }
  }
}

