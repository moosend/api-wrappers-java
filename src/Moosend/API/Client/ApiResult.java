package Moosend.API.Client;

public class ApiResult<T>
{
	private int privateCode;
	public final int getCode()
	{
		return privateCode;
	}
	public final void setCode(int value)
	{
		privateCode = value;
	}

	private T privateContext;
	public final T getContext()
	{
		return privateContext;
	}
	public final void setContext(T value)
	{
		privateContext = value;
	}

	private String privateError;
	public final String getError()
	{
		return privateError;
	}
	public final void setError(String value)
	{
		privateError = value;
	}
}