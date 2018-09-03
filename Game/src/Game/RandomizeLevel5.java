package Game;

import javax.swing.JOptionPane;
public class RandomizeLevel5 {
	
	static int prev2;
	static int prev;


	public static int counter1(int b) {
		if(frame.randomNum>=5)//1-4
			frame.randomNum=1;
	    System.out.println(frame.randomNum+" in counter 1");
		 // Grab a random integer between [0, 4)
		if(frame.randomNum==prev)
			frame.randomNum++;
		
	    if(frame.randomNum==1){
	    prev=1;
	    frame.op='+';
	    	System.out.println(frame.valueCounter1+b+" and random num="+frame.randomNum);
	    	return fall.valueCounter1+=b;
	    }
	    //-----------------------
	    else if(frame.randomNum==2){
	    	prev=2;	  
	    	frame.op='-';
	    	if(frame.valueCounter1>b){
		    	System.out.println(frame.valueCounter1-b+" and random num="+frame.randomNum);
	    	return frame.valueCounter1=frame.valueCounter1-b;}
	    	else {
		    	System.out.println(b-fall.valueCounter1+" and random num="+frame.randomNum);

	    		return frame.valueCounter1=b-frame.valueCounter1;}
	    }
	    //---------
	    else if(frame.randomNum==3){
	    prev=3;	    	
	    frame.op='*';
	    	if(frame.valueCounter1==0)
	    		frame.valueCounter1+=1;
	    	System.out.println(frame.valueCounter1*b+" and random num="+frame.randomNum);
	    	return frame.valueCounter1*=b;
	    }
	    //---------
	     else{
	    	 frame.op='/';
	    	if(frame.valueCounter1%b==0&&b!=0){
		    	System.out.println(frame.valueCounter1/b+" and random num="+frame.randomNum);
	    	return frame.valueCounter1=frame.valueCounter1/b;
	    	}
	    	
	    	else{
	    		System.out.println("Try again a/b not accepted");
	    		frame.op='0';
	    		return 0;}
	     }
	    //---------

			
	}
	public static int counter2(int b) {
	    System.out.println(frame.randomNum+" in counter 2");

		if(frame.randomNum==prev2)
			frame.randomNum++;
		
		if(frame.randomNum>=5)//1-4
			frame.randomNum=1;
		
	    if(frame.randomNum==1){
	  	prev=1;
	    	System.out.println(frame.valueCounter2+b+" and random num="+frame.randomNum);
	    	return frame.valueCounter2+=b;
	    }	   
	    //---------
	     if(frame.randomNum==2){
	    prev=2;
	    	if(frame.valueCounter2>b){
		    	System.out.println(frame.valueCounter2-b+" and random num="+frame.randomNum);
	    	return frame.valueCounter2=frame.valueCounter2-b;}
	    	else {
		    	System.out.println(b-frame.valueCounter2+" and random num="+frame.randomNum);

	    		return frame.valueCounter2=b-frame.valueCounter2;}
	    }
	    //---------
	     if(frame.randomNum==3){
	    	prev=3;
	    	if(frame.valueCounter2==0)
	    		frame.valueCounter2+=1;
	    	System.out.println(frame.valueCounter2*b+" and random num="+frame.randomNum);
	    	return frame.valueCounter2*=b;
	    }
	    //---------
	     else if(frame.randomNum==4){
	    prev=4;
	    	if((frame.valueCounter2%b==0)&&b!=0){
		    	System.out.println(frame.valueCounter2/b+" and random num="+frame.randomNum);

	    	return frame.valueCounter2=frame.valueCounter2/b;}
	    	else{
	    		frame.op='0';
	    		JOptionPane.showMessageDialog(null, "Try again scale/ball is not accepted");
	    		System.out.println("Try again a/b not accepted");
	    		return 0;}
	     }
	    //---------

	    return 77;
	    
			
	}
}
