package kf.lucky.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import kf.lucky.main.model.Staff;
import org.apache.ibatis.annotations.Mapper;

// 继承mybatis-plus的BaseMapper
@Mapper
public interface StaffMapper extends BaseMapper<Staff> {
}
