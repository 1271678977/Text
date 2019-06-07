class Person
{	
	Person(String n)
	{
		System.out.println(n);
	}
}
//演示自定义构造
class PersonDemo
{
	public static void main(String[] args) {
		//创造对象：其实是在调用构造器
		new Person("Will");
		
	}
}