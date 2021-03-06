/*
 * Course: SE2811-051
 * Winter 2019-2020
 * City - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * Creates City objects
 */
public class City implements Field {
    private String name;

    /**
     * Constructor for a City object with only contains a name property
     * @param name name of city
     */
    public City(String name){
        this.name = name;
    }

    public String getCityName() {
        return name;
    }
}

