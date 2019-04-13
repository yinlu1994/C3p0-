package com.itheima.b_datasourc.f_c3p0;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.itheima.utils.JdbcUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo {
	@Test
	//硬编码
	public void f1() throws Exception {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		//设置基本参数
		ds.setDriverClass("com.mysql.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql:///eshop_jdbc");
		ds.setUser("root");
		ds.setPassword("yin941210lu");
		
		Connection conn = ds.getConnection();
		String sql = "insert into catagory values(?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		
		//设置参数
		st.setString(1, "c013");
		st.setString(2, "减肥药");
		
		int i = st.executeUpdate();
		System.out.println(i);
		JdbcUtils.closeResource(conn, st, null);
	}
	
	//配置文件方法
	@Test
	public void f2() throws Exception {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		Connection conn = ds.getConnection();
		String sql = "insert into catagory values(?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		
		//设置参数
		st.setString(1, "c015");
		st.setString(2, "草药");
		
		int i = st.executeUpdate();
		System.out.println(i);
		JdbcUtils.closeResource(conn, st, null);
	}
	
	
}
