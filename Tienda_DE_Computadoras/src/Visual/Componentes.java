package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Componentes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes frame = new Componentes();
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
	public Componentes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 255, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMotherBoard = new JButton("Mother Board");
		btnMotherBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mother_Board mother = new Mother_Board();
				mother.setVisible(true);
				mother.setLocationRelativeTo(null);
				
			}
		});
		btnMotherBoard.setBounds(161, 75, 138, 23);
		contentPane.add(btnMotherBoard);
		
		JLabel lblNewLabel = new JLabel("Agregar Componentes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 11, 210, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JButton btnMemoriaRam = new JButton("Memoria RAM");
		btnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Memoria_Ram memoryRam = new Memoria_Ram();
				memoryRam.setVisible(true);
				memoryRam.setLocationRelativeTo(null);
				
			}
		});
		btnMemoriaRam.setBounds(161, 112, 138, 23);
		contentPane.add(btnMemoriaRam);
		
		JButton btnMicroProcesador = new JButton("Micro-Procesador");
		btnMicroProcesador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MicroProcesador microProcesador = new MicroProcesador();
				microProcesador.setVisible(true);
				microProcesador.setLocationRelativeTo(null);
				
			}
		});
		btnMicroProcesador.setBounds(161, 183, 138, 23);
		contentPane.add(btnMicroProcesador);
		
		JButton btnDiscoDuro = new JButton("Disco Duro");
		btnDiscoDuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDiscoDuro DiscoDuro = new JDiscoDuro();
				DiscoDuro.setVisible(true);
				DiscoDuro.setLocationRelativeTo(null);
				
			}
		});
		btnDiscoDuro.setBounds(161, 146, 138, 23);
		contentPane.add(btnDiscoDuro);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnAtras.setBounds(324, 227, 89, 23);
		contentPane.add(btnAtras);
	}

}
