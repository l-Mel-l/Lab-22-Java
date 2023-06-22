interface PhoneCharger {
    void chargePhone();
}
public class Main {
    public static void main(String[] args) {
        Naprezh380 naprezh380 = new Naprezh380();
        Charger220 charger220 = new Charger220();
        PhoneCharger phoneCharger = new Adapter(charger220, naprezh380);
        phoneCharger.chargePhone();
    }
}
class Naprezh380 {
    public void Naprezh() {
        System.out.println("Напряжение питания: 380В");
    }
}
class Charger220 {
    public void charge() {
        System.out.println("Зарядка телефона: 220В");
    }
}
class Adapter implements PhoneCharger {
    private Charger220 charger220;
    private Naprezh380 naprezh380;

    public Adapter(Charger220 charger220, Naprezh380 naprezh380) {
        this.charger220 = charger220;
        this.naprezh380 = naprezh380;
    }

    @Override
    public void chargePhone() {
        naprezh380.Naprezh();
        charger220.charge();
    }
}