package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double d1, double d2) throws IllegalArgumentException
	{
		if(d2 == 0)
			throw new IllegalArgumentException();
		return d1/d2;
	}
	public String reverseString(String str) throws IllegalStateException
	{
		if(str.length() == 0)
			throw new IllegalStateException();
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
