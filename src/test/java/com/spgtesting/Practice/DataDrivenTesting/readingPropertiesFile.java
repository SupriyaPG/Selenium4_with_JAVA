package com.spgtesting.Practice.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class readingPropertiesFile {
    public static void main(String[] args) throws IOException {

        //location of properties file
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\config.properties");

        //loading properties file
        Properties propertiesObj=new Properties();
        propertiesObj.load(file);

        //reading properties from properties file
        String url=propertiesObj.getProperty("appurl");
        String email=propertiesObj.getProperty("email");
        String password=propertiesObj.getProperty("password");
        String orderid=propertiesObj.getProperty("orderid");
        String customerid=propertiesObj.getProperty("customerid");

        System.out.println(url+"\n"+email+"\n"+password+"\n"+orderid+"\n"+customerid);

        //Reading all the keys from properties file
        Set<String> keys=propertiesObj.stringPropertyNames();
        System.out.println(keys);

        Set<Object> keys1=propertiesObj.keySet();
        System.out.println(keys1);

        //Reading values from properties file
        Collection<Object> values=propertiesObj.values();
        System.out.println(values);

    }
}
