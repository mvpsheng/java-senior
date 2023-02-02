package formatOutput;

/**
 * FileName: DatabaseExceptions
 * author: gxs
 * Date: 2022/8/29  15:02
 */
public class DatabaseExceptions extends Exception {
    public DatabaseExceptions (int transactionID, int queryID,
    String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseExceptions(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
