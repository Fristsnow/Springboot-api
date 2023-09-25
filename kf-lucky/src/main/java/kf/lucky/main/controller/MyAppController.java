package kf.lucky.main.controller;

import kf.lucky.main.common.FResult;
import kf.lucky.main.model.Staff;
import kf.lucky.main.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController     //组合注解，等同于Spring中的@Controller+ResponseBody注解
//@Slf4j
@RequestMapping("/book")
public class MyAppController {
    @Autowired
    private StaffService staffService;

    //Test api
    @GetMapping("/hello")
    public String hello(String[] args) {
        return "hello spring boot!";
    }

    //List api
    @GetMapping("/")
    public FResult<List<Staff>> getAllList() {
        return FResult.ok(staffService.list());
    }

//    Create api
    @PostMapping("/create")
    public FResult<String> create(@Valid @RequestBody Staff staff) {
        return staffService.createStaff(staff);
    }

    //Update api
    @PostMapping("/update/{bookId}")
    public FResult<String> updateBook(@PathVariable Long bookId,@RequestBody Staff staff){
        staff.setId(bookId);
        return staffService.updateBook(staff);
    }
    //delete api
    @PostMapping("/delete/{bookId}")
    public FResult<String> deleteBook(@PathVariable Long bookId){
        staffService.removeById(bookId);
        return FResult.ok();
    }
}
