package az.smarthome;

public class Thermostat extends Device{
    public Thermostat(int id, String name){
        super(id, name, DeviceType.THERMOSTAT);
    }

    @Override
    public void turnOn(){
        super.turnOn();
    }

    @Override
    public void turnOff(){
        super.turnOff();
    }

    public void setTemperature(int temperature){
        System.out.println("Temperature is set to " + temperature);
    }
}