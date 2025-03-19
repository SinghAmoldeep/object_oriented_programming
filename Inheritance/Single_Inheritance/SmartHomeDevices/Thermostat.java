
package Inheritance.Single_Inheritance.SmartHomeDevices;

public class Thermostat extends Device{
    String temperatureSetting;

    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
