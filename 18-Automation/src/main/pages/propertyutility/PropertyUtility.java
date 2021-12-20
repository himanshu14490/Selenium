package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

import baselibrary.Baselibrary;

public class PropertyUtility extends Baselibrary{
	
	static String path ="D:\\18-Automation\\Testdata.properties";
	public static String getreadproperty(String key)
	
	{
		String value="";
		try
		{
			
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value= prop.getProperty(key);
			
		} catch (Exception e) 
		{
			System.out.println("issue in getperoperty"+ e);
		}
		return value;
	}

}
