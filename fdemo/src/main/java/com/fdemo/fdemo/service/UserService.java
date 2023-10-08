package com.fdemo.fdemo.service;

import com.fdemo.fdemo.model.PageBean;
import com.fdemo.fdemo.model.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    /**
     * 查询用户
     *
     * @return
     */
    List<User> list();

    /**
     * 新增用户
     *
     * @param user
     */
    void add(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 修改用户
     *
     * @param user
     */
    void update(User user);
    /**
     * 分页+模糊搜索
     *
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize, String name, String email, LocalDate begin, LocalDate end);

    /**
     * 批量删除
     *
     * @param ids
     */
    void deleteAll(List<Integer> ids);
    /**
     * 模糊搜索
     *
     * @param name
     * @param email
     * @param begin
     * @param end
     * @return
     */
    List<User> listSearch(String name, String email, LocalDate begin, LocalDate end);

    /**
     * 通过id查找员工
     * @param id
     * @return
     */
    User listById(Integer id);

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);
}
