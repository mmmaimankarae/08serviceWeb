package ftocrestclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.ConversionClient;

public class FtoCRestClient {
    public static void main(String[] args) {
        ConversionClient client = new ConversionClient();
        String xml = client.getXml("32");
        System.out.println(xml);
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println(res.getCelsius());
    }
}
