package demo.user.mapper;

import demo.user.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xus
 * @since 2019-09-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
