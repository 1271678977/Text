//数组的拷贝 
class ArrayCopeDome
{
	public static void main(String[] args) {
		int []src=new int []{1,2,3,4,5,6,7,8,9,10};
		int []dest =new int [10];
		printArray(dest);//{0,0,0,0,0,0,0,0,0,0}
		copy(src ,2,dest,5,4);
		printArray(dest);//{0,0,0,0,0,3,4,5,6,0}

	}
	/*
	src :源数组
	srcpos：从原数组的哪一个索引位置开始拷贝
	dest：目标数组
	despos:在目标索引的哪一个位置开始粘贴
	length：拷贝元素个数
	 */
	static void copy (int []src ,int srcpos,int []dest ,int destpos ,int length )
	{
		//拷贝3
		/*
		dest [destpos]=src[srcpos];
        System.out.println(src[srcpos]);
        */
       for (int index=srcpos; index<srcpos+length;index++ ) {
       	dest [destpos]=src[index];
       	destpos++;
       	
       }
	}





	static void printArray(int []arr)
	{
		if (arr==null)
		{
			System.out.println("null");
			return;
		}
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