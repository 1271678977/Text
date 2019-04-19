class  Graph
{
	public static void main(String[] args){
		System.out.println(new Circle(10).getArea());
		System.out.println(new juxing(10,20).getArea());
	}
}

abstract class superGraph
{
    abstract public Double getArea();
}


class Circle extends superGraph
{
	private Integer r;
	
	Circle(Integer r)
	{
		this.r=r;

	}

	public Double getArea(){
		return 3.14 * r * r;
	}
}

class juxing extends superGraph
{
	private Integer wight;
	private Integer height;
	juxing(Integer w, Integer h){
		this.wight = w;
		this.height = h;
	}

	public Double getArea(){
		return wight.doubleValue()*height.doubleValue();
	}
}