package Moosend.API.Client;

public interface IPagableCollection extends java.util.Collection
{
	int getTotalPageCount();

	long getTotalResults();
	void setTotalResults(long value);

	PagingInfo getPagingInfo();
}
