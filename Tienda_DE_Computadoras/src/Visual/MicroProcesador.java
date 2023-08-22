package Visual;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Logico.Enum.TipoConexion;
import Logico.Enum.TipoSocket;
import LogicoComponentes.DiscosDuros;
import LogicoComponentes.Microprocesadores;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MicroProcesador extends JFrame {


	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtvelocidadProcesamiento;
	private JTextField textPrecio;
	private JTextField textcantDisponible;
	private JTextField textNumeroSerie;
	private JTextField textModelo;
	private JComboBox JCBTipoSocket;
	private ArrayList<Microprocesadores> microprocesadoresList; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memoria_Ram frame = new Memoria_Ram();
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
	public MicroProcesador() {
		microprocesadoresList = new ArrayList<>();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemoriaRAm = new JLabel("Memoria Ram:");
		lblMemoriaRAm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemoriaRAm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemoriaRAm.setBounds(263, 11, 178, 67);
		contentPane.add(lblMemoriaRAm);
		
		txtMarca = new JTextField();
		txtMarca.setToolTipText("");
		txtMarca.setBounds(66, 174, 217, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(20);
		
		txtvelocidadProcesamiento = new JTextField();
		txtvelocidadProcesamiento.setToolTipText("");
		txtvelocidadProcesamiento.setColumns(10);
		txtvelocidadProcesamiento.setBounds(182, 259, 101, 20);
		contentPane.add(txtvelocidadProcesamiento);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 172, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblvelocidadProcesamiento = new JLabel("Velocidad Procesamiento:");
		lblvelocidadProcesamiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblvelocidadProcesamiento.setBounds(10, 260, 162, 14);
		contentPane.add(lblvelocidadProcesamiento);
		
		JCBTipoSocket = new JComboBox();
		JCBTipoSocket.setToolTipText("TipoRam");
		JCBTipoSocket.setBounds(121, 345, 101, 22);
		contentPane.add(JCBTipoSocket);
		for(TipoSocket tipoS: TipoSocket.values()) {
			JCBTipoSocket.addItem(tipoS.getValue());}
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 303, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textPrecio = new JTextField();
		textPrecio.setText("");
		textPrecio.setBounds(66, 302, 89, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblTipoSocket = new JLabel("Tipo de Socket:");
		lblTipoSocket.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoSocket.setBounds(10, 347, 101, 14);
		contentPane.add(lblTipoSocket);
		
		JList list = new JList();
		list.setBounds(593, 368, 92, -250);
		contentPane.add(list);
		
		JLabel lblCantidadDispoibles = new JLabel("Cantidad Dispoibles:");
		lblCantidadDispoibles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidadDispoibles.setBounds(10, 221, 162, 14);
		contentPane.add(lblCantidadDispoibles);
		
		textcantDisponible = new JTextField();
		textcantDisponible.setToolTipText("");
		textcantDisponible.setColumns(10);
		textcantDisponible.setBounds(182, 220, 101, 20);
		contentPane.add(textcantDisponible);
		
		textNumeroSerie = new JTextField();
		textNumeroSerie.setToolTipText("");
		textNumeroSerie.setColumns(10);
		textNumeroSerie.setBounds(121, 104, 165, 20);
		contentPane.add(textNumeroSerie);
		
		JLabel lblnumeroSerie = new JLabel("Numero de Serie");
		lblnumeroSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumeroSerie.setBounds(10, 102, 127, 20);
		contentPane.add(lblnumeroSerie);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(596, 438, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {guardarDatos();}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error complete los datos requeridos" );
				};
			}
		});
		btnGuardar.setBounds(464, 438, 89, 23);
		contentPane.add(btnGuardar);
		
		textModelo = new JTextField();
		textModelo.setToolTipText("");
		textModelo.setColumns(10);
		textModelo.setBounds(66, 135, 217, 20);
		contentPane.add(textModelo);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 138, 73, 14);
		contentPane.add(lblModelo);
	}
	
	public void guardarDatos() {       
		 String numeroSerie = textNumeroSerie.getText();
	        String marca = txtMarca.getText();
	        String modelo = textModelo.getText();
	        int cantidadDisponible = Integer.parseInt(textcantDisponible.getText());
	        double velocidadProcesamiento = Double.parseDouble(txtvelocidadProcesamiento.getText());
	        float precio = Float.parseFloat(textPrecio.getText());
	        TipoSocket tipoSocket = TipoSocket.valueOf(JCBTipoSocket.getSelectedItem().toString());
	       
	        Microprocesadores microprocesadores = new Microprocesadores(precio, cantidadDisponible, numeroSerie, marca, modelo, tipoSocket, velocidadProcesamiento);

	        microprocesadoresList.add(microprocesadores);
	        JOptionPane.showMessageDialog(null, "Guardado Correctamente" );
	        dispose();

   }
	
	

}
