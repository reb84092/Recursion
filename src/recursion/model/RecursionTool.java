package recursion.model;

public class RecursionTool
{
	public double getFibNumber(double position)
	{
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}

		if (position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}

	public int getFactorialNumber(int position)
	{
		if (position < 0)
		{
			return Integer.MIN_VALUE;
		}

		if (position == 0)
		{
			return 1;
		}
		else
		{
			return position * getFactorialNumber(position - 1);
		}
	}
	
	public int getIterativeNumber(int n)
	{
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < n; i++)
		{
			x = y;
			y = z;
			z = x + y;
			
		}
		return x;
	}
		
}
