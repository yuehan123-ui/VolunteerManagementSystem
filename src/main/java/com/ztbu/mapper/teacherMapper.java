package com.ztbu.mapper;

import com.ztbu.pojo.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface teacherMapper {

    @Select("select * from tb_teacher where username = #{username} and `password` = #{password};")
    Teacher selectByusername (@Param("username") String username, @Param("password")String password);
    @Insert("insert into tb_teacher values (null,#{username},#{password},#{email})")
    void insert(Teacher teacher);

    @Select("select * from tb_teacher where username = #{username};")
    Teacher selectByUsername (@Param("username") String username);


}
