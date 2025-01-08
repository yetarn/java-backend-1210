package az.smarthome;

public class Main {public static void main(String[] args) {
    User user1 = new User("Yetər", "Nəbiyeva","yn@gmail.com", "yetar123");
    User user2 = new User("Vüsal", "Ataşov", "va@gmail.com","vusal123");

    user1.register();
    user1.login();


    SmartHome home = new SmartHome();
    home.addUser(user1);
    home.addUser(user2);

    Light light = new Light(1,"İşıq");
    Thermostat thermostat = new Thermostat(2,"Termostat");
    Camera camera = new Camera(3,"Kamera");
    Doorbell doorbell = new Doorbell(4, "Zəng");

    light.turnOn();
    thermostat.setTemperature(23);
    camera.startRecording();
    doorbell.ring();
}
}
