package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.Excelread;

public class DataProviderdeclaration {

@DataProvider
public Object[][] fbtestdata() throws IOException
{
	return Excelread.read("Login");
}

@DataProvider
public Object[][] fbcreateaccount() throws IOException
{
	return Excelread.read("CreateAccount");
}

}
