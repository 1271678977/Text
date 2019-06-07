//方法参数的值传递机制值基本数据类型
class parameterDome
{
	public static void main(String[] args)
	 {
		{
			int x =10;
			System.out.println("main 方法使用前，x="+x);
			change(x);
			System.out.println("main 方法使用后，x="+x);
		}
	}
		static void change(int x) 
		{
			System.out.println("change方法之前"+x);
			x=50;
			System.out.println("change方法之后"+x);


		}
	}

