package Game;

import javax.swing.JOptionPane;

import Intro.*;

public class Operation  {
	public static int timeUsed;
	static int count=0;
	@SuppressWarnings("deprecation")
	public static void points(){
		if(frame.valueCounter1==frame.valueCounter2){
			
			if(frame.valueCounter1!=0 && frame.valueCounter2!=0){
			if(frame.level==1){
				frame.points+=10;
				if(frame.points<=30)
	    		JOptionPane.showInternalMessageDialog(null, "^_^ Good Job "+frame.name+"!!");
				else
		    		JOptionPane.showMessageDialog(null, "^_^ Well Done "+frame.name+"!!");

			}
			else if(frame.level==2){
				frame.points+=15;
			/*	if(frame.points%2==0)
		    		JOptionPane.showMessageDialog(null, "Good Job "+frame.name+"!!");
					else
			    		JOptionPane.showMessageDialog(null, "^_^ Well Done "+frame.name+"!!");*/

			}
			else if(frame.level==3){
				frame.points+=20;
				/*if(frame.points%2==0)
		    		JOptionPane.showMessageDialog(null, "^_^ Good Job "+frame.name+"!!");
					else
			    		JOptionPane.showMessageDialog(null, "Well Done "+frame.name+"!!");
*/
			}
			else if(frame.level==4){
				frame.points+=25;
		/*		if(frame.points%2==0)
		    		JOptionPane.showMessageDialog(null, "Good Job "+frame.name+"!!");
					else
			    		JOptionPane.showMessageDialog(null, "^_^ Well Done "+frame.name+"!!");*/

			}
			else if(frame.level==5)
				frame.points+=30;
		/*	if(frame.points%2==0)
	    		JOptionPane.showMessageDialog(null, "^_^Good Job "+frame.name+"!!");
				else
		    		JOptionPane.showMessageDialog(null, "Well Done "+frame.name+"!!");*/

			}
		
		//5 times each level
			//level 1 from 0-49
		if(frame.points==50){// level 2 from 50-124
			frame.level=2;count=0;Menu.time=0;
			frame.valueCounter1=10;frame.valueCounter2=1;
			}//as soon ass level++ count for help=0
		else if(frame.points==125){//level 3 from 125-224
			frame.level=3;count=0;Menu.time=0;
			frame.valueCounter1=0;frame.valueCounter2=0;
			}
		else if(frame.points==225){//level 4 from 224-349
			frame.level=4;count=0;Menu.time=0;
			frame.valueCounter1=32;frame.valueCounter2=24;
}
		else if(frame.points==350){
			frame.level=5;count=0;Menu.time=0;
			frame.valueCounter1=0;frame.valueCounter2=0;
}//level 5 from 350-499
		else if(frame.points>=500){
			System.out.println("Game Ended Congratulations");
		//End game message to user to congratulate him
			frame game=new frame();
			game.runGame=false;
			
		}
		}
		
			if((frame.choice1==frame.choice2)&&frame.choice1>0)
			{
				
				frame.randomNum++;
			}
	}
	
	static char level5Operation;
	
	public static void counter1(int Ballvalue){ //enters counter with mouse click on basket1
		frame.choice1++;

		if(frame.level==1){
			frame.valueCounter1+=Ballvalue;
		}
		if(frame.level==2){
			//no negative values
			if(frame.valueCounter1>=Ballvalue)
				frame.valueCounter1=frame.valueCounter1-Ballvalue;
			else
				frame.valueCounter1=Ballvalue-frame.valueCounter1;
		}
		
		if(frame.level==3){
			if(fall.valueCounter1==0)//so it doesn't multiply with zero
				frame.valueCounter1+=1;
			frame.valueCounter1*=Ballvalue;
		}
		if(frame.level==4){		
				if(frame.level==4&&frame.valueCounter1==0){
				int randomNum = 1 + (int)(Math.random() * 20); 

				frame.valueCounter1=randomNum+7;
						System.out.println("For Safety");
					}
					
			
			if(frame.valueCounter1%Ballvalue==0)//we don't want float or inaccurate values
				frame.valueCounter1/=Ballvalue;
			else{
				System.out.println("Try Again");
				frame.op='0';
				
			}
			
			
		}
		
		//randomize level 5 operations
		else if(frame.level==5){
			
			frame.valueCounter1=RandomizeLevel5.counter1(Ballvalue);
			
		}
		
		frame.BallValue=0;
		frame.color='n';
		System.out.println("Counter1="+frame.valueCounter1);
		points();
		if(frame.valueCounter1>200)//automatically clears
			frame.valueCounter1=0;
		}

