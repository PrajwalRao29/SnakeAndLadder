
public class SAL {
	public static void main (String args[])
	{	int x=0,y=0;
	int count=1;
	while(x!=100 && y!=100)
	{
		if(count%2!=0)
		{
			System.out.println("PLAYER 1 turn");
			count++;
			int i=(int)(Math.random()*6%6)+1;
			System.out.println("The dice rolls "+i);
			int option =(int)(Math.random()*10%3);
			System.out.println("The option is "+option);
			switch(option)
			{
			case 1:
			{
				System.out.println("LADDDER");
			if(x+i<101)
			{
				x=x+i;
				System.out.println("The new position for PLAYER 1 is "+x);
				count--;
			}
			break;
			}
			case 2:
			{
				System.out.println("SNAKE");
			if(x-i>-1)
			{
				x=x-i;
				System.out.println("The new position for PLAYER 1 is "+x);
			}
			else
			{
				x=0;
				System.out.println("The new position for PLAYER 1 is "+x);
			}
			break;
			}
			default: System.out.println("No Movement");
			}
		}
		else
		{  
			System.out.println("PLAYER 2 turn");
			count++;
			int i=(int)(Math.random()*6%6)+1;
			System.out.println("The dice rolls "+i);
			int option =(int)(Math.random()*10%3);
			System.out.println("The option is "+option);
			switch(option)
			{
			case 1:
			{
				System.out.println("LADDDER");
			if(y+i<101)
			{
				y=y+i;
				System.out.println("The new position for PLAYER 2 is "+y);
				count--;
			}
			break;
			}
			case 2:
			{
				System.out.println("SNAKE");
			if(y-i>-1)
			{
				y=y-i;
				System.out.println("The new position for PLAYER 2 is "+y);
			}
			else
			{
				y=0;
				System.out.println("The new position for PLAYER 2 is "+y);
			}
			break;
			}
			default: System.out.println("No Movement");
			}
		}	
	}
	System.out.println("The winner of the game is PLAYER "+(count%2+1));
	}
}