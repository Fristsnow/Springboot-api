package kf.lucky.main.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kf.lucky.main.common.FResult;
import kf.lucky.main.mapper.StaffMapper;
import kf.lucky.main.model.Staff;
import kf.lucky.main.service.StaffService;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

    //具体方法
    //create
    @Override
    public FResult<String> createStaff(Staff staff) {
        Long staffId = System.currentTimeMillis() / 1000;
        staff.setId(staffId);
        this.save(staff);
        return FResult.ok();
    }
    //update
    @Override
    public FResult<String> updateBook(Staff staff) {
//        System.out.println(staff);
        this.updateById(staff);
        return FResult.ok();
    }
}
