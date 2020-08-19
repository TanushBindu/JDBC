package JDBC_SDET;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Extract_data 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper a1 = new ObjectMapper();
		Root1 a2 = a1.readValue(new File("D:\\\\Selenium_tanush\\\\JDBC_CONNECTION\\\\CustomerDetails1795.json"), Root1.class);
		List<Data> a3 = a2.getData();
		Data a4 = a3.get(1);
		String s1 = a4.getCourseName();
		System.out.println(s1);
	}
}
