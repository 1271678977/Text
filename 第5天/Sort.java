class Sort
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{-6,2,5,4,-2};
		String ret = java.util.Arrays.toString(arr);
		System.out.println(ret);
		
		 select(arr);
		 System.out.println("---------------------");
	     ret = java.util.Arrays.toString(arr);
		System.out.println(ret);


	}

	static void bubble(int[] arr) //ð������
	{
		for(int time=1; time<=arr.length -1;time++)
		{
			for(int i=1; i<=arr.length-time;i++)
			{
				if(arr[i-1]>arr[i])
				{
					swap(arr,i-1,i);
				}
			}
		}                                                
	}

	static void select(int[] arr)
	{
		for(int time = 1; time<arr.length;time++)
		{
			for(int i=time; i<arr.length;i++)
			{
				if(arr[time-1]>arr[i])
				{
					swap(arr,time-1,i);
				}
			}
		}
	}

	static void swap(int[] arr, int src, int dest)
	{
		int temp;
		temp = arr[dest];
		arr[dest] = arr[src];
		arr[src]=temp;
	}
/*
	static void pringArray(String[] arr)
	{
		if(arr = null)
		{
			System.out.println("null");
			return;
		}
		String ret = "[";
		for(int index=0; index<arr.length-1;index++)
		{
			ret=ret+arr[index];
			if(index!= arr.length-1)
			{
				ret= ret + ".";
			}
		}
		ret= ret+ "]";
		System.out.println(ret);
	}*/
}
