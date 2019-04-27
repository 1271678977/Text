 /*
 
  动态初始化：由我们设置数组元素的元素个数（数组长度），而每一个数组元素的初始值有系统决定
                                                                     数组元素类型 [] 数组名称 = new 数组元素类型 [length]
                                                                     int [] ages = new int [100]
*/
 class arraylnitDome2
{
	public static void main(String[] args) {
		int [] nums=new int [3];
		System.out.println(nums.length);
		nums = new int [5];
		System.out.println(nums.length);
	}
}