package opeltest.utilities;

import yahoo.utilities.ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OpelConfigReader {

    private static Properties properties;

    static{
        String path = "configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
