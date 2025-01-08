package az.smarthome;
import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Manageable{
    private List<User> users;
    private List<Device> devices;


    public SmartHome(){
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }

    @Override
    public void addDevice(Device device){
        devices.add(device);
    }

    @Override
    public void removeDevice(Device device){
        devices.remove(device);
    }

    public Device getDeviceStatus(int id){
        for (Device device : devices){
            if (device.getStatus()){
                System.out.println(device.getName() + " is on.");
            }
        }
        return null;
    }

}