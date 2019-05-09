
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            String refrehTime = property.getProperty("t.refresh");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");

            System.out.println("Log: " + login
                    + ", Pas: " + password
                    + ", Time Update: " + refrehTime);

        } catch (IOException e) {
            System.err.println("Error: file config.properties absent");
        }


        FileInputStream runM;
        Properties propertyM = new Properties();

        try {
            runM = new FileInputStream("src/main/resources/runMail.properties");
            propertyM.load(runM);

            String refrehTime = propertyM.getProperty("t.refresh");
            String list = propertyM.getProperty("list.mail");
            String pop = propertyM.getProperty("pop.mail");

            System.out.println("listMail: " + list
                    + ", SMTP: " + pop);

        } catch (IOException e) {
            System.err.println("Error: file runMail.properties absent");
        }
        RWFile rwFile= new RWFile("C:\\\\Intel\\\\Logs");

        rwFile.paramPath();
        rwFile.creatFolder();
    }
}
