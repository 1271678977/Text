class ArrayarrayDome
{
	public static void main(String[] args) {
		int [][]arr=new int [][]{
			{1,2,3},
			{4,5},
			{6}
		};
		System.out.println(arr.length);
		for (int i=0;i<arr.length ;i++ ) 
		{
			System.out.println(arr[i]);
			for (int j=0;j<arr[i].length ;j++ ) 
			{
				System.out.println(arr[i][j]);
			}
			
		}

	}
}