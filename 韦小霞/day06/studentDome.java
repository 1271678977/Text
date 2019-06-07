//学生(student)有两个字段：name（名字）和sfree(是否交学费的状态)，有一个方法：交学费，每个学生都是通过Student类new出一个对象，
//现在创立一个数组存放多个数据对象，在判断数组中的学生是否已经缴费，如果没有就调用学生的缴费方法



class Student
{
	String name ;
	boolean isFree=false; 

}

class studentDome
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name="赵一";
		s1.isFree=true;

		Student s2 = new Student();
		s2.name="倩儿";
		s2.isFree=true;

		Student s3 = new Student();
		s3.name="孙三";
		s3.isFree=false;

		Student s4 = new Student();
		s4.name="李四";
		s4.isFree=true;


		//创建一个数组，用于储存所有学生对象
		Student[] arr =new Student[]{s1,s2,s3,s4};
		//使用循环迭代数组中的每一个元素
		for (Student ele:arr ) 
		{
			System.out.println(ele.name+","+ele.isFree);
			
		}


	}
}