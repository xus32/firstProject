package demo.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;

import demo.user.entity.User;
import demo.user.service.IUserService;
import demo.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xus
 * @since 2019-09-04
 */
@Api(value = "/用户", description = "Operations about user")
@RestController
@RequestMapping("/user/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.POST)
	@ApiOperation(value = "查找用户",
	    notes = "使用分页拦截器查找用户",
	    response = User.class,
	    responseContainer = "List")
	 @ApiImplicitParams({
         @ApiImplicitParam(name = "pageNum", value = "页码", paramType = "query", dataType = "Integer"),
         @ApiImplicitParam(name = "pageSize", value = "页面大小", paramType = "query", dataType = "Integer")
 })
	public R getUser(@RequestBody @ApiParam(value = "用户信息")User user, Integer pageNum, Integer pageSize) {
		System.out.println(user.getPassword());
		System.out.println(pageNum);
		Page<User> data = userService.queryUserByPage(pageNum, pageSize);
//		return R.queryOk(data, data.getPageNum(), data.getPageSize(), data.getTotal());
		return R.ok(data);
	}
	

}
