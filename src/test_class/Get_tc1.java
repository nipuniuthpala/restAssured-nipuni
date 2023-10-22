package test_class;

import common_method.common_method_get_api;
import org.testng.Assert;
import org.testng.annotations.Test;
import request_repository.Get_request_repository;

import java.io.IOException;

public class Get_tc1 {
	
	@Test
	public static void getAPIData() throws IOException
	{
	
		int response_statuscode= 0;
		String baseURI=Get_request_repository.baseURI();
		String requestbody=Get_request_repository.Get_tc_1();
		
		for(int i=0;i<3;i++)
		{
			response_statuscode=common_method_get_api.responsestatuscode_extractor(baseURI,requestbody);
			if(response_statuscode==200)

				System.out.println("correct status code is not found in the iteration " + i);
			  Assert.assertEquals(response_statuscode,200);
			}



	}



}


