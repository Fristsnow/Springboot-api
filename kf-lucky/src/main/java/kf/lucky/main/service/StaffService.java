package kf.lucky.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import kf.lucky.main.common.FResult;
import kf.lucky.main.model.Staff;


//继承mybatis-plus的IService
public interface StaffService extends IService<Staff> {

    //创建方法
    FResult<String> createStaff(Staff staff);

    //修改方法
    FResult<String> updateBook(Staff staff);
}
