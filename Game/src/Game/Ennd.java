package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ennd extends JDialog implements Runnable {

	private final JPanel contentPanel = new JPanel();


	public static void main(String[] args) {
		try {
			Ennd dialog = new Ennd();
			
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.pack();
			dialog.setSize(1370, 720);
		
			dialog.setVisible(true);
			 while (true) {
			        dialog.moveBall();
			        dialog.repaint();
			        Thread.sleep(20);
			        
			    
			    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	int GreenX=400,GreenY=45;
	int BlueX=550,BlueY=50; 
	int YellowX=650, YellowY=50; 
	int PurpleX=550,PurpleY=45;
	int RedX=600,RedY=20;
	int PinkX=970,PinkY=65;
	int TalX=900,TalY=45;
	
	

	public void moveBall() {
		
		GreenY=GreenY+5;
		GreenX=GreenX-5;

				
		BlueY=BlueY+8;
		BlueX=BlueX+-8;
				
		YellowY=YellowY+15; 
		YellowX=YellowX-5; 
		
		PurpleY=PurpleY+8;
		PurpleX=PurpleX+8;
		
		RedY=RedY+15;
		RedX=RedX-10;
		
		PinkY=PinkY+10;
        PinkX=PinkX+10;
		
        TalX=TalX+5;
        TalY=TalY+15;
        
        
        // Re falling 
        
        if(GreenY >=900 || YellowY>=990||BlueY>960&&RedY>900||TalY>900&&PurpleY>900&&PinkY>890){
			YellowY=50;
			GreenY= 45;
			BlueY =50;
			RedY = 45;
			TalY=  45;
			PurpleY=45;
			PinkY=45;
			GreenX=400;
			BlueX =550;
			RedX =600;
			TalX=500;
			PurpleX=550;
			PinkX=970;
			YellowX=650;
		}
    }
	
public void paint(Graphics g) {
        super.paint(g);
        

       /* Font phrase = new Font ("Courier New",Font.BOLD,50);;
		g.setFont(phrase);
		g.setColor(Color.black);
		g.drawString("Congratulations!", 250, 380);
		g.drawString("You Won!", 360, 450);
        */
        
      //-----------------------------------------
        g.setColor  (Color.GREEN);
        g.fillRect (GreenX,GreenY, 20, 20);
     //--------------------------------------------
        g.setColor(Color.BLUE);
        g.fillRect(BlueX, BlueY, 20, 20);
     //--------------------------------------------
        g.setColor (Color.YELLOW); 
        g.fillRect (YellowX,YellowY,20,20); 
     //--------------------------------------------
       Color purple = new Color(153,10,204);
       g.setColor(purple);
	   g.fillRect(PurpleX, PurpleY, 20, 20);
	 //-------------------------------------------
	    g.setColor(Color.RED);
        g.fillRect(RedX, RedY, 20, 20);
     //-------------------------------------------
        g.setColor(Color.PINK);
        g.fillRect(PinkX, PinkY, 20, 20);
      //------------------------------------------
        g.setColor(Color.CYAN);
        g.fillRect(TalX,TalY, 20,20); 
        
      //---------------------------------------
        
        g.setColor(Color.WHITE);
    	g.fillRect(TalX+100, TalY+80,20,20);
    	
    	//-----------------------
    	   
        g.setColor(Color.ORANGE);
    	g.fillRect(PinkX+100, TalY+80,20,20);
    	
    	//-----------------------
    	  g.setColor(Color.ORANGE);
      	g.fillRect(GreenX+100, PinkY+80,20,20);
      	
      	//-----------------------
   
	}
	
	
	
	public Ennd() {
		setSize(1000, 760);
		setTitle("End of The Game");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\bk2.jpg"));
		label_1.setBounds(395, 273, 579, 175);
		contentPanel.add(label_1);
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\BIGWIZARD.png"));
		label_2.setBounds(118, 376, 243, 256);
		contentPanel.add(label_2);

		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		Color color=new Color(255,190,93);
		btnNewButton.setBackground(color);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});		btnNewButton.setForeground(new Color(255, 255, 204));
		btnNewButton.setBounds(1130, 589, 129, 46);
		contentPanel.add(btnNewButton);
		
		JLabel label_3 = new JLabel("                                       Player's Name :      "+frame.name+"                                                         Points : 500");
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 22));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(60, 66, 1050, 110);
		contentPanel.add(label_3);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\bk.jpg"));
		label.setBounds(0, 0, 1360, 760);
		contentPanel.add(label);
		
		
		
	
		
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
