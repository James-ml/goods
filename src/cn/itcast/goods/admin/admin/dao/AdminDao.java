package cn.itcast.goods.admin.admin.dao;

import cn.itcast.goods.admin.admin.domain.Admin;
import cn.itcast.jdbc.TxQueryRunner;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class AdminDao {
	private QueryRunner qr = new TxQueryRunner();
	
	/**
	 * 通过管理员登录名和登录密码查询
	 * @param adminname
	 * @param adminpwd
	 * @return
	 * @throws SQLException
	 */
	public Admin find(String adminname, String adminpwd) throws SQLException {
		String sql = "select * from t_admin where adminname=? and adminpwd=?";
		Admin admin = qr.query(sql, new BeanHandler<Admin>(Admin.class), adminname, adminpwd);
		System.out.println(admin);
		return admin;
	}
}
