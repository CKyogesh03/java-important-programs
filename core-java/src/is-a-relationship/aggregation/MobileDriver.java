package aggregation;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1=new Mobile("Oneplus 7T",35_000,8,"blue");
        Sim s1=new Sim("Jio","4G");
        Sim s2=new Sim("Idea","3G");
        Earphone e1=new Earphone("Oneplus Bullet","Bluetooth");

        m1.insertSim1(s1);
        m1.insertSim2(s2);
        m1.connectEarphone(e1);

        m1.removeSim1();
        m1.removeSim2();
        m1.removeEarphone();

        m1.removeSim1();
        m1.removeSim2();
        m1.removeEarphone();

    }
}