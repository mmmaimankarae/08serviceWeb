/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellorestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import util.HelloClient;

/**
 *
 * @author sarun
 */
public class HelloRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloClient obj = new HelloClient();
        String xml = obj.getXml("Sarun");
        System.out.println(xml);
        String string = (String) JAXB.unmarshal(new StringReader(xml), String.class);
        System.out.println(string);
    }
    
}
