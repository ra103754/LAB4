package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textdataNasc;
	public JTextField textEmail;
	public JTextField textCPF;
	public JTextField textPhone;
	public JTextField textAddress1;
	public JTextField textAddress2;
	public JTextField textCEP;
	public JTextField textCity;
	public JTextField textState;
	public JTextField textCountry;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(99, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(99, 88, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textdataNasc = new JTextField();
		textdataNasc.setBounds(170, 118, 114, 19);
		contentPane.add(textdataNasc);
		textdataNasc.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(99, 148, 114, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(99, 178, 114, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(99, 208, 114, 19);
		contentPane.add(textPhone);
		textPhone.setColumns(10);
		
		textAddress1 = new JTextField();
		textAddress1.setBounds(99, 238, 114, 19);
		contentPane.add(textAddress1);
		textAddress1.setColumns(10);
		
		textAddress2 = new JTextField();
		textAddress2.setBounds(99, 268, 114, 19);
		contentPane.add(textAddress2);
		textAddress2.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.setBounds(99, 298, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textCity = new JTextField();
		textCity.setBounds(99, 328, 114, 19);
		contentPane.add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(99, 358, 114, 19);
		contentPane.add(textState);
		textState.setColumns(10);
		
		textCountry = new JTextField();
		textCountry.setBounds(99, 388, 114, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 90, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento:");
		lblDataNasc.setBounds(12, 120, 150, 15);
		contentPane.add(lblDataNasc);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 150, 90, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(12, 180, 90, 15);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 210, 90, 15);
		contentPane.add(lblPhone);

		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setBounds(12, 240, 90, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address 2:");
		lblAddress2.setBounds(12, 270, 90, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 300, 90, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 330, 90, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 360, 90, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 390, 90, 15);
		contentPane.add(lblCountry);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				
				print printForm = new print();
				printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
				printForm.firstNameLabel.setText(textfirstName.getText());
				printForm.lastNameLabel.setText(textlastName.getText());
				printForm.dataNascLabel.setText(textdataNasc.getText());
				printForm.emailLabel.setText(textEmail.getText());
				printForm.CPFLabel.setText(textCPF.getText());
				printForm.phoneLabel.setText(textPhone.getText());
				printForm.address1Label.setText(textAddress1.getText());
				printForm.address2Label.setText(textAddress2.getText());
				printForm.CEPLabel.setText(textCEP.getText());
				printForm.cityLabel.setText(textCity.getText());
				printForm.stateLabel.setText(textState.getText());
				printForm.countryLabel.setText(textCountry.getText());
				
				if(textCPF.getText().length() != 14 ) {  //espera-se cpf no formato 123.123.123-12
					printForm.CPFLabel.setText("CPF invalido");
				}  
				if(textCEP.getText().length() != 9  ) {  //cep no formato 12345-789
					printForm.CEPLabel.setText("CEP invalido");
				}
				if(textPhone.getText().length() != 10  ) {  //telefone no fomato 12345-1234
					printForm.phoneLabel.setText("Telefone invalido");
				}  
				if(textdataNasc.getText().length() != 8  ) {  //data no formato DD/MM/AA
					printForm.phoneLabel.setText("Data de Nascimento invalida");
				} 
				

				//printForm.contentPane.setVisible(true);				
				printForm.show();	
			}
		});
		btnPrint.setBounds(12, 420, 74, 25);
		contentPane.add(btnPrint);
	}
}
