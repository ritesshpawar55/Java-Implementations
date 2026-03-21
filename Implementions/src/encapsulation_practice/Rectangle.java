package encapsulation_practice;

class Rectangle {
    private int length;
    private int width;

    public void setDimensions(int l, int w) {
        length = l;
        width = w;
    }

    public int getArea() {
        return length * width; // computed value
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5, 4);
        System.out.println("Area: " + r.getArea());
    }
}