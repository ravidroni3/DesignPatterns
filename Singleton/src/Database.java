public class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {
        if (dbObject == null)
            dbObject = new Database();
        return dbObject;
    }
    public static void getConnection(){
        System.out.println("Database Connection");
    }

}
