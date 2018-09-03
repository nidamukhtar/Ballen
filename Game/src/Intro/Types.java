package Intro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Types extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Types frame = new Types();
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
	public Types() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.getContentPane().setBackground(new Color(0, 255, 153));
		
		JLabel lblChooseOneOf = new JLabel("Choose one of these operations to play the game or continue to default game:");
		lblChooseOneOf.setForeground(new Color(255, 255, 204));
		lblChooseOneOf.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblChooseOneOf.setBounds(68, 40, 710, 38);
		contentPane.add(lblChooseOneOf);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\wiz.png"));
		label_1.setBounds(-13, 336, 245, 235);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 51, 255));
		btnNewButton.setBounds(689, 473, 113, 45);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\o1.png"));
		button.setBounds(492, 286, 98, 81);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\o2.png"));
		button_1.setBounds(346, 335, 113, 124);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\o3.png"));
		button_2.setBounds(273, 141, 98, 73);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setForeground(Color.MAGENTA);
		button_3.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\o4.png"));
		button_3.setBounds(403, 141, 122, 105);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\o5.png"));
		button_4.setBounds(223, 243, 131, 124);
		contentPane.add(button_4);
		
		

	}
}
