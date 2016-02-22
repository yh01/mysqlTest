package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;

public class SelectDAO {
	private boolean res;
	private Connection con;
	private String sql;

	private String myId;
	private String myPass;
	private String myAdd;
	public boolean select(String id){
		res = true;

		try{
			con = (Connection)DBConnector.getConnection("mysqlTest");
			java.sql.Statement stm = con.createStatement();
			sql = "select * from user where user_id = '"+id+"' ";
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				myId = rs.getString("user_id");
				myPass = rs.getString("password");
				myAdd = rs.getString("address");

				if(myId == null){
					res = false;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return res;
	}

	public String getMyId() {
		return myId;
	}

	public String getMyPass() {
		return myPass;
	}

	public String getMyAdd() {
		return myAdd;
	}

}
