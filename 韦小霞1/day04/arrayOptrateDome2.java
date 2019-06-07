//打印顺序数组【A,B,C,D,E】
//打印逆序数组【E,D,C,B,A]
class arrayOptrateDome2
{
	static void printlnarray (String [] oldarr)
	{
		String ret="[";
		for (int index=0;index<oldarr.length ;index++ )
		{
			ret =ret+oldarr[index];

			
			if (index!=oldarr.length-1)
			{
				ret=ret+",";
			}
		}
		ret=ret+"]";
		System.out.println(ret);
	}
	static String[] reverse(String[] oldarr)
	{
		String[] newarr=new String[oldarr.length];
		for (int index=oldarr.length;index>=0 ;index-- ) 
		{
			newarr[oldarr.length-1-index]=oldarr[index];
			System.out.println(index);

			
		}
		return newarr;
	}




		public static void main(String[] args)
		 {
			
		
		String[] oldarr={"A","B","C","D","E"};
		arrayOptrateDome2.printlnarray ( oldarr );
		
		String[] newarr=arrayOptrateDome2.reverse(oldarr);
		arrayOptrateDome2.printlnarray ( newarr );
	}
}