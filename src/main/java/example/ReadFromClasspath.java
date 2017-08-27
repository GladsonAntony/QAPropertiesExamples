/**
 * @Author Gladson Antony
 * @Date 27-Aug-2017 
 * @Time 8:07:04 PM
 */
package example;

import org.testng.annotations.Test;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;


@Resource.Classpath("Test1.properties")
public class ReadFromClasspath 
{	

	public ReadFromClasspath()
	{
		PropertyLoader.newInstance().populate(this);
	}

	@Property("FirstName")
	public String First_Name;

	@Property("LastName")
	public String Last_Name;


	public String getFirst_Name() 
	{
		return First_Name;
	}

	public String getLast_Name() 
	{
		return Last_Name;
	}


	@Test
	public void readPropertiesTest1()
	{
		System.out.println(getFirst_Name());
		System.out.println(getLast_Name());
	}

}
