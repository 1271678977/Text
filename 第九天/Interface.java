interface IUSB
{
	void swapData();
}

//鼠标usb
class Mouse implements IUSB
{
	public void swapData(){
		System.out.println("鼠标在移动");
	}
}

//打印机usb
class Print implements IUSB
{
	public void swapData(){
		System.out.println("打印机在打印");
	}
}

class MotherBorad
{
	private static IUSB[] usbs = new IUSB[6];
	private static  int index = 0;

	public static void pluginIn(IUSB usb)
	{
		if(index == usbs.length)
		{
			System.out.println("usb插槽已满");
			return;
		}
		usbs[index]=usb;
		index++;
	}

	public static void doWork()
	{
		for (IUSB usb : usbs)
		{
			if(usb!=null)
			{
				usb.swapData();
			}
		}
	}
}


class Interface
{
	public static void main(String[] args){
		MotherBorad.pluginIn(new Mouse());
		MotherBorad.pluginIn(new Print());
		MotherBorad.doWork();

		
	}
}