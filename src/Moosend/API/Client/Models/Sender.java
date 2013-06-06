package Moosend.API.Client.Models;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] public class Sender
public class Sender implements java.io.Serializable
{

//ORIGINAL LINE: [DataMember] public virtual Guid ID {get;internal set;}
	private java.util.UUID privateID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getID()
	{
		return privateID;
	}
	public void setID(java.util.UUID value)
	{
		privateID = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String Name {get;internal set;}
	private String privateName;
	public String getName()
	{
		return privateName;
	}
	public void setName(String value)
	{
		privateName = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String Email {get;internal set;}
	private String privateEmail;
	public String getEmail()
	{
		return privateEmail;
	}
	public void setEmail(String value)
	{
		privateEmail = value;
	}

//ORIGINAL LINE: [DataMember] public virtual DateTime CreatedOn {get;internal set;}
	private java.util.Date privateCreatedOn = new java.util.Date(0);
	public java.util.Date getCreatedOn()
	{
		return privateCreatedOn;
	}
	public void setCreatedOn(java.util.Date value)
	{
		privateCreatedOn = value;
	}

//ORIGINAL LINE: [DataMember] public virtual Boolean IsEnabled {get;internal set;}
	private boolean privateIsEnabled;
	public boolean getIsEnabled()
	{
		return privateIsEnabled;
	}
	public void setIsEnabled(boolean value)
	{
		privateIsEnabled = value;
	}

	public String getDisplay()
	{
		if (DotNetToJavaStringHelper.isNullOrEmpty(getName()))
		{
			return getEmail();
		}
		return String.format("%1$s (%2$s)", getName(), getEmail());
	}
}
