package dpPhoneService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceProvider {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpPhone", "root", "Bhavna@123");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void insertReferralData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpPhone", "root",
					"Bhavna@123");
			// Connection connection=getConnection();
			String query = "insert into referral(referralId,referralName,phoneNo,emailId,dateOfReferral) values(?,?,?,?,?)";
			PreparedStatement stmnt = connection.prepareStatement(query);
			stmnt.setInt(1, 3);
			stmnt.setString(2, "Rohit");
			stmnt.setString(3, "45687876554");
			stmnt.setString(4, "mohit@gmail.com");
			stmnt.setString(5, "15/07/2022");
			stmnt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewReferralData() throws SQLException {
	 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpPhone", "root", "Bhavna@123");
		String query = "select * from referral";
		Statement stmnt = connection.createStatement();
		ResultSet res = stmnt.executeQuery(query);
		while (res.next()) {
			int id = res.getInt("referralId");
			String name = res.getString("referralName");
			String phoneNo = res.getString("phoneNo");
			String email = res.getString("emailId");
			String date = res.getString("dateOfReferral");
			System.out.println(id + "\t" + name + "\t" + phoneNo + "\t" + email + "\t" + date);
		}
		res.close();
	}

	public static void updateReferralData() throws SQLException {
		String query="update referral set referralName=? where referralId=?";
        Connection connection=ServiceProvider.getConnection();
        PreparedStatement stmnt=connection.prepareStatement(query);
        stmnt.setString(1,"Bipin");
        stmnt.setInt(2,1);
        stmnt.executeUpdate();

	}

	public static void deleteReferralData() throws SQLException {
		
//		String query = "delete referral "+"set phoneNo= 9999999 where referralId =1 ";
//		Statement stmnt = getConnection().createStatement();
//		ResultSet res = stmnt.executeQuery(query);
		 Connection connection=ServiceProvider.getConnection();
		String query = "delete from referral where referralId = ?";
	     PreparedStatement preparedStmt = connection.prepareStatement(query);
	      preparedStmt.setInt(1, 3);

	      // execute the preparedstatement
	      preparedStmt.executeUpdate();
	      
	     
//		while (res.next()) {
//			int id = res.getInt("referralId");
//			String name = res.getString("referralName");
//			String phoneNo = res.getString("phoneNo");
//			String email = res.getString("emailId");
//			String date = res.getString("dateOfReferral");
//			System.out.println(id + "\t" + name + "\t" + phoneNo + "\t" + email + "\t" + date);
//		}
//		res.close();
	}
	

	
}
