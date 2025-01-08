package az.smarthome;

public class Camera extends Device {
    public Camera(int id, String name) {
        super(id, name, DeviceType.CAMERA);
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
    public void startRecording() {
        super.turnOff();
        System.out.println("Camera start to record");
    }
    public void stopRecording() {
        super.turnOff();
        System.out.println("Camera stop to record");
    }

}
