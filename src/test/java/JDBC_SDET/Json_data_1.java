package JDBC_SDET;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import Sample_rest.CustomerDetails;

public class Json_data_1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		CustomerDetails a1 = null;
		ArrayList<CustomerDetails> a2 = new ArrayList();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","Tiger@123");
		System.out.println("Connection sucessfull");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where Location = 'Asia';");
		JsonArray ja = new JsonArray();
		while (rs.next())
		{
			a1 = new CustomerDetails();
			a1.setCourseName(rs.getString(1));
			a1.setPurchasedDate(rs.getString(2));
			a1.setAmount(rs.getInt(3));
			a1.setLocation(rs.getString(4));
			a2.add(a1);
		}
		for (int i = 0; i < a2.size(); i++) 
		{
			ObjectMapper obj = new ObjectMapper();
//			obj.writeValue(new File("D:\\Selenium_tanush\\JDBC_CONNECTION\\Dummy"+i+".json"),a2.get(i));
			Gson gs = new Gson();
			String js = gs.toJson(a2.get(i));
			ja.add(js);
		}
		JSONObject a7 = new JSONObject();
		a7.put("data", ja);
		String abb = StringEscapeUtils.unescapeJava(a7.toJSONString());
		System.out.println(abb);
		String at = abb.replace("\"{", "{");
		System.out.println(at);
		String str = at.replace("}\"", "}");
		System.out.println(str);
		FileWriter file = null;
		file = new FileWriter("D:\\\\Selenium_tanush\\\\JDBC_CONNECTION\\\\CustomerDetails1795.json");
        file.write(str);
        file.flush();
        file.close();
		conn.close();
	}
}
