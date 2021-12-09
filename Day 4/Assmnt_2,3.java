package dec.eg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountsEg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//*********************Day 4 Assigment 3******************
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost/tweets", "root", "orcl");
		PreparedStatement st = ct.prepareStatement("insert into tweet (id,name,likes) values(?,?,?)");
		
		st.setInt(1, 3);
		st.setString(2, "tweet 3");
		st.setInt(3, 78);
		st.executeUpdate();
		
	    st.close();
	    ct.close();
	    
	    //*********************Day 4 Assigment 2******************
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection ct1 = DriverManager.getConnection("jdbc:mysql://localhost/tweets", "root", "orcl");
	    PreparedStatement st1 = ct1.prepareStatement("select * from tweet where name like 'tw%'");
		ResultSet rs = st1.executeQuery();

		
		while (rs.next()) {
		  int id = rs.getInt(1);
		  String name = rs.getString(2);
		  int likes = rs.getInt(3);
		
		
		  System.out.println(id + "\t" + name + "\t" + likes);
		}
	    
		
	    rs.close();
	    st1.close();
	    ct1.close();
		
	    
	    
		
	}
}


