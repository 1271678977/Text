/*数组初始化两种方法：
   静态初始化：有我们自己为每一个数组设置初始化值，而长度由系统决定  、、数组元素类型[] 数组名
                                                                     int [] nums = new int [] {元素一，元素二。。。。}
                                                                     int [] nums ={}
   动态初始化：由我们设置数组元素的元素个数（数组长度），而每一个数组元素的初始值有系统决定
                                                                     数组元素类型 [] 数组名称 = new 数组元素类型 [length]
                                                                     int [] ages= new int [100]
*/
class arraylnitDome
{
	public static void main(String[] args) {
		int [] nums =new int []{1,3,5,7,9};
		System.out.println(nums.length);
		nums=new int[] {2,4,8};
		System.out.println(nums.length);
	}
}
//int []={}
