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
}
