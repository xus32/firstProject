package demo.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.Page;

import demo.user.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xus
 * @since 2019-09-04
 */
public interface IUserService extends IService<User> {
	//自定义分页查询
	public Page<User> queryUserByPage(int pageNum,int pageSize);
}
