package com.fdemo.fdemo.controller;

import com.fdemo.fdemo.common.Result;
import com.fdemo.fdemo.model.PageBean;
import com.fdemo.fdemo.model.User;
import com.fdemo.fdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * 1，<增>
 * 单增加 (ok)
 * </增>
 * 2，<删>
 * 单删除 (ok)
 * 批量删除 (ok)
 * </删>
 * 3，<改></改> (ok)
 * 4，<查>
 * 全查 (ok)
 * <新加>
 * 通过id查找 (ok)
 * </新加>
 * 部分查（模糊搜索）(ok)
 * 分页查 (ok)
 * </查>
 * 5，<分页></分页> (ok)
 * 6，文件上传 (ok)
 * 7，用户验证 (ok)
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户
     *
     * @return
     */
    @GetMapping("")
    public Result list() {
        log.info("查询用户数据");
        List<User> userList = userService.list();
        return Result.success(userList);
    }

    /**
     * 通过id查找员工
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result listById(@PathVariable Integer id) {
        log.info("通过id查找员工:{}", id);
        User userId = userService.listById(id);
        return Result.success(userId);
    }

    /**
     * 模糊搜索
     *
     * @param name
     * @param email
     * @param begin
     * @param end
     * @return
     */
    @GetMapping("/search")
    public Result listSearch(String name, String email,
                             @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                             @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("模糊搜索,参数：{}{}{}{}", name, email, begin, end);
        List<User> userListSearch = userService.listSearch(name, email, begin, end);
        return Result.success(userListSearch);
    }

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping
    public Result add(@RequestBody User user) {
        log.info("新增用户:{}", user);
        userService.add(user);
        return Result.success();
    }

    /**
     * 修改用户
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        log.info("修改用户:{}", user);
        userService.update(user);
        return Result.success();
    }

    /**
     * 删除用户(单删除)
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除用户:{}", id);
        userService.delete(id);
        return Result.success();
    }

    /**
     * 批量删除用户
     *
     * @param ids
     * @return
     */
    @DeleteMapping("/delete/{ids}")
    public Result deleteAll(@PathVariable List<Integer> ids) {
        log.info("删除用户(批量删除):ids{}", ids);
        userService.deleteAll(ids);
        return Result.success();
    }

    /**
     * 分页+模糊搜索
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "3") Integer pageSize,
                       String name, String email,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("分页查询，参数: {},{},{},{},{},{}", page, pageSize, name, email, begin, end);
        PageBean pageBean = userService.page(page, pageSize, name, email, begin, end);
        return Result.success(pageBean);
    }

    @PostMapping("/upload")
    public Result upload(String name, MultipartFile image) throws Exception {
        log.info("文件上传: {} {}", name, image);
        // 1, 获取原始文件名
        String originalFilename = image.getOriginalFilename();
        // 2, 构造唯一的文件名（不能重复） -- uuid（唯一识别码）
        int lastIndexOf = originalFilename.lastIndexOf(".");
        String substring = originalFilename.substring(lastIndexOf);
        String newFile = UUID.randomUUID().toString() + substring;
        log.info("新文件的名字: {}", newFile);
        // 3, 将文件存储在本地
        image.transferTo(new File("../../../resources/public/storage/" + newFile));
        return Result.success();
    }
}
