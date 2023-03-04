public class GreenColor extends Color {
    public GreenColor() {
        this.colorName = "GREEN";
    }

    @Override
    void fillColor() {
        System.out.println("filling green");
    }
}
