package Intro;

//2D game designed for educational and entertainment purposes.
//Title: Ballen
// Creators: Nida Husain Mukhtar.. Mwaddah Ibraheem Samman..Amal Ali Aleisa
//contact us at: nida_muk@hotmail.com

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Game.Tutorial;
import Game.frame;
public class Frame1 {

	private JFrame frmBalanceTheScale;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblEnterName;
	private JLabel label;
	public JFrame myFrame;
	public frame Game;
	public static int startGame=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmBalanceTheScale.setLocationRelativeTo(null);
					window.frmBalanceTheScale.setResizable(false);
					window.frmBalanceTheScale.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		
		});
		
	
		
	}


	public Frame1() {
		initialize();
	}


	private void initialize() {

		frmBalanceTheScale = new JFrame();

		frmBalanceTheScale.setTitle("Ballen");
		frmBalanceTheScale.getContentPane().setBackground(new Color(255, 255, 204));
		frmBalanceTheScale.getContentPane().setForeground(Color.GRAY);
		frmBalanceTheScale.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 255));
		textField.setBounds(136, 78, 167, 23);
		frmBalanceTheScale.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton button = new JButton("Start");
		button.setBackground(new Color(255, 255, 0));
		button.setForeground(new Color(65, 105, 225));
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start Game");
				String Username=textField.getText();
				frame.name=Username;
				System.out.println(Username);
				
				frmBalanceTheScale.dispose();
				Game =new frame();
				Color color=new Color(195,195,195);
				Game.getContentPane().setBackground(color);
				Game.setDefaultCloseOperation(Game.DISPOSE_ON_CLOSE);
				Game.start();

				
			}
		});
		button.setBounds(110, 146, 89, 23);
		frmBalanceTheScale.getContentPane().add(button);
		
		btnNewButton = new JButton("Tutorial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tutorial t=new Tutorial();
				t.main(null);
				System.out.println("Display Tutorial");
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(65, 105, 225));
		btnNewButton.setBounds(240, 146, 89, 23);
		frmBalanceTheScale.getContentPane().add(btnNewButton);
		
		lblEnterName = new JLabel("Enter your name:");
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterName.setForeground(new Color(65, 105, 225));
		lblEnterName.setBounds(150, 53, 132, 14);
		frmBalanceTheScale.getContentPane().add(lblEnterName);
		
		label = new JLabel("");
		Image img =new ImageIcon(this.getClass().getResource("/wizard.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 33, 102, 116);
		frmBalanceTheScale.getContentPane().add(label);
		
		
		
		frmBalanceTheScale.setBounds(100, 100, 450, 300);
		frmBalanceTheScale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}


	public void closegame() {

		
		
	}


}

