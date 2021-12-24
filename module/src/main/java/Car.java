public class Car {
    int HP;
    String Att;
    String MP;
    //int price;
    double price;


    void setCar(int hp) {
        this HP = hp;
    }
    void setCar(String Att, String MP) {
        this.Att = Att;
        this.MP = MP;
    }


    void setCar(double price) {
//      //will alert error
    }

    void showMyCar() {
        System.out.println("My Archer HP is " + this.HP);
        System.out.println("My Archer Att is " + this.Att);
        System.out.println("My Archer MP is " + this.MP);
        System.out.println("My Archer price is " + this.);
    }
}
