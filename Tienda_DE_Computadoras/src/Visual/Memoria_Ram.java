package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.Enum.TipoConexion;
import Logico.Enum.TipoRam;
import LogicoComponentes.DiscosDuros;
import LogicoComponentes.MemoriasRAM;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Memoria_Ram extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtcantidadMemoria;
	private JTextField textPrecio;
	private JTextField textcantDisponible;
	private JTextField textNumeroSerie;
	private JComboBox JCBTipoRAm;
	private ArrayList<MemoriasRAM> memoriasRamList;
	private JLabel lblcantidadMemoria;

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
	public Memoria_Ram() {
		memoriasRamList = new ArrayList<>();
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
		
		txtcantidadMemoria = new JTextField();
		txtcantidadMemoria.setToolTipText("");
		txtcantidadMemoria.setColumns(10);
		txtcantidadMemoria.setBounds(151, 259, 101, 20);
		contentPane.add(txtcantidadMemoria);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 174, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		lblcantidadMemoria = new JLabel("Cantidad de Memoria:");
		lblcantidadMemoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblcantidadMemoria.setBounds(10, 260, 162, 14);
		contentPane.add(lblcantidadMemoria);
		
		JCBTipoRAm = new JComboBox();
		JCBTipoRAm.setToolTipText("TipoRam");
		JCBTipoRAm.setBounds(100, 345, 101, 22);
		contentPane.add(JCBTipoRAm);
		for(TipoRam tipoR: TipoRam.values()) {
			JCBTipoRAm.addItem(tipoR.getValue());}
		
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 303, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textPrecio = new JTextField();
		textPrecio.setText("");
		textPrecio.setBounds(66, 302, 89, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblTipoRam = new JLabel("Tipo de Ram");
		lblTipoRam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoRam.setBounds(10, 347, 101, 14);
		contentPane.add(lblTipoRam);
		
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
		textcantDisponible.setBounds(151, 220, 101, 20);
		contentPane.add(textcantDisponible);
		
		textNumeroSerie = new JTextField();
		textNumeroSerie.setToolTipText("");
		textNumeroSerie.setColumns(10);
		textNumeroSerie.setBounds(118, 122, 165, 20);
		contentPane.add(textNumeroSerie);
		
		JLabel lblnumeroSerie = new JLabel("Numero de Serie");
		lblnumeroSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumeroSerie.setBounds(10, 120, 127, 20);
		contentPane.add(lblnumeroSerie);
		
		JButton btnSalir = new JButton("Salir");
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
	}
	
	public void guardarDatos() {       
		 String numeroSerie = textNumeroSerie.getText();
	        String marca = txtMarca.getText();
	        int cantidadDisponible = Integer.parseInt(textcantDisponible.getText());
	        double cantidadMemoria = Double.parseDouble(lblcantidadMemoria.getText());
	        float precio = Float.parseFloat(textPrecio.getText());
	        TipoRam tipoRam = TipoRam.valueOf(JCBTipoRAm.getSelectedItem().toString());
	        String modelo="null";
	       
	        MemoriasRAM memoriasRAM = new MemoriasRAM(cantidadMemoria, tipoRam, precio, cantidadDisponible, numeroSerie,  marca, modelo);

	        memoriasRamList.add(memoriasRAM);
	        JOptionPane.showMessageDialog(null, "Guardado Correctamente" );

   }
	
	
}
