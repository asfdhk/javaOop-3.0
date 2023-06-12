public class MyClass {

    private int number;
    private int num;

    public MyClass(int number,int num){
        this.number = number;
        this.num = num;
    }
    public MyClass(){

    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", num=" + num +
                '}';
    }

    public MyClass create(MyClass myClass){
        MyClass a = new MyClass();
        a.setNumber(getNumber()+myClass.getNumber());
        a.setNum(getNum()+myClass.getNum());
        return a;
    }
    public int getNumber() {
        return number;
    }

    public int getNum() {
        return num;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
