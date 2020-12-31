package com.InfoCabs.testcases;

import static io.restassured.RestAssured.given;
import java.util.HashMap;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Delete_RegesteredUser_API_Requests_72 {

	HashMap map = new HashMap();

	@BeforeTest
	@Parameters({ "CommID", "Pwd", "PhoneNum"})
	public void postdata(String CommID, String Pwd, String PhoneNum) {
 
		map.put("CompanyId", CommID);
		map.put("Password", Pwd);
		map.put("TelephoneNo", PhoneNum);

		RestAssured.baseURI = "https://stage-cabsnapperwebapi.infocabs.com/api/";
		RestAssured.basePath = "Account/Login";
	}

	@Test(priority = 72)
	public void Delete_RegisteredUser_UsingDelete_API_72()

	{

		Response res = given().contentType("application/json").body(map).when().post();

		JsonPath extractor = res.jsonPath();
		String Token = extractor.getString("Content.Token.access_token[0]");
		System.out.println("Access Token are this " + Token);

		Response resDelete = given().contentType("application/json").header("Authorization", "Bearer " + Token).when()
				.delete("https://stage-cabsnapperwebapi.infocabs.com/api/Account/Delete");
		JsonPath extractor1 = resDelete.jsonPath();
		String Token1 = extractor1.getString("Message");
		System.out.println(Token1);

	}

}
