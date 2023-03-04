public class OsFactory {
    public OS getInstance(String str) {
        if (str.equals("Open"))
            return new Windows();
        else
            return new Linux();


    }
}
