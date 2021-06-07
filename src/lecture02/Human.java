package lecture02;

class Human {
    String name;
    int age;

    Human(String xxx, int yyy) {
        this.name = xxx;
        this.age = yyy;
        print();
    }
    void print() {
        if (this.age < 19) {
            System.out.println("生徒 : " + this.name + "  " + this.age + "歳です");
        } else if (this.age < 23) {
            System.out.println("学生 : " + this.name + "  " + this.age + "歳です");
        }
    }

}