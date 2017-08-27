# JAVA - Read from Propertes File

This project provides examples on using QATools Properties Library

[Github - QATools Properties](https://github.com/qatools/properties)
___
### Available Options:

* `@Resource.Classpath` - Finds properties file from the projects classpath.
* `@Resource.File` - Used to read properties file from the specified location.

___
### Usage - POM.xml

```xml
<properties>
	<properties.version>2.0.RC6</properties.version>
</properties>

<!-- QATools Java Properties Dependency -->
<dependency>
	<groupId>ru.qatools.commons</groupId>
	<artifactId>properties</artifactId>
	<version>${properties.version}</version>
</dependency>
```

### Usage - Populating the values.

```java
public ReadFromClasspath() //Constructor
{
	PropertyLoader.newInstance().populate(this);
}
```

### Usage - Reading the Values from Properties File
```java
@Property("FirstName")
public String First_Name;

@Property("LastName")
public String Last_Name;
```

___
### IMPORTS - Add to Eclipse Favorites

```java
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;
```

