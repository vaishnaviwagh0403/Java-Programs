import java.net.*;

class InetAddressInstanceTest
{
	public static void main(String []at)throws UnknownHostException
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address);

		byte []adr=address.getAddress();
		for(int i=0;i<adr.length;i++)
		{
			System.out.println("Byte address:="+adr[i]);	
		}

		String adrAdr=address.getHostAddress();//IP Address
		System.out.println(adrAdr);	
		
		String adrName=address.getHostName();
		System.out.println(adrName);

		boolean status=address.isMulticastAddress();
		System.out.println(status);			
	}
}