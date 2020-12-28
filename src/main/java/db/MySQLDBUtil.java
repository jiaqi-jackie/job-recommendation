package db;

public class MySQLDBUtil {
    private static final String INSTANCE = "replace with my instance address later";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "replace with my db name later";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "replace with my password later";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
