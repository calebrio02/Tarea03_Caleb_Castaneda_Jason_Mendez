package vista;

import modelo.TCPclient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPaneVerduleria;
	private JButton btnYuccas;
	 TCPclient c = new TCPclient();
	

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 532);
		contentPaneVerduleria = new JPanel();
		contentPaneVerduleria.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneVerduleria);
		contentPaneVerduleria.setLayout(null);
		
		JPanel panelSelectV = new JPanel();
		panelSelectV.setBackground(Color.GRAY);
		panelSelectV.setBounds(0, 0, 389, 486);
		contentPaneVerduleria.add(panelSelectV);
		panelSelectV.setLayout(null);
		
		JButton btnApples = new JButton("");
		btnApples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TCPclient.setDato("manzana");
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
		panelResponsesFromServer.setBackground(Color.DARK_GRAY);
		panelResponsesFromServer.setBounds(390, 0, 359, 486);
		contentPaneVerduleria.add(panelResponsesFromServer);
		panelResponsesFromServer.setLayout(null);
		
		JTextArea tConsultaPrecio = new JTextArea();
		tConsultaPrecio.setBounds(21, 32, 288, 34);
		panelResponsesFromServer.add(tConsultaPrecio);
		
		JScrollPane spOrden = new JScrollPane();
		spOrden.setBounds(21, 122, 288, 184);
		panelResponsesFromServer.add(spOrden);
		
		JTextArea tOrden = new JTextArea();
		
		spOrden.setViewportView(tOrden);
		
		JButton btnOrder = new JButton("");
		btnOrder.setBounds(131, 379, 77, 68);
		panelResponsesFromServer.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tOrden.setText(TCPclient.getRespuesta());
				
			}
		});
		btnOrder.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/grocery-cart.png")));
		btnOrder.setToolTipText("Consultar precio de manzanas por kilo...");
		btnOrder.setDefaultCapable(false);
		btnOrder.setContentAreaFilled(false);
	}
}
