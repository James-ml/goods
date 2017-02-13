package cn.itcast.goods.admin.admin.service;

import cn.itcast.goods.admin.admin.dao.AdminDao;
import cn.itcast.goods.admin.admin.domain.Admin;

import java.sql.SQLException;

public class AdminService {
	private AdminDao adminDao = new AdminDao();
	
	/**
	 * 登录功能
	 * @param form
	 * @return
	 */
	public Admin login(Admin form) {
		try {
			return adminDao.find(form.getAdminname(),form.getAdminpwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
