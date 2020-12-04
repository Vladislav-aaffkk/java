package lr6;

import java.sql.SQLException;

public class Run {
    public static void main(String[] args) throws SQLException {
        Promise promise = new Promise();
        try {
            promise.add("Vlad", "Troll", "Boll", "1933-04-28");
            promise.add("Dennis", "MacAlistair", "Ritchie", "1777-02-09");
            promise.add("Kenneth", "Lane", "Thompson", "2001-03-04");
            promise.search("2001-03-04");
        } finally {
            promise.getConn().close();
        }
    }
}
