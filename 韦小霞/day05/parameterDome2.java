//方法参数的值传递机制值引用数据类型
class parameterDome2
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{10,99};
		printlnarray(arr);
        swap(arr);
        printlnarray(arr);
		
	}
	static void swap(int [] arr)
	{
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}
	static void printlnarray (int [] arr)
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
	
	


}
		
