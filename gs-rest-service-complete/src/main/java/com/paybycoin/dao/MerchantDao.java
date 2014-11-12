package com.paybycoin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.paybycoin.domain.Merchant;

public class MerchantDao {
	
	private DataSource dataSource;
	
	public void setDatasource (DataSource dataSource) {
		this.dataSource = dataSource;
	}
  
	public Merchant getMerchant(String uuid) throws SQLException {
		String sql = "SELECT * FROM Merchant_Info WHERE MERCHANT_ID = ?";
		
		Connection conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, uuid);
		Merchant merchant = null;
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			merchant = new Merchant(
				rs.getString("Merchant_ID"),
				rs.getString("Merchant_Name")
			);
		}
		
		rs.close();
		ps.close();
		return merchant;
	}
}
