package Visual;
import LogicoComponentes.DiscosDuros;
import Visual.ComprarComputadoa.ComprarDiscoDuro;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
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
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class JDiscoDuro extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtcapacidadMemoria;
	private JTextField textPrecio;
	private JTextField textcantDisponible;
	private JTextField textNumeroSerie;
	private JTextField textModelo;
	private JComboBox JCBTipoConexion;
	private ArrayList<DiscosDuros> discosDurosList; 
	private ComprarDiscoDuro comprarDiscoDuro;
	
	


	public ArrayList<DiscosDuros> getDiscosDurosList() {
        return discosDurosList;}

	public void setDiscosDurosList(ArrayList<DiscosDuros> discosDurosList) {
		this.discosDurosList = discosDurosList;
	}
	
	public ComprarDiscoDuro getComprarDiscoDuro() {
        return comprarDiscoDuro;}

	public void setComprarDiscoDuro(ComprarDiscoDuro comprarDiscoDuro) {
		this.comprarDiscoDuro = comprarDiscoDuro;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDiscoDuro frame = new JDiscoDuro();
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
	public JDiscoDuro() {
		discosDurosList=new ArrayList<>();
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemoriaRAm = new JLabel("Disco Duro");
		lblMemoriaRAm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemoriaRAm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemoriaRAm.setBounds(263, 11, 178, 67);
		contentPane.add(lblMemoriaRAm);
		
		txtMarca = new JTextField();
		txtMarca.setToolTipText("");
		txtMarca.setBounds(66, 174, 217, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(20);
		
		txtcapacidadMemoria = new JTextField();
		txtcapacidadMemoria.setToolTipText("");
		txtcapacidadMemoria.setColumns(10);
		txtcapacidadMemoria.setBounds(161, 259, 101, 20);
		contentPane.add(txtcapacidadMemoria);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 174, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblcapacidadMemoria = new JLabel("Capacidad de Memoria:");
		lblcapacidadMemoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblcapacidadMemoria.setBounds(10, 260, 162, 14);
		contentPane.add(lblcapacidadMemoria);
		
		JCBTipoConexion = new JComboBox();
		JCBTipoConexion.setToolTipText("");
		JCBTipoConexion.setBounds(130, 345, 101, 22);
		contentPane.add(JCBTipoConexion);
		for(TipoConexion tipoC: TipoConexion.values()) {
		JCBTipoConexion.addItem(tipoC.getValue());}
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 303, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textPrecio = new JTextField();
		textPrecio.setText("");
		textPrecio.setBounds(66, 302, 89, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblTipoConexion = new JLabel("Tipo de Conexion:");
		lblTipoConexion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoConexion.setBounds(10, 347, 127, 14);
		contentPane.add(lblTipoConexion);
		
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
		textcantDisponible.setBounds(161, 220, 101, 20);
		contentPane.add(textcantDisponible);
		
		textNumeroSerie = new JTextField();
		textNumeroSerie.setToolTipText("");
		textNumeroSerie.setColumns(10);
		textNumeroSerie.setBounds(119, 89, 165, 20);
		contentPane.add(textNumeroSerie);
		
		
		JLabel lblnumeroSerie = new JLabel("Numero de Serie");
		lblnumeroSerie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnumeroSerie.setBounds(10, 87, 127, 20);
		contentPane.add(lblnumeroSerie);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		textModelo.setBounds(66, 130, 217, 20);
		contentPane.add(textModelo);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(10, 133, 73, 14);
		contentPane.add(lblModelo);
	}
	
	
	public  void guardarDatos() {       
			String numeroSerie = textNumeroSerie.getText();
	        String marca = txtMarca.getText();
	        String modelo = textModelo.getText();
	        int cantidadDisponible = Integer.parseInt(textcantDisponible.getText());
	        double capacidadAlmacenamiento = Double.parseDouble(txtcapacidadMemoria.getText());
	        float precio = Float.parseFloat(textPrecio.getText());
	        TipoConexion tipoConexion = TipoConexion.valueOf(JCBTipoConexion.getSelectedItem().toString());
	       
	        DiscosDuros discoDuro = new DiscosDuros(capacidadAlmacenamiento, tipoConexion, precio, cantidadDisponible, numeroSerie, marca, modelo);

	        getDiscosDurosList().add(discoDuro);
	        
	        JOptionPane.showMessageDialog(null, "Guardado Correctamente" );
	        ComprarDiscoDuro cpdd = new ComprarDiscoDuro();
	        cpdd.actualizarTabla(discoDuro);
	        
	      
	       

    }

	
	 
	

}
