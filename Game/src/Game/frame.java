package Game;
 import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Intro.Menu;




public class frame extends JFrame implements MouseListener,Runnable,KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4028833390181437866L;
	
	public static int BallValue;
	public static int clearBt=0;
	public static int valueCounter1=0; static int choice1=0;int Ball4c1=0;
	public static int valueCounter2=0;	static int choice2=0;int Ball4c2=0;
	public static int points=50;
	public static int level=2;
	public static char color='n';
	public static char op='1';
	public static int Frame1=1;
	public static int help=10;
	public static int close;
	music Music=new music();
	public static String name;
	public static int clicked=1;
	public static char prevBallSelected;
	public static int randomNum=1;
	Thread th1;
	int startmusic=0;
	int time=1;
	int StartOfTheGame=0;
	static boolean runGame=true;
	//------------------------
	int GreenXpos=680,GreenYpos=55,GreenRadius=5;	
	int YellowXpos=630,YellowYpos=35,YellowRadius=5;
	int BlueXpos=660,BlueYpos=65,BlueRadius=5;
	int RXpos=560,RYpos=45,RRadius=5;
	int OXpos=560,OYpos=55,ORadius=5;
	int PurpleX=730,PurpleY=45,PurRadius=5;
	int PinkX=558,PinkY=55;

	JFrame frame;

	public frame() {//calls start method
		
		setTitle("Ballen");
		setSize(1800,730);
		setVisible(true);
		addMouseListener(this);
		addKeyListener(this);		
		setFocusable(true);
	    requestFocusInWindow();
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

		//------------------------

	    sound.beat.loop();
		setLayout(null);//to move freely
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		Image img =new ImageIcon(this.getClass().getResource("/w1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(1030, 240, 325, 450);
		add(label);
		//------------------------

	JButton btnClear = new JButton("Clear");
	btnClear.setFont(new Font("Courier New", Font.BOLD, 12));
	btnClear.setBackground(new Color(255, 255, 102));
	btnClear.setForeground(new Color(255, 102, 0));
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
		sound.clear.play();
			if(clearBt==0){
			valueCounter1=0;
			valueCounter2=0;}	
			clearBt++;
		  requestFocusInWindow();//must return control to key listener

			
		}
	});
	btnClear.setBounds(28, 330, 84, 29);
	add(btnClear);
	
	//---------------------------------------
	
	JButton button_3 = new JButton("");
	button_3.setBackground(new Color(195,195,195));
	button_3.setBorderPainted(false);
	button_3.setVerticalAlignment(SwingConstants.TOP);
	button_3.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\bonus-icon.png"));
	button_3.setBounds(282, 6,71, 73);
	button_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		Menu prizeBonus =new Menu();
		prizeBonus.main(null);

		}
	});
	add(button_3);

	
	}
	

	public void start(	){
		 th1 = new Thread (this);
		th1.start ();//calls run method
	}



	public void run () 
	{ 
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		
		while(runGame)
		{

		musicbutton();
		button();
		
		SoundBetweenLevels();
		
		
		GreenYpos=GreenYpos+15;//use y so it falls downward..if x then from left to right
		GreenXpos=GreenXpos+25;
		
		YellowYpos=YellowYpos+20;
		YellowXpos=YellowXpos;
		
		BlueYpos=BlueYpos+25;
		BlueXpos=BlueXpos-10;
		
		RYpos=RYpos+20;
		RXpos=RXpos-18;
		
		OYpos=OYpos+35;
		OXpos=OXpos-15;
		
		PurpleY=PurpleY+10;
		PurpleX=PurpleX+20;
		
		PinkY=PinkY+20;
		PinkX=PinkX-4;
		
		
	
		
		if(GreenYpos >=700 || YellowYpos>=790||BlueYpos>860&&RYpos>700||OYpos>760&&PurpleY>800&&PinkY>800){
			YellowYpos=100;
			GreenYpos = 100;//to restart falling when it reaches the end of the screen
			BlueYpos=120;
			RYpos=100;
			OYpos=130;
			PurpleY=120;
			PinkY=120;
			GreenXpos=680;
			BlueXpos=640;
			RXpos=560;
			OXpos=560;
			PurpleX=500;
			PinkX=650;
			YellowXpos=630;
		}
	
		repaint();
		try
		{
			if(level==1){
		Thread.sleep (70);//how fast it will drop
			}
			else if(level==2)
			Thread.sleep(40);
			else if(level==4)
				Thread.sleep(40);
			else if (level==3)
				Thread.sleep(40);
			else if(level==5)
				Thread.sleep(40);
		}
		catch (InterruptedException ex){}
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
		//-------When thread stops Call the end message------------------------
			
		Ennd end=new Ennd();
		playEndGameMusic();
		end.main(null);

		
	}


	


	public void playEndGameMusic() {

		sound.beat.stop();
		sound.end1.loop();
		sound.end2.loop();
		sound.end3.play();
	
		
	}


	public void musicbutton(){
	
		final JButton button = new JButton("New button");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setIcon(new ImageIcon(buttonimage()));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				++clicked;
				if(clicked%2==0){
					System.out.println("music off");
					startmusic=1;
					sound.beat.stop();
			button.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\music-off-36.png"));
				requestFocusInWindow();

				}
				else{
					button.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\music-on-36.png"));
					System.out.println("music on");
					startmusic=0;
						sound.beat.loop();
					requestFocusInWindow();
				
			

					}
			}
		});
		button.setForeground(Color.LIGHT_GRAY);
		button.setContentAreaFilled(false);
		Color g=new Color(195,195,195);
		button.setForeground(g);
		 Border thickBorder = new LineBorder(g, 12);
		 button.setBorder(thickBorder);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(160, 39, 66, 66);
	add(button);
		
		
	}
	private String buttonimage() {
		
		return "C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\music-on-36.png";
	}



	public void button(){
		//Help Button-------------
		if(help==0){//location
			String[] list={"Auto Balance","Tutorial"};
			final JComboBox comboBox = new JComboBox(list);
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s=(String) comboBox.getSelectedItem();
					if(s=="Auto Balance"){
						sound.help.play();
						int x;
						x=(int) (Math.random()*100);
						Operation.autoAdd(x);
						System.out.println("ADD up:"+x);
						requestFocusInWindow();
						
					}
					else if(s=="Tutorial")
					{				
						sound.help.play();
						System.out.println("Display Tutorial");
						help=1;
						Tutorial tutorial=new Tutorial();
						tutorial.main(null);
						requestFocusInWindow();

					}
				}
			});
			comboBox.setBounds(67,70, 77, 20);
		add(comboBox);
		

			}
	}

	public void SoundBetweenLevels() {
		
		if(points==50){//level 2
			if(time==1){
			sound.level.play();
			time++;
			}
		}
		
		if(points==125){//level 3
			if(time==2){
				sound.level.play();

			time++;
			}
		}
		if(points==225){ //level 4
			if(time==3){
				sound.level.play();

			time++;
			}
		}
		if(points==350){//level 5
			if(time==4){
				sound.level.play();

			time++;
			}
		}
		
	}

	//Level5(randomize operation)..End Game..Tutorial..Can't select same ball sequencly 
	public void paint( final Graphics g) 
	{		
		  super.paint(g);
		Font myFont = new Font ("Courier New", 1,20);
		Font myFont1 = new Font ("Courier New", 1,25);
		

		
		if(level==2){
		if(valueCounter1==valueCounter2 &&points>50&&clearBt==0){
			g.setFont(myFont1);
			g.setColor(Color.red);
		g.drawString("=", 645 , 482);}
		}
		else
		{
			if(valueCounter1==valueCounter2&&valueCounter1!=0){
				g.setFont(myFont1);
				g.setColor(Color.red);
			g.drawString("=", 645 , 482);}
			
			}
		//---------------------------
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\question1.png"));
		lblNewLabel.setBounds(35,50, 45, 45);
			add(lblNewLabel);
		//----------------------------------
		Image colors =new ImageIcon(this.getClass().getResource("/colors1.png")).getImage();
		g.drawImage(colors,8,390,this);
		//------------------
		
		//----------------------------
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\liftt.png"));
		label_1.setBounds(370,378, 531, 268);
		add(label_1);

		//----------------------------------------------
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\OneDrive\\Documents\\PBL-Prac\\Game\\img\\bowl1.png"));
		label.setBounds(510,-30, 255, 228);
	add(label);
		
		//-------------------------------
		Font Font1=new Font("Courier New",1,15);
		g.setFont(Font1);
		g.setColor(Color.BLACK);
		g.drawString(msgboard(),1125 , 406);
		g.setColor(Color.RED);
		g.drawString(operationtype(), 1130, 440);
		if(op=='0'){
			g.setColor(Color.RED);
		g.drawString("Try again", 1130, 390);
		}
		
		
		//------------------------------------------------
		Font f=new Font("Courier New", 1,16);
		g.setFont(f);
		g.setColor(Color.white);
		g.fillRect(460, 483, 50, 21);
		g.setColor(Color.red);//value of counter2
		if(valueCounter2<100)
		g.drawString(" "+valueCounter2, 462, 499);
		else 
			g.drawString(""+valueCounter2, 465, 499);
		//------------------------

		g.setFont(f);
		g.setColor(Color.white);
		g.fillRect(801, 483, 50, 21);
		g.setColor(Color.red);//value of counter1
		if(valueCounter1<100)
		g.drawString(" "+valueCounter1, 805, 498);
		else
			g.drawString(""+valueCounter1, 809, 498);
		//-------------------------------------------------------
		g.setFont(myFont);
		g.setColor(Color.blue);
		g.drawString("Level:"+level+"   XP:"+points, 45, 64);
		g.setColor(Color.BLACK);
		g.drawRect(15, 42, 250, 30);
	
		//----------------------------------------------------
		g.setColor  (Color.GREEN);
		g.fillOval (GreenXpos,GreenYpos, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.black);
	    g.drawString("5", GreenXpos+20, GreenYpos+30);
		//------------------------

	    g.setColor(Color.GREEN);
		g.fillOval (BlueXpos,PinkY, 55, 55);//extra
		//------------------------

		g.setColor  (Color.yellow);
		g.fillOval (GreenXpos,GreenYpos+150, 50, 50);//extra
	//--------------
		g.setColor(Color.yellow);
		g.fillOval(YellowXpos+200,YellowYpos, 50, 50); 
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("3", YellowXpos+220, YellowYpos+30);
		//------------------------

		g.setColor(Color.YELLOW);
		g.fillOval(RXpos, GreenYpos, 55, 55);//extra
		
		
	//--------------

		g.setColor(Color.blue);
		g.fillOval(BlueXpos, BlueYpos, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("8", BlueXpos+20, BlueYpos+30);
		//--------------

		g.setColor(Color.RED);
		g.fillOval(RXpos+20, RYpos, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("2", RXpos+40, RYpos+30);
		//------------------------

		g.setColor(Color.RED);//extra
		g.fillOval(YellowXpos-10,BlueYpos, 55, 55);
		//--------------		
		g.setColor(Color.ORANGE);
		g.fillOval(OXpos+20, OYpos, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("1", OXpos+40, OYpos+30);
		//------------------------

		Color purple = new Color(153,50,204);

		g.setColor(purple);
		g.fillOval(PurpleX, PurpleY, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("6", PurpleX+20, PurpleY+30);
		//------------------------

		g.setColor(purple);
		g.fillOval(OXpos, BlueYpos, 55, 55);//extra
		//------------------------

		Color c1=new Color(65,105,225);
		g.setColor(c1);
		g.fillOval(OXpos-100, BlueYpos+122, 55, 55);//extra
		//--------------
	
		Color pink= new Color(255,20,147);
		g.setColor(pink);
		g.fillOval(PinkX, PinkY, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("7", PinkX+20, PinkY+30);
	//--------------
		g.setColor(Color.WHITE);
		g.fillOval(GreenXpos, PinkY,50,50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("4", GreenXpos+20, PinkY+30);
		//------------------------

		Color aqua = new Color(0,255,255);
		g.setColor(aqua);
		g.fillOval(YellowXpos+70, BlueYpos, 50, 50);
		g.setFont(myFont);
		g.setColor(Color.BLACK);
		g.drawString("9", YellowXpos+90, BlueYpos+30);
		//------------------------

	//extras
		g.setColor(Color.WHITE);
		g.fillOval(OXpos, PinkY+60,50,50);
		
		g.setColor(pink);
		g.fillOval(OXpos, GreenYpos, 50, 50);
		
		g.setColor(purple);
		g.fillOval(PinkX, BlueYpos, 50, 50);
		
		Color c2=new Color(123,104,238);
		g.setColor(c2);
		g.fillOval(GreenXpos, BlueYpos+30, 55, 55);//extra
		//---------------------------------------------
		if(color=='a')
		{
			g.setColor(aqua);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("9", 1216, 95);
		}
		else if(color=='L')
		{
			g.setColor(purple);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("6", 1216, 95);
		}
		else if(color=='b')
		{
			g.setColor(Color.blue);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("8", 1216, 95);
		}
		else if(color=='o')
		{
			g.setColor(Color.orange);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("1", 1216, 95);
		}else if(color=='p')
		{
			g.setColor(pink);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("7", 1216, 95);
		}else if(color=='g')
		{
			g.setColor(Color.GREEN);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("5", 1216, 95);
		}else if(color=='w')
		{
			g.setColor(Color.white);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("4", 1216, 95);
		}else if(color=='r')
		{
			g.setColor(Color.red);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("2", 1216, 95);
		}else if(color=='y')
		{
			g.setColor(Color.yellow);
			g.fillOval(1200, 65, 45, 45);
			g.setColor(Color.black);
			g.drawString("3", 1216, 95);
		}
		else
		{
			Color def=new Color(245,245,245);
			g.setColor(def);
			g.fillOval(1200, 65, 45, 45);
		}
	
		
				}
	
	
	
	public static String operationtype() {
		if(fall.randomNum>=5)//1-4
			randomNum=1;
		
		if(level==1)
		return "Adding Two Balls";
		else if(level==2)
			return" Substraction";
		else if(level==3)
			return" Multiplication";
		else if(level==4){
			return"\t    Division";}
		 
		else if(level==5){
			if(randomNum==5)//1-4
				randomNum=1;
			
			if(randomNum==1){
				return "Adding Two Balls";}
			else if(randomNum==2){
				return"Substraction";}
			else if(randomNum==3){
				return"Multiplication";}
			else	if(randomNum==4)
			{
				return"Division";}
			
			}
		{
			randomNum=1;
		return "";}
	}






	private String msgboard() {
		
			return "Balance The Scale By";
		}
		
	



	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	System.out.println("X="+e.getX()+"Y="+e.getY());
		if(e.getX()>=765&& e.getY()>=400){
			sound.counter.play();

			System.out.println("Basket one");
			Ball4c1=BallValue;
			Operation.counter1(BallValue);
			}
		if((e.getX()>=350&&e.getX()<600)&& e.getY()>=390){
			System.out.println("Basket two");
			Operation.counter2(BallValue);
			sound.counter.play();
		}
		
		if(e.getX()>=30&&e.getX()<=75){
				help=0;
				
		}
		
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//----------------------	

	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyCode()==KeyEvent.VK_B){
			BallValue=8;
			color='b';
			System.out.println("Blue="+BallValue);
		}
		if(e.getKeyCode()==KeyEvent.VK_R){
			BallValue=2;
			color='r';
			System.out.println("Red="+BallValue);

			}
		if(e.getKeyCode()==KeyEvent.VK_Y){
			BallValue=3;
			color='y';

			System.out.println("Yellow="+BallValue);
}
		if(e.getKeyCode()==KeyEvent.VK_G){
			BallValue=5;
			color='g';
			System.out.println("Green="+BallValue);
}
		if(e.getKeyCode()==KeyEvent.VK_O){
			BallValue=1;
			color='o';
			System.out.println("Orange="+BallValue);}
		if(e.getKeyCode()==KeyEvent.VK_P){
			BallValue=7;	
			color='p';
			System.out.println("Pink="+BallValue);}
		if(e.getKeyCode()==KeyEvent.VK_L){
			BallValue=6;
			color='L';
			System.out.println("Lavender="+BallValue);}
		if(e.getKeyCode()==KeyEvent.VK_W){
			BallValue=4;
			color='w';
			System.out.println("White="+BallValue);}
		if(e.getKeyCode()==KeyEvent.VK_A){
			BallValue=9;
			color='a';
			System.out.println("Aqua="+BallValue);}
		
			
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
		
		
	}
	