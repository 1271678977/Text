class whileDome   
{
	 public static void main (String[] args) {
	 	{
	 		/*
	 		语法格式：
	 		while（boolean表达式）
	 		{
	 		    如果boolea表达式为turn,就执行循环体
	 		}

	 		 
	 		 */
	 		int count =0;
	 		while (count < 5)
	 		{
	 			//System.out.println("帅哥");
	 			count++;
	 		}
	 		  //案例二，从一数到二十，打印从1~20
           
            int num = 1;
            while ( num <20)
            {
         	      //System.out.println(num);
         	       num++;
            }
            //计算一百以内的正整数
            int number =1;
            int result=0;
            while (number<=100)
            {
            	result=result+number;
            
            	number++;
	           
            }
            System.out.println(result);
	 	}

	 	
} 
	 	
}
  