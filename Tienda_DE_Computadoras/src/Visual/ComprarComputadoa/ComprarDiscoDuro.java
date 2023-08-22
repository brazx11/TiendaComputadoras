package Visual.ComprarComputadoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import LogicoComponentes.DiscosDuros;
import Visual.JDiscoDuro;


import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComprarDiscoDuro extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modeloTabla = new DefaultTableModel();
	JDiscoDuro discoDuro1 = new JDiscoDuro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComprarDiscoDuro frame = new ComprarDiscoDuro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
		

	
	public ComprarDiscoDuro() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 255, 254));
		contentPane.setForeground(new Color(223, 255, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 930, 434);
		contentPane.add(scrollPane);
		
		table  = new JTable();
		
		table.setFont(new Font("Arial Black", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Marca", "Modelo", "Numero de serie", "Stock", "Tipo de conexion", "Almacenamiento", "Precio", "Agregar"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Object.class, String.class, Float.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(41);
		table.getColumnModel().getColumn(4).setPreferredWidth(84);
		table.getColumnModel().getColumn(5).setPreferredWidth(93);
		
		modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Numero de serie");
        modeloTabla.addColumn("Stock");
        modeloTabla.addColumn("Tipo de dato");
        modeloTabla.addColumn("Almacenamiento");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Agregar");
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				discoDuro1.guardarDatos();
			}
		});
		btnNewButton.setBounds(807, 588, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Productos");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 195, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SubTotal:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1.setBounds(643, 486, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ITBIS:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(643, 511, 66, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Total:");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(643, 536, 66, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1 = new JButton("ver prueba");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				discoDuro1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(696, 588, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	
	
	public void actualizarTabla(DiscosDuros discoDuro) {
		 modeloTabla.setRowCount(0);
	    Object[] fila = {
	        discoDuro.getMarca(),
	        discoDuro.getModelo(),
	        discoDuro.getNumeroSerie(),
	        discoDuro.getCantidadDisponible(),
	        discoDuro.getTipoconexion(),
	        discoDuro.getCapacidadAlmacenamiento(),
	        discoDuro.getPrecio(),
	        false
	    };
	    modeloTabla.addRow(fila);
	    table.setModel(modeloTabla);
	}
	
	
	

	
	
	
}
