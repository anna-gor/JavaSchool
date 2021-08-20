package labRadioAlarm;

public class RadioAlarm implements Radio, Alarm {
    @Override
    public void A() {
        System.out.println("Method a");
    }

    @Override
    public void B() {
        System.out.println("Method b");
    }

    @Override
    public void C() {
        System.out.println("Method c");
    }

    @Override
    public void D() {
        System.out.println("Method d");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.A();
        radioAlarm.B();
        radioAlarm.C();
        radioAlarm.D();
    }
}
