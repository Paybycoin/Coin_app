package com.paybycoin.Controllers;

import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.paybycoin.dao.MerchantDao;
import com.paybycoin.domain.Merchant;

@RestController
public class MerchantController {

 
    @RequestMapping(value = "/merchant",method = RequestMethod.GET)
    public Merchant getMerchant(@RequestParam(value="uuid", defaultValue="default") String uuid) {
		String dbName = System.getProperty("RDS_DB_NAME"); 
		String userName = System.getProperty("RDS_USERNAME"); 
		String password = System.getProperty("RDS_PASSWORD"); 
		String hostname = System.getProperty("RDS_HOSTNAME");
		String port = System.getProperty("RDS_PORT");
		
		String jdbcurl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl(jdbcurl);
		dataSource.setUser(userName);
		dataSource.setPassword(password);
		
		MerchantDao dao = new MerchantDao();
		dao.setDatasource(dataSource);
		try {
			dao.getMerchant(uuid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new Merchant(uuid,"Mumbai");
    }
}
