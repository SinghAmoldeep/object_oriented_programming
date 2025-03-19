
package Inheritance.Single_Inheritance.SmartHomeDevices;

public class Main {
    public static void main(String[] args) {
        Device thermostat = new Thermostat(1, "Active", "Normal");

        thermostat.displayStatus();
    }
}
