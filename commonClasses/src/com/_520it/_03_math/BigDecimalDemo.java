package com._520it._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		//使用double不精确
		System.out.println("0.09 + 0.01="+(0.09+0.01));

		//使用BigDecimal:BigDecimal(double val);
		BigDecimal num1 = new BigDecimal(0.09);
		BigDecimal num2 = new BigDecimal(0.01);
		System.out.println("0.09 + 0.01="+(num1.add(num2)));
		 
		//使用BigDecimal:BigDecimal(String val);
		num1 = new BigDecimal("0.09");
		num2 = new BigDecimal("0.01");
		System.out.println("0.09 + 0.01="+(num1.add(num2)));
	}

}
