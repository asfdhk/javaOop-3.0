public class Weight extends MyClass{

    private int weight;

    public Weight(int height, int length, int width,int weight) {
        super(height, length, width);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "weight=" + weight +
                 ", height=" + getHeight() +
                ", width=" + getWidth() +
                ", length=" + getLength() +
                '}';
    }

    public double ro(){
        double a =(double) getWeight()/volume();
        return a;
    }

    public int reduceWeight(int n){
        int a = getWeight()/n;
        return a;
    }

    public Weight create(Weight weight){
        int vol = volume() + weight.volume();
        Weight d = new Weight(vol/3,vol/3,vol/3,getWeight()+weight.getWeight());
        return d;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
