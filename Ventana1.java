package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Ventana1 {

	private JFrame frmMiVentana;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
					window.frmMiVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiVentana = new JFrame();
		frmMiVentana.getContentPane().setBackground(UIManager.getColor("Button.light"));
		frmMiVentana.setTitle("Mi 1\u00BA Ventana");
		frmMiVentana.setBounds(100, 100, 450, 300);
		frmMiVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiVentana.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(44, 51, 46, 14);
		frmMiVentana.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(44, 91, 46, 14);
		frmMiVentana.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setBounds(44, 133, 46, 14);
		frmMiVentana.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(182, 48, 154, 20);
		frmMiVentana.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 88, 154, 20);
		frmMiVentana.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 130, 154, 20);
		frmMiVentana.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(21, 33, 386, 135);
		frmMiVentana.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Introducir datos");
		btnNewButton.setBounds(21, 191, 130, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmMiVentana.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(318, 191, 89, 23);
		frmMiVentana.getContentPane().add(btnNewButton_1);
	}

}
