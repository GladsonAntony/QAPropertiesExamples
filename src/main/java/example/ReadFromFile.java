/**
 * @Author Gladson Antony
 * @Date 27-Aug-2017 
 * @Time 8:25:06 PM
 */
package example;

import org.testng.annotations.Test;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.File("./src/main/resources/Test2.properties")
public class ReadFromFile 
{
	public ReadFromFile()
	{
		PropertyLoader.newInstance().populate(this);
	}

	@Property("FirstName")
	public String First_Name;

	@Property("MiddleName")
	public String Middle_Name;

	@Property("LastName")
	public String Last_Name;

	public String getFirst_Name() 
	{
		return First_Name;
	}

	public String getMiddle_Name() 
	{
		return Middle_Name;
	}

	public String getLast_Name() 
	{
		return Last_Name;
	}

	@Test
	public void readPropertiesTest2()
	{
		System.out.println(getFirst_Name());
		System.out.println(getMiddle_Name());
		System.out.println(getLast_Name());
	}
}
