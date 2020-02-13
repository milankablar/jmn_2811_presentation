/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Vehicle - Final Presentation
 * Name: Nathan DuPont
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * Vehicle purpose:
 *
 * @author dupontn
 * @version created on 2/12/2020 at 2:20 PM
 */
public class Vehicle {
    private String model;
    private String year;

    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}