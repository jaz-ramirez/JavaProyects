/***
 *Programa: ImagenesValidaCajasTexto.java
 *Autor:    Bravo Orozco Diego
 *Fecha:    10/11/2021
 *Maestra: Adriana Vega Palos
 *Descripción: Ejemplo que muestra como incluir imagenes en una clase y validación de caracteres
 *numéricos en cajas de texto
 *
 ***/

import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;


public class ImagenesValidaCajasTexto extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel cantidad;
    private ButtonGroup bg;
    private JRadioButton radio1;
    private JButton botonComprar, botonLimpiar, botonSalir;
    private JTextField tf1;
    private double total, totalDescuento, porcentaje, precioEjemplo = 10000;
    private ImageIcon img;
    private boolean descuento;

    public static void main(String[] args) {

    	ImagenesValidaCajasTexto tienda = new ImagenesValidaCajasTexto();
        tienda.setTitle("Programa de prueba");
        tienda.setBounds(100, 100, 1100, 550);
        tienda.setVisible(true);
    }

    public ImagenesValidaCajasTexto() {

        Container ventana = getContentPane();
        Font letra = new Font("Calibri",Font.BOLD,16);
        ventana.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setBounds(400,20,300,300);
        panel.setBackground(Color.WHITE);
        ventana.add(panel);

        cantidad = new JLabel("Cantidad");
        cantidad.setBounds(420,390, 300, 20);
        cantidad.setFont(letra);
        ventana.add(cantidad);

        tf1 = new JTextField();
        tf1.setBounds(580,385,100,30);
        add(tf1);

        bg = new ButtonGroup();
        radio1 = new JRadioButton("Prueba");
        radio1.setBounds (500,335,300,30);
        radio1.setFont(letra);
        bg.add(radio1);
        add(radio1);

        botonComprar = new JButton ("Comprar");
        botonComprar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonComprar.setBounds(50,455,300,40);
        botonComprar.addActionListener(this);
        botonComprar.setBackground(null);
        add(botonComprar);

        botonLimpiar = new JButton ("Limpiar");
        botonLimpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonLimpiar.setBounds (400,455,300,40);
        botonLimpiar.addActionListener(this);
        add(botonLimpiar);

        botonSalir = new JButton ("Salir");
        botonSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonSalir.setBounds (750,455,300,40);
        botonSalir.addActionListener(this);
        add(botonSalir);

    }

    public void paint(Graphics g) {

        super.paint(g);

        try {

            img = new ImageIcon(ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/f/ff/Escudo_prepa_6_enp_6.jpg"))
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT));

        } catch (IOException e) {
            showMessageDialog(this, "Ha ocurrido un error renderizando las imágenes, probablemente sea un problema de conexión, pls no me ponga 0, sí funciona");
        }

        Graphics a = panel.getGraphics();

        img.paintIcon(this, a, 0,0);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        Object origen= event.getSource();


        if (origen==botonLimpiar) {
            tf1.setText(null);
            bg.clearSelection();

        } else if (origen.equals(botonComprar)) {

            descuento = false;

            if(bg.getSelection() == null){
                showMessageDialog(this, "No olvides seleccionar un producto!");
            } else {

                try {
                    double v = Double.parseDouble(tf1.getText());

                    if (radio1.isSelected()) {

                        total = v * precioEjemplo;
                        totalDescuento = total;

                        if (v >= 4 && v <= 10) {
                            descuento = true;
                            porcentaje = 5;
                            totalDescuento = total * 0.95;
                        } else if (v >= 11) {
                            descuento = true;
                            porcentaje = 10;
                            totalDescuento = total * 0.90;
                        }

                    }

                    String mensaje = "Por llevar " + v + " artículos, el total sería de $" + totalDescuento + (descuento ? ", se aplica el " + porcentaje + "% de descuento" : ", no aplica descuento");
                    showMessageDialog(this, mensaje, "Preorden de compra", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException e){
                    showMessageDialog(this, "Error --- No se indicó un valor numérico: " + e.getMessage());
                }


        }
        } else {

            System.exit(0);
        }
    }

}