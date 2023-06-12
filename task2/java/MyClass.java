public class MyClass {
    private int height;
    private int width;
    private int length;


    public MyClass(int height,int length,int width){
        this.length = length;
        this.width = width;
        this.height= height;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public int volume(){
        int vol = getHeight()*getLength()*getWidth();
        return vol;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
