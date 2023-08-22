package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.Enum.TipoConexion;
import Logico.Enum.TipoRam;
import Logico.Enum.TipoSocket;
import LogicoComponentes.DiscosDuros;
import LogicoComponentes.MotherBoard;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class Mother_Board extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField textModelo;
	private JTextField textPrecio;
	private JTextField textNumeroSerie;
	private JTextField textcantDisponible;
	private JComboBox JCBTiposocket;
	private JComboBox JCBTipoRAm;
	private DefaultListModel  modelo;
	private JCheckBox chckbxIDE;
	private JCheckBox chckbxSATA;
	private JCheckBox chckbxSATA2;
	private JCheckBox chckbxSata3;
	private ArrayList<MotherBoard> motherBoardList; 
	private ArrayList<String> conexionList; 

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mother_Board frame = new Mother_Board();
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
	
	
	
	
	public Mother_Board() {
		motherBoardList = new ArrayList<>();
		conexionList = new ArrayList<>();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mother Board:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(263, 11, 178, 67);
		contentPane.add(lblNewLabel);
		
		txtMarca = new JTextField();
		txtMarca.setToolTipText("");
		txtMarca.setBounds(66, 120, 217, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(20);
		
		textModelo = new JTextField();
		textModelo.setToolTipText("");
		textModelo.setColumns(10);
		textModelo.setBounds(66, 182, 217, 20);
		contentPane.add(textModelo);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 118, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 185, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JCBTipoRAm = new JComboBox();
		JCBTipoRAm.setToolTipText("TipoRam");
		JCBTipoRAm.setBounds(136, 307, 101, 22);
		contentPane.add(JCBTipoRAm);
		for(TipoRam tipoR: TipoRam.values()) {
			JCBTipoRAm.addItem(tipoR.getValue());}
		
		JCBTiposocket = new JComboBox();
		JCBTiposocket.setBounds(10, 307, 101, 22);
		contentPane.add(JCBTiposocket);
		for(TipoSocket tipoS: TipoSocket.values()) {
			JCBTiposocket.addItem(tipoS.getValue());}
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 247, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textPrecio = new JTextField();
		textPrecio.setText("");
		textPrecio.setBounds(63, 244, 89, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblTipoRam = new JLabel("Tipo de Ram");
		lblTipoRam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoRam.setBounds(136, 292, 101, 14);
		contentPane.add(lblTipoRam);
		
		JLabel lblTipoSocket = new JLabel("Tipo de Socket");
		lblTipoSocket.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoSocket.setBounds(10, 290, 101, 14);
		contentPane.add(lblTipoSocket);
		
		JList list = new JList();
		list.setBounds(593, 368, 92, -250);
		contentPane.add(list);
		modelo = new DefaultListModel();
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Lista de Conexiones que soporta");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(326, 120, 217, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblnumeroSerie = new JLabel("Numero de Serie");
		lblnumeroSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumeroSerie.setBounds(10, 149, 127, 20);
		contentPane.add(lblnumeroSerie);
		
		textNumeroSerie = new JTextField();
		textNumeroSerie.setToolTipText("");
		textNumeroSerie.setColumns(10);
		textNumeroSerie.setBounds(118, 151, 165, 20);
		contentPane.add(textNumeroSerie);
		
		textcantDisponible = new JTextField();
		textcantDisponible.setToolTipText("");
		textcantDisponible.setColumns(10);
		textcantDisponible.setBounds(151, 216, 101, 20);
		contentPane.add(textcantDisponible);
		
		JLabel lblCantidadDispoibles = new JLabel("Cantidad Dispoibles:");
		lblCantidadDispoibles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidadDispoibles.setBounds(10, 217, 162, 14);
		contentPane.add(lblCantidadDispoibles);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxIDE.isSelected() || chckbxSATA.isSelected() || chckbxSATA2.isSelected() || chckbxSata3.isSelected()) {
			        try {
			            guardarDatos();
			        } catch (NumberFormatException e) {
			            JOptionPane.showMessageDialog(null, "Error complete los datos requeridos");
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una conexión.", "Error", JOptionPane.ERROR_MESSAGE);
			    }
				
			}
		});
		btnGuardar.setBounds(517, 449, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(649, 449, 89, 23);
		contentPane.add(btnSalir);
		
		chckbxSATA = new JCheckBox("SATA");
		chckbxSATA.setBounds(446, 150, 97, 23);
		contentPane.add(chckbxSATA);
		
		chckbxIDE = new JCheckBox("IDE");
		chckbxIDE.setBounds(326, 150, 97, 23);
		contentPane.add(chckbxIDE);
		
		chckbxSATA2 = new JCheckBox("SATA2");
		chckbxSATA2.setBounds(326, 183, 97, 23);
		contentPane.add(chckbxSATA2);
		
		chckbxSata3 = new JCheckBox("SATA3");
		chckbxSata3.setBounds(446, 181, 97, 23);
		contentPane.add(chckbxSata3);
		
	}
	
	
	public void guardarDatos() {       
		 String numeroSerie = textNumeroSerie.getText();
	        String marca = txtMarca.getText();
	        String modelo = textModelo.getText();
	        int cantidadDisponible = Integer.parseInt(textcantDisponible.getText());
	        float precio = Float.parseFloat(textPrecio.getText());
	        TipoRam tipoRam = TipoRam.valueOf(JCBTipoRAm.getSelectedItem().toString());
	        TipoSocket tipoSocket = TipoSocket.valueOf(JCBTiposocket.getSelectedItem().toString());
	        
	        agregarConexion();
	       
	        MotherBoard motherBoard = new MotherBoard(precio, cantidadDisponible, numeroSerie, marca, modelo, tipoSocket, tipoRam, conexionList);

	        motherBoardList.add(motherBoard);
	        JOptionPane.showMessageDialog(null, "Guardado Correctamente" );
	        dispose();

   }
	public void agregarConexion() {
		
		conexionList.clear();
      
		
		if (chckbxIDE.isSelected()) {
			conexionList.add("IDE");
	    }
	    if (chckbxSATA.isSelected()) {
	    	conexionList.add("Sata");
	    }
	    if (chckbxSATA2.isSelected()) {
	    	conexionList.add("Sata2");
	    }
	    if (chckbxSata3.isSelected()) {
	    	conexionList.add("Sata3");
	    }
		
	}
	

}