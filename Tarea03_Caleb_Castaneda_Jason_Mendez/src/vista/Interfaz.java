package vista;

import modelo.TCPclient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Lista;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Font;

public class Interfaz extends JFrame {

	private JPanel contentPaneVerduleria;
	private JButton btnYuccas;
	 TCPclient c = new TCPclient();
	 Lista l = new Lista();
	 private JTextField tConsultaPrecio;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 532);
		contentPaneVerduleria = new JPanel();
		contentPaneVerduleria.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneVerduleria);
		contentPaneVerduleria.setLayout(null);
		
		JPanel panelSelectV = new JPanel();
		panelSelectV.setBounds(0, 0, 389, 436);
		panelSelectV.setBackground(Color.GRAY);
		contentPaneVerduleria.add(panelSelectV);
		panelSelectV.setLayout(null);
		
		JButton btnApples = new JButton("");
		btnApples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("manzana");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				//System.out.println(TCPclient.getDato());
			
				
			}
		});
		btnApples.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/manzanax64.png")));
		btnApples.setDefaultCapable(false);
		btnApples.setContentAreaFilled(false);
		btnApples.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApples.setToolTipText("Consultar precio de manzanas por kilo...");
		btnApples.setBounds(26, 50, 77, 68);
		panelSelectV.add(btnApples);
		
		btnYuccas = new JButton("");
		btnYuccas.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/yuccax64.png")));
		btnYuccas.setToolTipText("Consultar precio de manzanas por kilo...");
		btnYuccas.setDefaultCapable(false);
		btnYuccas.setContentAreaFilled(false);
		btnYuccas.setBounds(143, 250, 77, 68);
		panelSelectV.add(btnYuccas);
		
		JButton btnBananas = new JButton("");
		btnBananas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("banano");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnBananas.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/bananas.png")));
		btnBananas.setToolTipText("Consultar precio de manzanas por kilo...");
		btnBananas.setDefaultCapable(false);
		btnBananas.setContentAreaFilled(false);
		btnBananas.setBounds(128, 50, 77, 68);
		panelSelectV.add(btnBananas);
		
		JButton btnGrapes = new JButton("");
		btnGrapes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("uva");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
			}
		});
		btnGrapes.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/grape.png")));
		btnGrapes.setToolTipText("Consultar precio de manzanas por kilo...");
		btnGrapes.setDefaultCapable(false);
		btnGrapes.setContentAreaFilled(false);
		btnGrapes.setBounds(248, 50, 77, 68);
		panelSelectV.add(btnGrapes);
		
		JButton btnAvocados = new JButton("");
		btnAvocados.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/avocado.png")));
		btnAvocados.setToolTipText("Consultar precio de manzanas por kilo...");
		btnAvocados.setDefaultCapable(false);
		btnAvocados.setContentAreaFilled(false);
		btnAvocados.setBounds(128, 146, 77, 68);
		panelSelectV.add(btnAvocados);
		
		JButton btnTomatoes = new JButton("");
		btnTomatoes.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/tomato.png")));
		btnTomatoes.setToolTipText("Consultar precio de manzanas por kilo...");
		btnTomatoes.setDefaultCapable(false);
		btnTomatoes.setContentAreaFilled(false);
		btnTomatoes.setBounds(248, 146, 77, 68);
		panelSelectV.add(btnTomatoes);
		
		JButton btnOnions = new JButton("");
		btnOnions.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/onion (1).png")));
		btnOnions.setToolTipText("Consultar precio de manzanas por kilo...");
		btnOnions.setDefaultCapable(false);
		btnOnions.setContentAreaFilled(false);
		btnOnions.setBounds(26, 250, 77, 68);
		panelSelectV.add(btnOnions);
		
		JButton btnPeppers = new JButton("");
		btnPeppers.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/bell-pepper.png")));
		btnPeppers.setToolTipText("Consultar precio de manzanas por kilo...");
		btnPeppers.setDefaultCapable(false);
		btnPeppers.setContentAreaFilled(false);
		btnPeppers.setBounds(26, 146, 77, 68);
		panelSelectV.add(btnPeppers);
		
		JButton btnPotatoes = new JButton("");
		btnPotatoes.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/potato.png")));
		btnPotatoes.setToolTipText("Consultar precio de manzanas por kilo...");
		btnPotatoes.setDefaultCapable(false);
		btnPotatoes.setContentAreaFilled(false);
		btnPotatoes.setBounds(248, 250, 77, 68);
		panelSelectV.add(btnPotatoes);
		
		JButton btnPeppers_1 = new JButton("");
		btnPeppers_1.setToolTipText("Consultar precio de manzanas por kilo...");
		btnPeppers_1.setDefaultCapable(false);
		btnPeppers_1.setContentAreaFilled(false);
		btnPeppers_1.setBounds(26, 363, 77, 68);
		panelSelectV.add(btnPeppers_1);
		
		JPanel panelResponsesFromServer = new JPanel();
		panelResponsesFromServer.setBounds(390, 0, 359, 436);
		panelResponsesFromServer.setBackground(Color.DARK_GRAY);
		contentPaneVerduleria.add(panelResponsesFromServer);
		panelResponsesFromServer.setLayout(null);
		
		JScrollPane spOrden = new JScrollPane();
		spOrden.setBounds(21, 122, 288, 184);
		panelResponsesFromServer.add(spOrden);
		
		JTextArea tOrden = new JTextArea();
		
		spOrden.setViewportView(tOrden);
		
		JButton btnOrder = new JButton("");
		btnOrder.setBounds(130, 333, 77, 68);
		panelResponsesFromServer.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Carrito");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tOrden.setText(TCPclient.getRespuesta() + "\n" );
				if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea agregar la orden al carrito?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
					//System.exit(0);//SI NO HAY DATOS DEL TODO EL PROGRAMA SOLO SE CIERRA SIN PREGUNTAR SI DESEA GUARDAR DATOS
					
					l.insertar(TCPclient.getRespuesta());
					l.mensajeTemporizado("Agregado al carrito", 1200);
					tOrden.setText("");
				} else {
					tOrden.setText("");
					
				}
				
			}
		});
		btnOrder.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/grocery-cart.png")));
		btnOrder.setToolTipText("Consultar precio de manzanas por kilo...");
		btnOrder.setDefaultCapable(false);
		btnOrder.setContentAreaFilled(false);
		
		tConsultaPrecio = new JTextField();
		tConsultaPrecio.setBounds(36, 45, 273, 31);
		panelResponsesFromServer.add(tConsultaPrecio);
		tConsultaPrecio.setColumns(10);
		
		JButton btnNewButton = new JButton("mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				l.mostrar();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(0, 434, 227, 73);
		contentPaneVerduleria.add(btnNewButton);
	}
}
