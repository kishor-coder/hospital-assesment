
import java.sql.*;  
public class Test{  
public static void main(String ar[]){  
 try{  
  
   String url="jdbc:odbc:mydsn";  
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
}
catch(ClassNotFoundException ex)
{System.out.println("driver not found");
}
Connection c=null;
try{
   c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital,kishor","root","");  
   Statement st=c.createStatement();  
   ResultSet rs=st.executeQuery("CREATE TABLE Table_India AS (SELECT * FROM kishor WHERE County ='IND');");  
    
   while(rs.next()){  
    System.out.println(rs.getString(1));  
   }  
  
}catch(SQLException ee){System.out.println(ee);}  
  
}}  