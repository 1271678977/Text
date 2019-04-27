//打印顺序数组【A,B,C,D,E】
//打印逆序数组【E,D,C,B,A]
class arrayOptrateDome2
{
	static void printlnarray (String [] arr)
	{
		String ret="[";
		for (int index=0;index<arr.length ;index++ )
		{
			ret =ret+arr[index];

			
			if (index!=arr.length-1)
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
			
		
		String[] arr={"A","B","C","D","E"};
		arrayOptrateDome2.printlnarray ( arr );
		String[] newarr=arrayOptrateDome2.reverse[oldarr];
		arrayOptrateDome2.printlnarray ( newarr );
	}
}