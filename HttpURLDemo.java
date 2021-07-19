import java.net.*;

class HttpURLDemo
{
	public static void main(String []at)throws Exception
	{
		URL url=new URL("http://www.google.com:80//index.html");
		HttpURLConnection htp=(HttpURLConnection)url.openConnection();

		//Request Method
		System.out.println("Request Method:="+htp.getRequestMethod());

		//Response Code Method
		System.out.println("Response code:="+htp.getResponseCode());

		//Response Message Method
		System.out.println("Response code:="+htp.getResponseMessage());


	}
}