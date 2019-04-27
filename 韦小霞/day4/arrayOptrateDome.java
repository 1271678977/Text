class arrayOptrateDome
{
	//获取最大元素
	static int getMax(int[] nums)
	{
		int max=nums[0];
		for (int index=0;index<nums.length ;index++ )
		{
			if (nums[index]>max)
			{
			    max=nums[index];
			}	
	   	}
		return max;
	}
	//获取最小元素
	static int getMin(int[] nums)
	{
		int min=nums[0];
		for (int index=0;index<nums.length ;index++ )
		{
			if (nums[index]<min)
			{
			    min=nums[index];
			}	
	   	}
		return min;
	}

	public static void main(String[] args)
	 {
		int [] nums =new int []{10,-3,5,17,9};

		System.out.println("数组长度为="+nums.length);
		System.out.println("第一个数组为="+nums[0]);
		System.out.println("最后一个数组为="+nums[4]);
		//修改第一个元素为100
		nums[0]=100;
		System.out.println("修改后第一个元素="+nums[0]);
		//数组的遍历
		for (int index =0;index<nums.length ;index++ ) {
			System.out.println(nums[index]);
		}
		//获取数组中最大和最小的元素
		int max =arrayOptrateDome.getMax(nums);
		int min =arrayOptrateDome.getMin(nums);
		System.out.println("最大值="+max);
		System.out.println("最小值="+min);
	
	}
}