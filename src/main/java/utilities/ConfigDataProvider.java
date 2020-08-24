package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;
	public ConfigDataProvider() throws IOException{
		File src=new File("C:\\Users\\Karanpreet\\eclipse-workspace\\Framework\\src\\main\\java\\Config\\config.properties");
		
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
				
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return prop.getProperty(keyToSearch);
	}

}
