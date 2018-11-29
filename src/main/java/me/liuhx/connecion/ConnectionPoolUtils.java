package me.liuhx.connecion;

/**
 * @program MysqlConnectPool
 * @description:
 * @author: liuhx
 * @create: 2018/11/29 14:01
 */
public class ConnectionPoolUtils {
    private ConnectionPoolUtils() {
    }

    private static ConnectionPool poolInstance = null;

    public static ConnectionPool GetPoolInstance() {
        if (poolInstance == null) {
            poolInstance = new ConnectionPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://180.76.97.26:3306/incar?useUnicode=true&characterEncoding=utf-8",
                    "ground", "123456");
            try {
                poolInstance.createPool();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return poolInstance;
    }
}
