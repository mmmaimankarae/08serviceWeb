package hellorestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import util.HelloClient;

public class HelloRestClient {
    public static void main(String[] args) {
        /* XML File */
        HelloClient obj = new HelloClient();
        String xml = obj.getXml("Mine");
        System.out.println(xml);
        
        /* แปลง XML ให้กลายเป็นผลลัพธ์ */
        String string = (String) JAXB.unmarshal(new StringReader(xml), String.class);
        System.out.println(string);
    }
}
