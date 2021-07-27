/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sarun
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