	public static void deduct(){
		
			if(frame.level==1&&frame.points>0)
			frame.points-=10;
			else if(frame.level==2) //level2 starts from 50
				if(frame.points>=65)
				frame.points-=15;
				else{
					frame.points-=10;frame.level=1;}
			
			else if(frame.level==3)//level3 starts from 125
				if(frame.points>=145)
					frame.points-=20;
					else{
						frame.points-=15;frame.level=2;}
			else
				
				if(frame.level==4)//level4 starts from 250
					if(frame.points>=275)
						frame.points-=25;
						else{
							frame.points-=20;frame.level=3;}
				else
					if(frame.level==5)//level5 starts from 350
						if(frame.points>=380)
							frame.points-=30;
							else{
								frame.points-=25;frame.level=4;}
				
			points();
		System.out.println("Points after deducting= "+frame.points+" level="+frame.level);
		
	}



	public static void counter2(int Ballvalue){//Receives from mouse click
		frame.choice2++;
		if(frame.level==1)
			frame.valueCounter2+=Ballvalue;
	
		if(frame.level==2){
			//no negative values
			if(frame.valueCounter2>=Ballvalue)
				frame.valueCounter2=frame.valueCounter2-Ballvalue;
			else
				frame.valueCounter2=Ballvalue-frame.valueCounter2;
		}
		
		if(frame.level==3){
			if(frame.valueCounter2==0)
				frame.valueCounter2+=1;
			frame.valueCounter2*=Ballvalue;
		}
		if(frame.level==4){
			frame.op=0;	
			
			if(frame.level==4&&frame.valueCounter2==0){
				int randomNum = 1 + (int)(Math.random() * 40); 

				frame.valueCounter2=randomNum+5;
						System.out.println("For Safety");
					}
			
			if(frame.valueCounter2%Ballvalue==0)//we don't want float or inaccurate values
				frame.valueCounter2/=Ballvalue;
			else{
				System.out.println("Try Again");
				frame.op='/';
				
			}
			}
			if(frame.level==5){
			
				
					
				frame.valueCounter2=RandomizeLevel5.counter2(Ballvalue);
					
				
			
		}
			
			frame.BallValue=0;
			frame.color='n';
		System.out.println("Counter2="+frame.valueCounter2);
	points();
		if(frame.valueCounter2>200)//auto clears
			frame.valueCounter2=0;
	
	}

	
	public static void autoAdd(int RandomValue){
		count++;//2 times only each level to auto add up
		if(frame.level==1&&count<=3){
			frame.valueCounter1=50+RandomValue;
			frame.valueCounter2=50+RandomValue;
				System.out.println(count);
				points();
			
		}
		else if((frame.level==2||frame.level==5)&&count<=3){
			frame.valueCounter1=50+RandomValue;
			frame.valueCounter2=50+RandomValue;
				System.out.println(count);
				points();

			
		}
		else if(frame.level==3&&count<=3){
			frame.valueCounter1=50+RandomValue;
			frame.valueCounter2=50+RandomValue;
				System.out.println(count);
				points();

			}
		
		else if(frame.level==4&&count<=3){
			frame.valueCounter1=50+RandomValue;
			frame.valueCounter2=50+RandomValue;
				System.out.println(count);
				points();

			}
		
		else if(frame.level==5&&count<=3){
			frame.valueCounter1=50+RandomValue;
			frame.valueCounter2=50+RandomValue;
				System.out.println(count);
				points();

			
		}
		else{
			System.out.println("Sorry, You can only use this button three times per level");
			
		}
	}


}