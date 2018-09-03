package Game;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tutorial extends JFrame {
	public Tutorial frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tutorial frame = new Tutorial();
				    frame.setLocationRelativeTo(null);
				    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				    frame.setResizable(false);
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
	public Tutorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(830,680);
		setTitle("Tutorial");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\tutoriall.jpg"));
		label.setBounds(0, 0, 1120, 614);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(64, 224, 208));
		btnNewButton.setForeground(new Color(253, 245, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Continue/resume to Game");
				setVisible(false);
			}
		});
		btnNewButton.setBounds(585, 577, 204, 34);
		contentPane.add(btnNewButton);
	}

}
