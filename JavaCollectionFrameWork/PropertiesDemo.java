package JavaCollectionFrameWork;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        // Properties is a subclass of Hashtable
        // it is used to maintain a list of values in which the key is a string and the value is also a string
        // it can be used to store and retrieve string type data from the properties file
        // Properties class can specify other properties list as it's the default
        // if a particular key property is not present in the original Properties list, the default properties will be searched
        // Properties object does not require external synchronization and Multiple threads can share a single Properties object
        // it can be used to retrieve the properties of the system

        // advantage of a Properties file:
        //      in the event that any data is changed from the properties record, you don't have to recompile the java class
        //      it is utilized to store data that is to be changed habitually
        // NOTE -- the Properties class does not inherit the concept of a load factor from its superclass, Hashtable


        Properties p = new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Window10");
        p.setProperty("Model", "Latitude");


        //System.out.println(p);
    }
}
