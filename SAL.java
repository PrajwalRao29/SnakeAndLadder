public class SAL {
	public static void main (String args[])
	{	int x=0;
		int count=0;
		System.out.println("Snake and Ladder game played with single player at start position 0");
		while(x!=100)
		{
			count++;
			int i=(int)(Math.random()*6%6)+1;
			System.out.println("The dice rolls "+i);
			int option =(int)(Math.random()*10%3);
			System.out.println("The option is "+option);
			switch(option)
			{
			case 1:System.out.println("LADDDER");
			if(x+i<101)
			{
				x=x+i;
				System.out.println("The new position is "+x);
			}
			break;
			case 2:System.out.println("SNAKE");
			if(x-i>-1)
			{
				x=x-i;
				System.out.println("The new position is "+x);
			}
			else
			{
				x=0;
				System.out.println("The new position is "+x);
			}
			break;
			}
		}
		System.out.println("The number of times the dice was thrown are:"+count);
	}
}