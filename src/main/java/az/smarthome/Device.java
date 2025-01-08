package az.smarthome;

public abstract class Device {
    private int id;
    private String name;
    private boolean status;
    private DeviceType deviceType;

    public Device(int id, String name, DeviceType deviceType) {
        this.id = id;
        this.name = name;
        this.deviceType = deviceType;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println(name + "turned on.");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + "turned off.");
    }

    public boolean getStatus(){
        return status;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}