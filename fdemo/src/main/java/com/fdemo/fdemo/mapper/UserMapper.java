package com.fdemo.fdemo.mapper;

import com.fdemo.fdemo.model.User;
import org.apache.ibatis.annotations.Mapper;


import java.time.LocalDate;
import java.util.List;

@Mapper
public interface UserMapper {
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
    void insertUser(User user);
    /**
     * 删除用户(单删除)
     *
     * @param id
     * @return
     */
    void deleteById(Integer id);
    /**
     * 修改用户
     */
    void update(User user);

    /**
     * 统计分页总数据
     * @return
     */
    public Long count();
    /**
     * 分页+模糊搜索
     *
     * @param start
     * @param pageSize
     * @return
     */
    public List<User> page(Integer start, Integer pageSize, String name, String email, LocalDate begin, LocalDate end);
    /**
     * 批量删除用户
     *
     * @param ids
     * @return
     */
    void deleteByIdAll(List<Integer> ids);
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

    User getEmailAndPassword(User user);
}
