package kf.lucky.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import kf.lucky.main.common.FResult;
import kf.lucky.main.model.Staff;

public interface StaffService extends IService<Staff> {

    FResult<String> createStaff(Staff staff);

    FResult<String> updateBook(Staff staff);
}
