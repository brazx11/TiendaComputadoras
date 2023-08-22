package Visual.ComprarComputadoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Logico.Usuario;
import Visual.Principal;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InformacionPersonal extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textApellido;
	private JTextField textDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionPersonal frame = new InformacionPersonal();
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
	public InformacionPersonal() {
		setTitle("Comprar Computadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 255, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(25, 65, 70, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Telefono:");
		lblNewLabel.setBounds(25, 145, 70, 14);
		contentPane.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setBounds(122, 62, 112, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(122, 142, 112, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(25, 99, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbldireccion = new JLabel("Direccion:");
		lbldireccion.setBounds(25, 185, 70, 14);
		contentPane.add(lbldireccion);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(122, 98, 112, 20);
		contentPane.add(textApellido);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(122, 184, 112, 20);
		contentPane.add(textDireccion);
		
		JButton btnSiguente = new JButton("Siguiente");
		btnSiguente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    SiguienteAccion();
				}  catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Hubo un error Complete los campos nuevamente.",
	                        "Error de formato", JOptionPane.ERROR_MESSAGE);
	            }
			}
		});
		btnSiguente.setBounds(300, 227, 89, 23);
		contentPane.add(btnSiguente);
		
		JLabel lblNewLabel_2 = new JLabel("Informacion Personal");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(134, 11, 177, 28);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnAtras.setBounds(201, 227, 89, 23);
		contentPane.add(btnAtras);
	}
	
	
	 private void SiguienteAccion() {
		 	
		 	String nombre = textNombre.getText().trim();
	        String apellido = textApellido.getText().trim();
	        String telefono = textTelefono.getText().trim();
	        String direccion = textDireccion.getText().trim();
	        
	        Usuario usuario = new Usuario(nombre, apellido, direccion, telefono);	        

	        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de continuar.",
	                    "Campos incompletos", JOptionPane.ERROR_MESSAGE);
	        } else {
	            ComprarComputadora comprarComputadora = new ComprarComputadora();
	            comprarComputadora.setVisible(true);
	            setVisible(false);
	        }
	
	 }
}
