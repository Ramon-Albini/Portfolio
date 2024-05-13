package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class Calc {
	
	
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(27, 29, 31));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(200, 00, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setDropMode(DropMode.INSERT);
		textField.setBackground(new Color(30, 33, 35));
		textField.setEditable(true);
		textField.setBounds(5, 6, 287, 81);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		 
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(60, 57, 65));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn0.getText();
				printTela(number);
			}
		});
		btn0.setBounds(100, 304, 85, 59);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(60, 57, 65));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn1.getText();
				printTela(number);
			}
		});
		btn1.setBounds(5, 235, 85, 59);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(60, 57, 65));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn2.getText();
				printTela(number);
			}
		});
		btn2.setBounds(100, 235, 85, 59);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(60, 57, 65));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn3.getText();
				printTela(number);
			}
		});
		btn3.setBounds(195, 235, 85, 59);
		frame.getContentPane().add(btn3);
		
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(60, 57, 65));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn4.getText();
				printTela(number);
			}
		});
		btn4.setBounds(5, 166, 85, 59);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(60, 57, 65));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn5.getText();
				printTela(number);
			}
		});
		btn5.setBounds(100, 166, 85, 59);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(60, 57, 65));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn6.getText();
				printTela(number);
			}
		});
		btn6.setBounds(195, 166, 85, 59);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(60, 57, 65));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn7.getText();
				printTela(number);
			}
		});
		btn7.setBounds(5, 97, 85, 59);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(60, 57, 65));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn8.getText();
				printTela(number);
			}
		});
		btn8.setBounds(100, 97, 85, 59);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(60, 57, 65));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btn9.getText();
				printTela(number);
			}
		});
		btn9.setBounds(195, 97, 85, 59);
		frame.getContentPane().add(btn9);
		
		JButton btnMais = new JButton("+");
		btnMais.setForeground(new Color(255, 255, 255));
		btnMais.setBackground(new Color(53, 48, 60));
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btnMais.getText();
				printTela(number);
			}
		});
		btnMais.setBounds(290, 97, 85, 59);
		frame.getContentPane().add(btnMais);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setForeground(new Color(255, 255, 255));
		btnMenos.setBackground(new Color(53, 48, 60));
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = btnMenos.getText();
				printTela(number);
			}
		});
		btnMenos.setBounds(290, 166, 85, 59);
		frame.getContentPane().add(btnMenos);
		
		JButton btnVezes = new JButton("X");
		btnVezes.setForeground(new Color(255, 255, 255));
		btnVezes.setBackground(new Color(53, 48, 60));
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "*";
				printTela(number);
			}
		});
		btnVezes.setBounds(290, 235, 85, 59);
		frame.getContentPane().add(btnVezes);
		
		JButton btnDivisao = new JButton("÷");
		btnDivisao.setForeground(new Color(255, 255, 255));
		btnDivisao.setBackground(new Color(53, 48, 60));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = "/";
				printTela(number);
			}
		});
		btnDivisao.setBounds(290, 304, 85, 59);
		frame.getContentPane().add(btnDivisao);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(219, 158, 229));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fazerCalculo();
			}
		});
		btnIgual.setBounds(195, 304, 85, 59);
		frame.getContentPane().add(btnIgual);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.setForeground(new Color(255, 255, 255));
		btnVirgula.setBackground(new Color(53, 48, 60));
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = ".";
				printTela(number);
			}
		});
		btnVirgula.setBounds(5, 304, 85, 59);
		frame.getContentPane().add(btnVirgula);
		
		JButton btnClear = new JButton("Limpar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnClear.setForeground(new Color(255, 134, 134));
		btnClear.setBackground(new Color(53, 48, 60));
		btnClear.setBounds(290, 6, 85, 81);
		frame.getContentPane().add(btnClear);
	}
	
	public void printTela(String number) {
		textField.setText(textField.getText()+number);
		 }
	
	public void fazerCalculo() {
		Double resultado = 0.0;
		String numeroString = textField.getText();
		
		//ajuda do gpt
		Pattern pattern = Pattern.compile("(\\d+)([\\+\\-\\*/])(\\d+)");
		Matcher matcher = pattern.matcher(numeroString);
		
		if (matcher.find()) {
			Double primeiroNumero = Double.parseDouble(matcher.group(1));
			String operador = matcher.group(2);
			Double segundoNumero = Double.parseDouble(matcher.group(3));
			
			switch (operador) {
			case "+":
				resultado = primeiroNumero + segundoNumero;
				break;
			case "-":
				resultado = primeiroNumero - segundoNumero;
				break;
			case "*":
				resultado = primeiroNumero * segundoNumero;
				break;
			case "/":
				resultado = primeiroNumero / segundoNumero;
				break;

			default:
				break;
			}
			
			String resultadoString = Double.toString(resultado);	
			textField.setText(resultadoString);
			
		}
	}
	
	
}
