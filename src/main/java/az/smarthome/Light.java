package az.smarthome;

public class Light extends Device {
    public Light(int id, String name) {
        super(id, name, DeviceType.LIGHT);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Light specific behavior.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Light specific behavior.");
    }
}
