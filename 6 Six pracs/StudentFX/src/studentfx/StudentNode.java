/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentfx;

/**
 *
 * @author student
 */
public class StudentNode {
    int prn;
    String name;
    String city;
    
    public void setPrn(int prn) {
        this.prn = prn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
