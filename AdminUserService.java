package cn.xuqiang.shop.adminuser.service;

import cn.xuqiang.shop.adminuser.dao.AdminUserDao;
import cn.xuqiang.shop.adminuser.vo.AdminUser;

public class AdminUserService {
 //注入AdminUserDao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	
	/**
	 * 逻辑层中登录的执行方法
	 * @param adminUser
	 * @return
	 */
	public AdminUser login(AdminUser adminUser) {
		
		return adminUserDao.login(adminUser);
	}
	
}
