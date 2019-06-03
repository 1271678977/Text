//菲佣类型、描述菲佣对象、包括菲佣的状态和方程
class Servant 
{
	String name;
	int age;
	void shopping ()
	{
		System.out.println("买菜");
	}
	void cook()
	{
		System.out.println("煮饭");
	}
	void wash()
	{
		System.out.println("洗碗");
	}
}fi
public class ServantDome
{
	public static void main(String[] args) 
	{
		//创建一个菲佣对象
		Servant s1 = new Servant();
		s1.name ="晓丽";
		s1.age=18;

		//创建里一个菲佣对象
		Servant s2=new Servant();
		s2.name ="lily";
		s2.age=20;
		//创建另一个菲佣对象
		Servant s3 =new Servant();
		s2.name ="Lucy";
		s2.age=20;
	}


}
