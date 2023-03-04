public class Main {
    public static void main(String[] args) {
        OsFactory osFactory = new OsFactory();
        OS obj = osFactory.getInstance("Closed");
        obj.specs();

    }
}