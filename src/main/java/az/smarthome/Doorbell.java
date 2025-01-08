package az.smarthome;

public class Doorbell extends Device{

    public Doorbell(int id,String name) {
        super(id, name, DeviceType.DOORBELL);
    }

    @Override
    public void turnOn(){
        super.turnOn();
    }

    @Override
    public void turnOff(){
        super.turnOff();
    }

    public void ring(){
        System.out.println("Doorbell is ringing.");
    }
}