/***
*Programa: Ejemplo2Variables.java
*Autor:    Adriana Vega Palos
*Fecha:    dd/mm/AAAA
*Descripcion: Inicia POO Manejo de objetos y eventos tipos de datos, 2 objetos cajas de texto y etiquetas
*             dos métodos setBouns (localizar objetos en la pantalla y setEditable
*
***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo2Variables extends JFrame implements ActionListener {

    private JLabel etiquetaBienvenida;
    private JTextField campoCodigo, campoTextoResultado;
    private JButton boton, botonLimpiar, botonCerrar;
   

    public static void main(String[] args) {
        Ejemplo2Variables demo = new Ejemplo2Variables ();
        demo.setSize(400,550);
        demo.crearGUI();
        demo.setTitle("Abrir Boveda");
        demo.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        etiquetaBienvenida = new JLabel("Escriba el código");
        ventana.add(etiquetaBienvenida);

        campoCodigo = new JTextField(10);
        campoCodigo.setBounds(9, 10, 30, 30);
        ventana.add(campoCodigo);

        boton = new JButton("abrir");
        ventana.add(boton);
        boton.setBounds(2, 20, 30, 30);
        boton.addActionListener(this);

        campoTextoResultado = new JTextField(6);
        campoTextoResultado.setBounds(2, 30, 30, 30);
        campoTextoResultado.setEditable(false);  // no permite editar
        campoTextoResultado.setEnabled(false);   // no lo deja disponible
        ventana.add(campoTextoResultado);
        
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(2, 40, 30, 30);
        ventana.add(botonLimpiar);
        botonLimpiar.addActionListener(this);
        
        botonCerrar = new JButton("Salir");
        botonCerrar.setAlignmentX(CENTER_ALIGNMENT);
        botonCerrar.setBounds(2, 50, 30, 30);
        ventana.add( botonCerrar);
        botonCerrar.addActionListener(this);
       
    }

    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
    	if (origen == boton) {	
           String cadenaCodigo;  // variable tipo texto
           int codigo;            //variable tipo entero
          

           cadenaCodigo = campoCodigo.getText();   //recibe el valor de la caja de texto en la variable
           codigo = Integer.parseInt(cadenaCodigo);//utiliza la variable de cadena para cambiarla a numérica
                                                   /*si el valor es decimal sera Double.parseDouble
                                                     o Float.parseFloat    */
           
           if (codigo == 123) {                      //valida la variable entera
           
               campoTextoResultado.setText("abierta");//enviando un cadena de datos a la caja de texto
               
              }
           else 
              {
        	   JOptionPane.showMessageDialog(null,"Clave Incorrecta  " + cadenaCodigo); 
        	                                                         //el + es una concatenación
              }
    	}
    	else if (origen == botonLimpiar) {
    		//limpia cajas de texto
    		campoCodigo.setText("");       
    		campoTextoResultado.setText("");
    	}
    	     else {
    	    	 System.exit(0);// Sale del Sistema
    	}
    }
}