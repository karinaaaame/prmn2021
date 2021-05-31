package lecture02;

class Car {
    int fuel;
    Tire[] tires = new Tire[4];
    Engine engine;

    Car(Tire a[],Engine b){
        this.fuel=0;
        for(int i=0;i<4;i++) {
            this.tires[i] = a[i];
        }
        this.engine = b;
    }
    void run(){
        if(this.fuel<=0) {
            System.out.println("走れませんでした");
        }else {
            System.out.println("燃料を１消費して走りました");
            fuel--;
        }
    }

    void startEngine(){
        engine.start();
    }


    }


class GasStation{

    void refuel(Car car){
        car.fuel+=20;
        System.out.println("給油しました(+20)");
    }
}

class Tire{
    int size;
    Tire(int x){
        this.size = x;
    }
}

class Engine {
    int rpm;
    Engine(int y){
        this.rpm = y;
    }
    void start(){
        System.out.println(rpm+"でエンジンを始動させました");
    }
}

public class Exercise2_2 {
    public static void main(String[] args) {

        Tire[] aa = {new Tire(65),new Tire(65),new Tire(65),new Tire(65)};
        Engine bb = new Engine(4000);
        Car a = new Car(aa,bb);
        GasStation b = new GasStation();
        b.refuel(a);
        a.startEngine();
        a.run();

    }
}
