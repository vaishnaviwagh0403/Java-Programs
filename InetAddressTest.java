		//Factory Methods

import java.net.*;

class InetAddressTest
{
	public static void main(String []at)throws UnknownHostException
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address);

		 address=InetAddress.getByName("Dell");
		System.out.println(address);

		InetAddress []addresses=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<addresses.length;i++)
		{
			System.out.println(addresses[i]);
		}
	}
}