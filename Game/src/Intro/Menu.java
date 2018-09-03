package Intro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.*;
public class Menu extends JFrame {

	private JPanel contentPane;
	public static int time=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);
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
	public Menu() {
		setTitle("Bonus Prizes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 760, 520);
		getContentPane().setBackground(new Color(153, 204, 255));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		
		
		JLabel lblEachEggContains = new JLabel("Each potion may contain a unique prize.");
		lblEachEggContains.setForeground(new Color(204, 255, 255));
		lblEachEggContains.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblEachEggContains.setBounds(239, 113, 350, 33);
		
		
		
	
		JLabel lblClickOneTo = new JLabel("Click one to find out !");
		lblClickOneTo.setForeground(new Color(0, 0, 153));
		lblClickOneTo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblClickOneTo.setBounds(293, 157, 157, 14);
		contentPane.add(lblClickOneTo);
		
		contentPane.add(lblEachEggContains);
		
		
		
		JButton button = new JButton("");
		button.setBackground(new Color(143,164,227));
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(time==0){//blue potion
				System.out.println("if more than 2 than skip level. if less repeat it");
				time++;
				final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\skip.png");

				JOptionPane.showMessageDialog(null, "<html><h2><font color='rgb(64,224,208)'>It's a Prize!!</font></h2></html>\n You just skipped one Level","", 0, icon);
				}
				else {
			 final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\hat.png");
			JOptionPane.showMessageDialog(null,"<html><h2><font color='blue'>Sorry.</font></h2></html> \nYou can only use one of these potions once per level","", 0, icon);
					System.out.println("Sorry. you can only do it once");}
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\p2.png"));
		button.setBounds(324, 220, 85, 116);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(143,164,227));
		button_1.setBorderPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(time==0){//purple potion
					System.out.println("Auto Balance");
					int x;
					x=(int) (Math.random()*100);
					frame.valueCounter1=50+x;
					frame.valueCounter2=50+x;
final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\auto.png");

	JOptionPane.showMessageDialog(null, "<html><h2><font color='green'>It's a Prize!!</font></h2></html>\n Your scale will be Auto Balanced","", 0, icon);
					
					time++;
					}
					else {
			  final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\hat.png");

				JOptionPane.showMessageDialog(null, "<html><h2><font color='purple'>Sorry.</font></h2></html>\nYou can only use one of these potions once per level","", 0, icon);
						System.out.println("Sorry. you can only do it once");}
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\p1.png"));
		button_1.setBounds(79, 290, 85, 116);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(143,164,227));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(time==0&&frame.points>0){//orange portion
					System.out.println("Deduct Points");
					time++;
						Game.Operation.deduct();
					final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\deduct.png");
	JOptionPane.showMessageDialog(null, "<html><h2><font color='rgb(220,20,60)'> It's a Trick!!</font></h2></html>\n Your points will be deducted ","", 0, icon);
					}
					else {
				  final ImageIcon icon = new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\hat.png");
				JOptionPane.showMessageDialog(null, "<html><h2><font color='orange'>Sorry.</font></h2></html>\nYou can only use one of these potions once per level","", 0, icon);
						System.out.println("Sorry. you can only do it once");}
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\p3.png"));
		button_2.setBounds(573, 302, 85, 116);
		contentPane.add(button_2);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnExit.setBackground(new Color(204, 204, 255));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnExit.setBounds(621, 437, 103, 43);
		contentPane.add(btnExit);
		
		JLabel label1 = new JLabel("");
		label1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\bonus-prize.jpg"));
		label1.setBounds(0, -19, 874, 570);
		contentPane.add(label1);	
		
		
		
		
		
	}
}
