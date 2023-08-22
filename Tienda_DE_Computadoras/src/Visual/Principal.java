package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Visual.ComprarComputadoa.ComprarComputadora;
import Visual.ComprarComputadoa.InformacionPersonal;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Principal extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistraPC = new JButton("Registrar Computadora");
		btnRegistraPC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Componentes componentes = new Componentes();
				componentes.setVisible(true);
				setVisible(false);
			}
		});
		btnRegistraPC.setBackground(new Color(192, 192, 192));
		btnRegistraPC.setForeground(new Color(0, 0, 0));
		btnRegistraPC.setBounds(178, 99, 192, 56);
		contentPane.add(btnRegistraPC);
		
		JButton btnComprarComputadora = new JButton("Comprar Computadora");
		btnComprarComputadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformacionPersonal informacionPersonal = new InformacionPersonal();
				informacionPersonal.setVisible(true);
				setVisible(false);
			}
		});
		btnComprarComputadora.setForeground(new Color(0, 0, 0));
		btnComprarComputadora.setBackground(new Color(192, 192, 192));
		btnComprarComputadora.setBounds(178, 185, 192, 56);
		contentPane.add(btnComprarComputadora);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(417, 310, 89, 23);
		contentPane.add(btnSalir);
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(223, 255, 254));
		panel_1.setBounds(0, 0, 546, 358);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel JLTiendaComputadoras = new JLabel("Tienda de Computadoras");
		JLTiendaComputadoras.setBounds(152, 22, 246, 29);
		JLTiendaComputadoras.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 21));
		JLTiendaComputadoras.setBackground(SystemColor.activeCaption);
		panel_1.add(JLTiendaComputadoras);
	}
}
