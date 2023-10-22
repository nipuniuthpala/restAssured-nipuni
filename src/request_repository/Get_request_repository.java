package request_repository;

import java.io.IOException;

import static common_method.get_data.getdataexcel;

public class Get_request_repository {
	public static String baseURI() throws IOException {
		String baseURI="https://restcountries.com/v3.1/translation/"+ getdataexcel("Sheet1","tc01");
		return baseURI;
	}

	
	public static String Get_tc_1()
	{
		String requestbody="";
		return requestbody;
	}
	

}
