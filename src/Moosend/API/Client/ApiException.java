package Moosend.API.Client;

public class ApiException extends RuntimeException
{
	public ApiException(String message)
	{
		super(message);
	}
}