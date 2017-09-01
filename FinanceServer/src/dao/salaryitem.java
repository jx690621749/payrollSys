package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;   
import java.sql.SQLException;   
import java.sql.Connection;   
import java.sql.Statement;

public class salaryitem {
   private Connection conn;
   private  String url = "jdbc:mysql://localhost:3306/payrollsystemdb?"   
    + "user=root&password=500410&useUnicode=true&characterEncoding=UTF8";
   public salaryitem() throws ClassNotFoundException {
	   Class.forName("com.mysql.jdbc.Driver");
   }
   public void addsalaryitem(salaryitemclass sa) {
	   try {
	   conn	= DriverManager.getConnection(url);
	   String stmt = "select name from salaryitem";
	   PreparedStatement sql = conn.prepareStatement(stmt);
	   boolean bool = true;
	   ResultSet res = sql.executeQuery();
	   while(res.next()) {
		   if(res.getString("name").equals(sa.getName())) {
			   bool=false;
			   break;
		   }
	   }
	   if(bool==true) {
	   stmt = "insert into salaryitem(name,type,visible,"
	   		+ "caculate,order,addordelete,remark)values(?,?,?,?,?,?,?)";
	   sql = conn.prepareStatement(stmt);
	   sql.setString(1, sa.getName());
	   sql.setString(2, sa.getType());
	   sql.setString(3, sa.getVisible());
	   sql.setString(4, sa.getCaculate());
	   sql.setString(5, sa.getOrder());
	   sql.setString(6, sa.getAddordelete());
	   sql.setString(7, sa.getRemark());
	   sql.executeUpdate();
	   }
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   public void changesalaryitem(salaryitemclass sa) {
	   try {
		conn = DriverManager.getConnection(url);
		String stmt = null;
		if(!sa.getType().equals(null)) {
			stmt = "update salaryitem set type=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getType());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
		if(!sa.getVisible().equals(null)) {
			stmt = "update salaryitem set visible=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getVisible());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
		if(!sa.getCaculate().equals(null)) {
			stmt = "update salaryitem set caculate=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getCaculate());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
		if(!sa.getOrder().equals(null)) {
			stmt = "update salaryitem set order=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getOrder());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
		if(!sa.getAddordelete().equals(null)) {
			stmt = "update salaryitem set addordelete=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getAddordelete());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
		if(!sa.getRemark().equals(null)) {
			stmt = "update salaryitem set remark=? where name = ?";
			PreparedStatement sql = conn.prepareStatement(stmt);
			sql.setString(1, sa.getRemark());
		 	sql.setString(2, sa.getName());
		 	sql.executeUpdate();			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   public void deletesalaryitem(salaryitemclass sa) {
	   try {
		conn = DriverManager.getConnection(url);
		String stmt = "delete from salaryitem where name = ?";
		PreparedStatement sql = conn.prepareStatement(stmt);
		sql.setString(1, sa.getName());
		sql.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   public salaryitemclass getsalaryitem(String name) {
	   salaryitemclass sa=null;
	   try {
		    conn = DriverManager.getConnection(url);
		    String stmt = "select * from salaryitem where name = ?";
		    PreparedStatement sql = conn.prepareStatement(stmt);
		    ResultSet res = sql.executeQuery();
		    while(res.next()) {
		    	sa.setType(res.getString("type"));
		    	sa.setVisible(res.getString("visible"));
		    	sa.setCaculate(res.getString("caculate"));
		    	sa.setOrder(res.getString("order"));
		    	sa.setAddordelete(res.getString("addordelete"));
		    	sa.setRemark(res.getString("remark"));
		    }
	} catch (Exception e) {
		e.printStackTrace();
	}
    return sa;
   }
}
