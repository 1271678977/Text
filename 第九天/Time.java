class Time 
{
	public static void main(String[] args) 
	{
		System.out.println(new Stringtime().getTotalTime());
	}
}


abstract class Abstracttime
{
	final public long getTotalTime(){
		long begin = System.currentTimeMillis();
		this.doWork();
		long end = System.currentTimeMillis();
		long time = end- begin;
		return time;
	}

   protected abstract void doWork();

}


class Stringtime extends Abstracttime
{
	protected void doWork(){
		String str="";
		for(int i=0; i<10000;i++)
		{
			str +=i;
		}
	}
}