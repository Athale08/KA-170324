package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
// this class is created to read the parameters provided in config.properties file
public class ConfigReader {


    private Properties prop; // definition// definition of the Properties class- inbuilt java class used to read the .properties files.

    public Properties getProperties(){

        try{
            // Reading a file
            //initialization of the object
            // loading that file to Properties class object

            FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config/configuration.properties");
            prop = new Properties(); // initilization
            prop.load(input);

        }

        catch(FileNotFoundException e){
            e.printStackTrace();       // this will print the details about the exception
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return prop;

    }


}
