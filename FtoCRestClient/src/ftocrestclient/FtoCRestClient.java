/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ftocrestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.ConversionClient;

/**
 *
 * @author sarun
 */
public class FtoCRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversionClient client = new ConversionClient();
        String xml = client.getXml("32");
        System.out.println(xml);
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println(res.getCelsius());
    }
    
}
