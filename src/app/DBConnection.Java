
import java.sql.Connesction;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.level;
import java.util.logging.Logger;

public class DBConnection {

  public static Connection connection(){
    Connesction conn = null;
    try {
      Class.forName("com.myslq.jdbc,Driver");
      conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/project", "root", "1234");
    }catch(ClassNotFoundException ex){
      Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }catch(SQLException ex){
      Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    return conn;
  }
}
