package day3;

public class DataTypeConversion {
	public static void main(String[] args)

	{
		int i = 1500;

		//automatic type conversion
		long l = i;
		//automatic type conversion
		float f = l;

		System.out.println("Int:"+i);

		System.out.println("Long:"+l);

		System.out.println("Float:"+f);
		
		double d = 1500.06;

		//explicit type conversion

		l = (long)d;

		//explicit type conversion

		i = (int)l;

		System.out.println("Double value: "+d);

		//fractional part lost

		System.out.println("Long value:"+l);

		//fractional part lost

		System.out.println("Int value:"+i);

	}
}
