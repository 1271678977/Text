class doWhileDome
{
	 public static void main(String[] args) {
	 //案例一：	打印5次帅哥
	 int count =0;
	 do
	 {
	 	//System.out.println("帅哥");
	 	count ++;
	 }while (count <5);
	 //案例二：  打印1~20
	 int num=1;
	 do 
	 {
	 	 //System.out.println(num);
	 	num ++;
  

	 }while (num<20);
	
	 
	 //案例三：  计算一百以内的正整数
	 int number =1;
	 int result =0;
	 do 
	 {
	 	result=result+number;
	 	number++;
	 }while (number <=100);
	 System.out.println(result);
	 }
	
}