package com.fdemo.fdemo.service.impl;

import com.fdemo.fdemo.mapper.UserMapper;
import com.fdemo.fdemo.model.PageBean;
import com.fdemo.fdemo.model.User;
import com.fdemo.fdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户
     *
     * @return
     */
    @Override
    public List<User> list() {
        return userMapper.list();
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @Override
    public void add(User user) {
        user.setPassword("123456");
        userMapper.insertUser(user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        userMapper.deleteById(id);
    }

    /**
     * 修改用户
     *
     * @param user
     */
    @Override
    public void update(User user) {
        userMapper.update(user);
    }
    /**
     * 分页+模糊搜索
     *
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, String email, LocalDate begin, LocalDate end) {
        // 1, 获取总的记录数
        Long count = userMapper.count();
        // 2，获取分页查询结果列表
        Integer start = (page - 1) * pageSize;
        List<User> userList = userMapper.page(start, pageSize, name, email, begin, end);
        // 3，封装pageBean对象
        PageBean pageBean = new PageBean(count, userList);
        return pageBean;
    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void deleteAll(List<Integer> ids) {
        userMapper.deleteByIdAll(ids);
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
    @Override
    public List<User> listSearch(String name, String email, LocalDate begin, LocalDate end) {
        return userMapper.listSearch(name, email, begin, end);
    }
}
