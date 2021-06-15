package lecture03;

class Vegetable {

    String name;
    int value;
    Vegetable(String abc,int xyz){
        name=abc;
        value=xyz;
    }

    void print(){
        System.out.println(name+"は"+value+"円");
    }
}
