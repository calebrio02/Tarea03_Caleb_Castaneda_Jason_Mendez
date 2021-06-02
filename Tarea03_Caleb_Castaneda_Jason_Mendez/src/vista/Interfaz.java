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
import javax.swing.border.MatteBorder;

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
		setBounds(100, 100, 761, 509);
		contentPaneVerduleria = new JPanel();
		contentPaneVerduleria.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneVerduleria);
		contentPaneVerduleria.setLayout(null);
		
		JButton btnExit = new JButton("");
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.addActionListener(new ActionListener() {
			@SuppressWarnings({ "static-access", "deprecation" })
			public void actionPerformed(ActionEvent e) {
				
				
				if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de la aplicacion?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
					TCPclient.setDato("quit");
					System.out.println("proceso concluido");
					System.exit(0);
				} else {
					System.out.println("ejecutando");
				}
				
			}
		});
		btnExit.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/power-off.png")));
		btnExit.setToolTipText("Cerrar aplicacion");
		btnExit.setContentAreaFilled(false);
		btnExit.setBorder(null);
		btnExit.setBounds(365, 418, 45, 41);
		contentPaneVerduleria.add(btnExit);
		
		JPanel panelSelectV = new JPanel();
		panelSelectV.setFocusTraversalKeysEnabled(false);
		panelSelectV.setBounds(0, 0, 389, 483);
		panelSelectV.setBackground(Color.GRAY);
		contentPaneVerduleria.add(panelSelectV);
		panelSelectV.setLayout(null);
		
		JButton btnApples = new JButton("");
		btnApples.setFocusCycleRoot(true);
		btnApples.setFocusPainted(false);
		btnApples.setFocusTraversalPolicyProvider(true);
		btnApples.setDefaultCapable(false);
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
			
			
				
			}
		});
		btnApples.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/manzanax64.png")));
		btnApples.setContentAreaFilled(false);
		btnApples.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApples.setToolTipText("Consultar precio de manzanas por kilo...");
		btnApples.setBounds(36, 32, 77, 68);
		panelSelectV.add(btnApples);
		
		btnYuccas = new JButton("");
		btnYuccas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Yuca");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnYuccas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYuccas.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/yuccax64.png")));
		btnYuccas.setToolTipText("Consultar precio de yuca por kilo...");
		btnYuccas.setDefaultCapable(false);
		btnYuccas.setContentAreaFilled(false);
		btnYuccas.setBounds(153, 232, 77, 68);
		panelSelectV.add(btnYuccas);
		
		JButton btnBananas = new JButton("");
		btnBananas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		btnBananas.setToolTipText("Consultar precio de bananos por kilo...");
		btnBananas.setDefaultCapable(false);
		btnBananas.setContentAreaFilled(false);
		btnBananas.setBounds(153, 32, 77, 68);
		panelSelectV.add(btnBananas);
		
		JButton btnGrapes = new JButton("");
		btnGrapes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		btnGrapes.setToolTipText("Consultar precio de uvas por kilo...");
		btnGrapes.setDefaultCapable(false);
		btnGrapes.setContentAreaFilled(false);
		btnGrapes.setBounds(258, 32, 77, 68);
		panelSelectV.add(btnGrapes);
		
		JButton btnAvocados = new JButton("");
		btnAvocados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TCPclient.setDato("Aguacate");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnAvocados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvocados.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/avocado.png")));
		btnAvocados.setToolTipText("Consultar precio de aguacates por kilo...");
		btnAvocados.setDefaultCapable(false);
		btnAvocados.setContentAreaFilled(false);
		btnAvocados.setBounds(153, 128, 77, 68);
		panelSelectV.add(btnAvocados);
		
		JButton btnTomatoes = new JButton("");
		btnTomatoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Tomate");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnTomatoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTomatoes.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/tomato.png")));
		btnTomatoes.setToolTipText("Consultar precio de tomates por kilo...");
		btnTomatoes.setDefaultCapable(false);
		btnTomatoes.setContentAreaFilled(false);
		btnTomatoes.setBounds(258, 128, 77, 68);
		panelSelectV.add(btnTomatoes);
		
		JButton btnOnions = new JButton("");
		btnOnions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Cebolla");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnOnions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOnions.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/onion (1).png")));
		btnOnions.setToolTipText("Consultar precio de cebollas por kilo...");
		btnOnions.setDefaultCapable(false);
		btnOnions.setContentAreaFilled(false);
		btnOnions.setBounds(36, 232, 77, 68);
		panelSelectV.add(btnOnions);
		
		JButton btnPeppers = new JButton("");
		btnPeppers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPeppers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Chile dulce");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
			}
		});
		btnPeppers.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/bell-pepper.png")));
		btnPeppers.setToolTipText("Consultar precio de chile dulce por kilo...");
		btnPeppers.setDefaultCapable(false);
		btnPeppers.setContentAreaFilled(false);
		btnPeppers.setBounds(36, 128, 77, 68);
		panelSelectV.add(btnPeppers);
		
		JButton btnPotatoes = new JButton("");
		btnPotatoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCPclient.setDato("Papa");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tConsultaPrecio.setText(TCPclient.getnombreprecio());
				
			}
		});
		btnPotatoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPotatoes.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/potato.png")));
		btnPotatoes.setToolTipText("Consultar precio de papas por kilo...");
		btnPotatoes.setDefaultCapable(false);
		btnPotatoes.setContentAreaFilled(false);
		btnPotatoes.setBounds(258, 232, 77, 68);
		panelSelectV.add(btnPotatoes);
		
		JButton btnMostrar = new JButton("");
		btnMostrar.setToolTipText("Mostrar ordenes en registro");
		btnMostrar.setContentAreaFilled(false);
		btnMostrar.setBounds(109, 362, 84, 75);
		panelSelectV.add(btnMostrar);
		btnMostrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostrar.setBackground(Color.WHITE);
		btnMostrar.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/file (1).png")));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, l.mostrar(), "Factura", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnMostrar.setFont(new Font("Constantia", Font.PLAIN, 18));
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(l.elementosLista()==false) {
					l.mensajeTemporizado("No existe un registro de ordenes...", 2000);
					System.out.println("No hay registro");
				}else {
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar registro de ordenes?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
						l.eliminarLista();
						System.out.println("Registro Eliminado");
					} else {
						System.out.println("decidio no borrar registro");
					}
					
				}
				
			
			
			}
		});
		btnEliminar.setToolTipText("Eliminar registro de ordenes ");
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBounds(215, 362, 84, 75);
		panelSelectV.add(btnEliminar);
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/delete.png")));
		btnEliminar.setFont(new Font("Constantia", Font.PLAIN, 18));
		
		JPanel panelResponsesFromServer = new JPanel();
		panelResponsesFromServer.setBounds(390, 0, 359, 483);
		panelResponsesFromServer.setBackground(Color.DARK_GRAY);
		contentPaneVerduleria.add(panelResponsesFromServer);
		panelResponsesFromServer.setLayout(null);
		
		JScrollPane spOrden = new JScrollPane();
		spOrden.setBounds(36, 106, 288, 243);
		panelResponsesFromServer.add(spOrden);
		
		JTextArea tOrden = new JTextArea();
		tOrden.setForeground(new Color(255, 240, 245));
		tOrden.setFont(new Font("Monospaced", Font.BOLD, 14));
		tOrden.setBackground(new Color(119, 136, 153));
		
		spOrden.setViewportView(tOrden);
		
		JButton btnOrder = new JButton("");
		btnOrder.setBounds(100, 375, 77, 68);
		panelResponsesFromServer.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(!TCPclient.getRespuesta().equalsIgnoreCase("")) {
					
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea agregar la orden al carrito?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
						
						
						TCPclient.setActualizarCarrito(1);
						TCPclient.setDato("carrito");
						
						
						if(!TCPclient.getRespuesta().equalsIgnoreCase("")) {
							l.insertar(TCPclient.getRespuesta());
							l.mensajeTemporizado("Agregado al carrito", 1200);
								tOrden.setText("");
						}else {
						
						}
						
						
					} else {
						TCPclient.setActualizarCarrito(0);
						tOrden.setText("");
						
					}
					
				}else {
					l.mensajeTemporizado("No se puede procesar orden vacia", 2300);
				}
				
				
				
			}
		});
		btnOrder.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/grocery-cart.png")));
		btnOrder.setToolTipText("anadir los articulos ya consultados al carrito de compras");
		btnOrder.setDefaultCapable(false);
		btnOrder.setContentAreaFilled(false);
		
		tConsultaPrecio = new JTextField();
		tConsultaPrecio.setFont(new Font("Monospaced", Font.BOLD, 14));
		tConsultaPrecio.setForeground(new Color(211, 211, 211));
		tConsultaPrecio.setOpaque(false);
		tConsultaPrecio.setEditable(false);
		tConsultaPrecio.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(211, 211, 211)));
		tConsultaPrecio.setBounds(36, 44, 288, 31);
		panelResponsesFromServer.add(tConsultaPrecio);
		tConsultaPrecio.setColumns(10);
		
		JButton btnTotal = new JButton("");
		btnTotal.setContentAreaFilled(false);
		btnTotal.setIcon(new ImageIcon(Interfaz.class.getResource("/vista/images/note.png")));
		btnTotal.setToolTipText("Calcular precio total de productos consultados/seleccionados...");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TCPclient.getRespuesta().equalsIgnoreCase("")) {
					l.mensajeTemporizado("productos no consultados", 1200);
					
				}else {
			
				TCPclient.setDato("saberTotal");
				try {
					Thread.sleep(150);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				tOrden.setText(TCPclient.getRespuesta());
				
				}
				
			}
		});
		btnTotal.setBounds(208, 375, 63, 68);
		panelResponsesFromServer.add(btnTotal);
	}
}
