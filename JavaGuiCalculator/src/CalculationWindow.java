import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class CalculationWindow {

	private JFrame frmGuiCalculator;
	private JTextField tf_firstNumber;
    private JLabel lbl_message;
    private JTextField tf_secondNumber;
    private JLabel lbl_message_1;
    private JButton btn_substract;
    private JTextField tf_result;
    private JLabel lbl_message_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculationWindow window = new CalculationWindow();
					window.frmGuiCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuiCalculator = new JFrame();
		frmGuiCalculator.setTitle("GUI Calculator");
		frmGuiCalculator.setBounds(100, 100, 753, 449);
		frmGuiCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuiCalculator.getContentPane().setLayout(null);
		
		JButton btn_add = new JButton("Add");
		btn_add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	show message in a window
			 * JOptionPane.showMessageDialog(null, "Hello There!");
			 *  
			 *  show message in text label
			 *  lbl_message.setText("Hello There!");
			 */
				float num1, num2, result;
				try {
					num1= Float.parseFloat(tf_firstNumber.getText());
					num2= Float.parseFloat(tf_secondNumber.getText());
					result = num1 + num2;
					tf_result.setText(Float.toString(result));
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			
			}});
		btn_add.setBounds(91, 164, 262, 48);
		frmGuiCalculator.getContentPane().add(btn_add);
		
		tf_firstNumber = new JTextField();
		tf_firstNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_firstNumber.setBounds(91, 79, 262, 34);
		frmGuiCalculator.getContentPane().add(tf_firstNumber);
		tf_firstNumber.setColumns(10);
		
		lbl_message = new JLabel("First Number");
		lbl_message.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_message.setBounds(91, 33, 130, 36);
		frmGuiCalculator.getContentPane().add(lbl_message);
		
		tf_secondNumber = new JTextField();
		tf_secondNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_secondNumber.setColumns(10);
		tf_secondNumber.setBounds(405, 79, 262, 34);
		frmGuiCalculator.getContentPane().add(tf_secondNumber);
		
		lbl_message_1 = new JLabel("Second Number");
		lbl_message_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_message_1.setBounds(404, 33, 130, 36);
		frmGuiCalculator.getContentPane().add(lbl_message_1);
		
		btn_substract = new JButton("Substract");
		btn_substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				try {
					num1= Float.parseFloat(tf_firstNumber.getText());
					num2= Float.parseFloat(tf_secondNumber.getText());
					result = num1 - num2;
					tf_result.setText(Float.toString(result));
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btn_substract.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_substract.setBounds(405, 164, 262, 48);
		frmGuiCalculator.getContentPane().add(btn_substract);
		
		tf_result = new JTextField();
		tf_result.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tf_result.setColumns(10);
		tf_result.setBounds(231, 307, 262, 34);
		frmGuiCalculator.getContentPane().add(tf_result);
		
		lbl_message_2 = new JLabel("Result:");
		lbl_message_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_message_2.setBounds(91, 305, 96, 36);
		frmGuiCalculator.getContentPane().add(lbl_message_2);
	}
}
