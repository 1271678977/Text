//方法的可变参数
class VarArgsDome
{
	public static void main(String[] args) {
		
		double sum = getsum(0.8,10.0,20.0,30.0,40.0,50.0);
		System.out.println(sum);
		
	}
	static double getsum(double cutoff,double ... arr)
	{
		double sum =0.0;
		for (double price: arr)
		{
			sum+=price;

		}
		return sum*cutoff;
	}
}