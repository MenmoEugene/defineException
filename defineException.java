class minusException extends Exception
{
	minusException(String msg)
	{
		super(msg);
	}
}

class Dam
{
	int div(int a,int b)throws minusException
	{
		if(b<=0)
			throw new minusException("����������");
		return a*b;
	}
}
class defineException 
{
	public static void main(String[] args) 
	{
		Dam d = new Dam();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (minusException e)
		{
			System.out.println(e.toString());
			System.out.println("�������ַ�����");
		}
		System.out.println("end");
	}
}
