package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* จะได้XML ที่สร้างเอง
 * <result>
 *   <celsius> 32.5 </celsius>
 * </result
 */
@XmlRootElement
public class Result {
    private double celsius;
    public double getCelsius() {
        return celsius;
    }
    @XmlElement
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
