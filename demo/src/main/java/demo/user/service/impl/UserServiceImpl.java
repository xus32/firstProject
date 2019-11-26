package demo.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import demo.user.entity.User;
import demo.user.mapper.UserMapper;
import demo.user.service.IUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xus
 * @since 2019-09-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
	@Autowired
	UserMapper userMapper;
	//自定义分页查询
	public Page<User> queryUserByPage(int pageNum,int pageSize){
		//startPage紧跟着的第一个select方法会被分页
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = userMapper.selectList(null);
		
		Page<User> page = (Page<User>) users;
		
	
		
		return page;
	}
}
