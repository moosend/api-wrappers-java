package Moosend.API.Client.Models;

public final class ContextAnalyticsNode
{
	private String privateContext;
	public String getContext()
	{
		return privateContext;
	}
	public void setContext(String value)
	{
		privateContext = value;
	}

	private String privateContextName;
	public String getContextName()
	{
		return privateContextName;
	}
	public void setContextName(String value)
	{
		privateContextName = value;
	}

	private int privateTotalCount;
	public int getTotalCount()
	{
		return privateTotalCount;
	}
	public void setTotalCount(int value)
	{
		privateTotalCount = value;
	}

	private int privateUniqueCount;
	public int getUniqueCount()
	{
		return privateUniqueCount;
	}
	public void setUniqueCount(int value)
	{
		privateUniqueCount = value;
	}

	private String privateContextDescription;
	public String getContextDescription()
	{
		return privateContextDescription;
	}
	public void setContextDescription(String value)
	{
		privateContextDescription = value;
	}
}