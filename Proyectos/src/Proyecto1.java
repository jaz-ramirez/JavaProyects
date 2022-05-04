/***:
*@Programa: PROYECTO1.java
*Autor:    Karla Jazmín Ramírez Domínguez
*Grupo:    62B
*Fecha:    06/10/21
*Descripcion: Proyecto de POO, departamento PENTHOUSE
*
***/
/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;


public class Proyecto1 extends JFrame 
    implements ActionListener {

	    private JButton boton, botoninfo, botonsalir;
	    private JPanel depa1;
	
	    public static void main(String[] args) {
	        Proyecto1 marco = new Proyecto1();
	        marco.setSize(700, 750);
	        marco.crearGUI();
	        marco.setTitle("Proyecto 1 en Java");
	        marco.setVisible(true);
	    }

	    public void crearGUI() {
    	
    	
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Container ventana = getContentPane();
	        ventana.setLayout(new FlowLayout() );
	
	        depa1 = new JPanel();
	        depa1.setPreferredSize(new Dimension(650, 400));
	        depa1.setBackground(new Color (253, 255, 201));
	        ventana.add(depa1);
	
	        boton = new JButton("Mostrar PentHouse");
	        ventana.add(boton);
	        boton.addActionListener(this);
	        
	        botoninfo = new JButton("Mostrar información");
	        ventana.add(botoninfo);
	        botoninfo.addActionListener(this);
	        
	        botonsalir = new JButton("Salir");
	        ventana.add(botonsalir);
	        botonsalir.addActionListener(this);
        
        
        
	    }
    

	    public void actionPerformed(ActionEvent event) {
	    	Object origen= event.getSource();
	    	Graphics papel = depa1.getGraphics();
	        
	    	if(origen == boton )
	    	{
	            //Recámaras izquierdas superiores
	            papel.setColor(new Color (189, 255, 191));
	            papel.fillRect(0, 0, 110, 80);
	            papel.setColor(new Color (255, 212, 138));
	            papel.fillRect(0, 230, 90, 70);
	            papel.setColor(new Color (255, 162, 153));
	            papel.fillRect(0, 80, 110, 80);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(0, 0, 110, 80);
	            papel.drawRect(0, 230, 90, 70);
	            papel.drawRect(0, 80, 110, 80);
	            //cama
	            papel.setColor(new Color (207, 255, 221));
	            papel.fillRect(8, 105, 50, 40);
	            papel.fillRect(8, 90, 50, 15);
	            papel.setColor(new Color (254, 207, 255));
	            papel.fillOval(14, 93, 15, 12);
	            papel.fillOval(36, 93, 15, 12);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(8, 105, 50, 40);
	            papel.drawRect(8, 90, 50, 15);
	            papel.drawOval(14, 93, 15, 12);
	            papel.drawOval(36, 93, 15, 12);
	            
	          
	        	papel.drawString("1. Estudio",27,20);
	            
	            
	            
	            //cama
	            papel.setColor(new Color (207, 255, 221));
	            papel.fillRect(8, 240, 50, 15);
	            papel.fillRect(8, 255, 50, 40);
	            papel.setColor(new Color (254, 207, 255));
	            papel.fillOval(14, 243, 15, 12);
	            papel.fillOval(36, 243, 15, 12);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(8, 240, 50, 15);
	            papel.drawRect(8, 255, 50, 40);
	            papel.drawOval(14, 243, 15, 12);
	            papel.drawOval(36, 243, 15, 12);
	            
	            
	            //Baño
	            papel.setColor(new Color (171, 230, 255));
	            papel.fillRect(0, 160, 90, 70);
	            papel.setColor(Color.black);
	            papel.drawRect(0, 160, 90, 70);
	            papel.setColor(new Color (2, 97, 191));
	            papel.fillOval(7, 168, 25, 55);
	            papel.fillRect(3, 190, 8, 8);
	            papel.fillOval(58, 200, 24, 29);
	            papel.fillOval(61, 203, 19, 24);
	            papel.fillRect(67, 162, 6, 6);
	            papel.fillOval(61, 165, 18, 18);
	            
	            papel.setColor(Color.black);
	            papel.drawOval(7, 168, 25, 55);
	            papel.drawRect(3, 190, 8, 8);
	            papel.drawOval(58, 200, 24, 29);
	            papel.drawOval(61, 203, 19, 24);
	            papel.drawRect(67, 162, 6, 6);
	            papel.drawOval(61, 165, 18, 18);
	            papel.drawLine(47, 160, 47, 230);
	
	            papel.drawString("3. Baño",33,200);
	            papel.drawString("2. Recámara A",24,157);
	            papel.drawString("7. Recámara D",10,290);
	            papel.drawString("8. Sala",250,298);
	            
	            /*Recámara principal*/
	            papel.setColor(new Color (253, 209, 255));
	            papel.fillRect(110, 0, 310, 160);
	            papel.setColor(Color.black);
	            papel.drawRect(110, 0, 310, 160);
	            //Vestidor
	            papel.setColor(new Color (213, 171, 255));
	            papel.fillOval(110, 0, 80, 70);
	            papel.setColor(Color.black);
	            papel.drawOval(110, 0, 80, 70);
	            //baño
	            papel.setColor(new Color (171, 230, 255));
	            papel.fillRect(350, 0, 70, 70);
	            papel.setColor(Color.black);
	            papel.drawRect(350, 0, 70, 70);
	            papel.setColor(new Color (2, 97, 191));
	            papel.fillOval(395, 10, 20, 50);
	            papel.fillRect(410, 30, 8, 8);
	
	            papel.fillOval(360, 2, 25, 31);
	            papel.fillOval(363, 6, 19, 24);
	            papel.fillOval(363, 50, 18, 18);
	            papel.fillRect(369, 63, 6, 6);
	            
	            papel.setColor(Color.black);
	            papel.drawOval(395, 10, 20, 50);
	            papel.drawRect(410, 30, 8, 8);
	
	            papel.drawOval(360, 2, 25, 31);
	            papel.drawOval(363, 6, 19, 24);
	            papel.drawOval(363, 50, 18, 18);
	            papel.drawRect(369, 63, 6, 6);
	            
	            papel.drawLine(389, 0, 389, 70);
	
	            //Cama
	            papel.setColor(new Color (207, 255, 221));
	            papel.fillRect(230, 10, 70, 20);
	            papel.fillRect(230, 30, 70, 50);
	            papel.setColor(new Color (254, 207, 255));
	            papel.fillOval(235, 13, 25, 15);
	            papel.fillOval(269, 13, 25, 15);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(230, 10, 70, 20);
	            papel.drawRect(230, 30, 70, 50);
	            papel.drawOval(235, 13, 25, 15);
	            papel.drawOval(269, 13, 25, 15);
	           
	            papel.drawString("4. Recámara principal",200,157);
	            /*Habitaciones derecha*/
	            papel.setColor(new Color (151, 246, 252));
	            papel.fillRect(530, 0, 118, 100);
	            papel.setColor(new Color (209, 191, 255));
	            papel.fillRect(420, 0, 110, 100);
	            papel.setColor(Color.black);
	            papel.drawRect(420, 0, 110, 100);
	            papel.drawRect(530, 0, 118, 100);
	            //Cama2
	            papel.setColor(new Color (207, 255, 221));
	            papel.fillRect(578, 10, 50, 15);
	            papel.fillRect(578, 25, 50, 40);
	            papel.setColor(new Color (254, 207, 255));
	            papel.fillOval(583, 13, 15, 12);
	            papel.fillOval(606, 13, 15, 12);
	            papel.setColor(Color.black);
	            papel.drawRect(578, 10, 50, 15);
	            papel.drawRect(578, 25, 50, 40);
	            papel.drawOval(583, 13, 15, 12);
	            papel.drawOval(606, 13, 15, 12);
	            //Cama1
	            papel.setColor(new Color (207, 255, 221));
	            papel.fillRect(433, 10, 50, 15);
	            papel.fillRect(433, 25, 50, 40);
	            papel.setColor(new Color (254, 207, 255));
	            papel.fillOval(438, 13, 15, 12);
	            papel.fillOval(461, 13, 15, 12);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(433, 10, 50, 15);
	            papel.drawRect(433, 25, 50, 40);
	            papel.drawOval(438, 13, 15, 12);
	            papel.drawOval(461, 13, 15, 12);
	            papel.drawString("5. Recámara B",430,99);
	            papel.drawString("6. Recámara C",540,99);
	            
	            /* terraza*/
	            papel.setColor(new Color (129, 219, 129));
	            papel.fillRect(420, 100, 228, 298);
	            papel.setColor(Color.black);
	            papel.drawRect(420, 100, 228, 298);
	            //Mesas
	            for(int i = 130; i <=310; i+=90)
	        	{
	            	papel.setColor(new Color (203, 160, 222));
	            	papel.fillOval(455, i, 45, 45);
	            	papel.setColor(Color.black);
	            	papel.drawOval(455, i, 45, 45);
	        	}
	            
	            for(int i=133;i<=313;i+=90)
	            {
	            	papel.setColor(new Color (203, 160, 222));
	            	papel.fillRect(440, i, 12,12);
	            	papel.fillRect(440, i+30, 12,12);
	            	papel.fillRect(503, i, 12,12);
	            	papel.fillRect(503, i+30, 12,12);
	            	papel.setColor(Color.black);
	            	papel.drawRect(440, i, 12,12);
	            	papel.drawRect(440, i+30, 12,12);
	            	papel.drawRect(503, i, 12,12);
	            	papel.drawRect(503, i+30, 12,12);
	            }
	            //alberca
	            papel.setColor(new Color (138, 239, 255) );
	            papel.fillRoundRect(550, 150, 80, 200, 16,16);
	            papel.setColor(Color.black);
	            papel.drawRoundRect(550, 150, 80, 200, 16,16);
	            
	            
	            /* Sala */
	            //Mesa de centro
	            papel.setColor(new Color (244, 194, 255));
	        	papel.fillRoundRect(190, 240, 90, 40, 25, 25);
	        	papel.setColor(Color.black);
	        	papel.drawRoundRect(190, 240, 90, 40, 25, 25);
	            //Sillón
	            
	            for(int i = 180; i <=220; i+=20)
	        	{
	            	papel.setColor(new Color (244, 194, 255));
	            	papel.fillRect(130, i, 30, 20);
	            	papel.setColor(Color.black);
	            	papel.drawRect(130, i, 30, 20);
	        	}
	            for(int i = 160; i <=300; i+=40)
	        	{
	            	papel.setColor(new Color (244, 194, 255));
	            	papel.fillRect(i, 180, 40, 20);
	            	papel.setColor(Color.black);
	            	papel.drawRect(i, 180, 40, 20);
	        	}
	            for(int i = 180; i <=220; i+=20)
	        	{
	            	papel.setColor(new Color (244, 194, 255));
	            	papel.fillRect(320, i, 30, 20);
	            	papel.setColor(Color.black);
	            	papel.drawRect(320, i, 30, 20);
	        	}
	            
	            papel.setColor(new Color (135, 44, 156));
	            papel.fillRect(120, 170, 240, 10);
	            papel.fillRect(120, 180, 10, 60);
	            papel.fillRect(350, 180, 10, 60);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(120, 170, 240, 10);
	            papel.drawRect(120, 180, 10, 60);
	            papel.drawRect(350, 180, 10, 60);
	            //Recamaras inferiores
	        	papel.setColor(new Color (105, 255, 140));
	            papel.fillRect(0, 300, 100, 98);
	            papel.setColor(Color.black);
	            papel.drawRect(0, 300, 100, 98);
	            //Lavadora
	            for (int i = 310; i<=370; i+=30)
	            {
	            	papel.setColor(Color.lightGray);
	            	papel.fillRect(0, i, 25, 30);
	            	papel.setColor(Color.black);
	            	papel.drawRect(0, i, 25, 30);
	                papel.drawOval(3, i+8, 16, 16);
	                papel.drawOval(2, i+7, 17, 17);
	            }
	            
	            papel.drawString("9. Lavado",30, 317);
	
	            /*Cocina*/
	            papel.setColor(new Color (84, 62, 0));
	            papel.fillRect(100, 300, 118, 98);
	            papel.setColor(Color.black);
	            papel.drawRect(100, 300, 118, 98);
	            papel.setColor(new Color (227, 227, 218));
	            papel.fillRect(135, 330, 83, 68);
	            papel.setColor(Color.black);
	            papel.drawRect(135, 330, 83, 68);
	            
	            
	            /*Comedor*/
	            papel.drawRect(218, 300, 202, 98);
	            //Mesa
	            papel.setColor(new Color (  90, 199, 209));
	            papel.fillOval(280, 325, 80, 45);
	            papel.setColor(Color.black);
	            papel.drawOval(280, 325, 80, 45);
	            for(int i=285; i<370; i+=30)
	            {
	            	papel.setColor(new Color (0, 110, 161));
	            	papel.fillRect(i, 310, 12, 10);
	            	papel.setColor(Color.black);
	            	papel.drawRect(i, 310, 12, 10);
	            }
	            	
	            for(int i=285; i<370; i+=30)
	            {
	            	papel.setColor(new Color (0, 110, 161));
	            	papel.fillRect(i, 377, 12, 10);
	            	papel.setColor(Color.black);
	            	papel.drawRect(i, 377, 12, 10);
	            }
	            papel.setColor(new Color (0, 110, 161));
	            papel.fillRect(265, 330, 12, 10);
	            papel.fillRect(265, 360, 12, 10);
	            papel.fillRect(363, 330, 12, 10);
	            papel.fillRect(363, 360, 12, 10);
	            
	            papel.setColor(Color.black);
	            papel.drawRect(265, 330, 12, 10);
	            papel.drawRect(265, 360, 12, 10);
	            papel.drawRect(363, 330, 12, 10);
	            papel.drawRect(363, 360, 12, 10);
	            
	            
	            papel.drawString("10. Cocina",150, 360);
	            papel.drawString("11. Comedor",220, 397);
	            papel.drawString("12. Alberca",565, 339);
	            papel.drawString("13. Terraza",470, 396);
	        }	
	    	else if(origen == botoninfo) {
	    		JOptionPane.showMessageDialog(null, "                                ******************\n                "
	    				+ "                      LuxHouse \n                            "
	    				+ "      *****************\n\n     PentHouse Condesa\n\nPrecio: $20 2000 000\n"
	    				+ "Para mayores informes, puede comunicarse en:\nCorreo: luxhouse@gmail.com\n"
	    				+ "Teléfono(WhatsApp y Telegram): 5511922290\nFacebook: LuxHouse Penthouse\n\nLuxHouse pone"
	    				+ "su disposicición esta bonita PentHouse ubicada en la colonia Condesa con:\n"
	    				+ "1. Sala de estudio\n2.Tres recámaras como camas matrimoniales (2(A), 5(B), 6(C))"
	    				+ "\n3. Recámara principal de lujo con baño y vestidor propio(4) \n4.Un baño(3)\n"
	    				+ "5. Recámara de servicio (7(D))\n6. Sala con sillones de lujo y mesa de centro "
	    				+ "de cristal(8)\n7.Cuarto de lavado con lavadoras y secadoras(9)\n8.Cocina Integral(10)\n"
	    				+ "9.Comedor de 10 sillas(11)\n10.Terraza con 3 mesas y sillas(13)\n10.Alberca (12)" );
	    	}
	    	else if (origen == botonsalir) {
	    		System.exit(0);
	    	}
	}
}