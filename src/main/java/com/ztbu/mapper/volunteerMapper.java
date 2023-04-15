package com.ztbu.mapper;

import com.ztbu.pojo.Volunteer;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface volunteerMapper {

    @Select("select * from tb_student;")
    @ResultMap("volunteerResultMap")
    List<Volunteer> selectAll();

    @Update("update tb_student set student_name = #{name},student_sex = #{sex},student_class = #{grade},student_call = #{call} where student_id = #{id}")
    void update(Volunteer volunteer);

    @Select("select * from tb_student where student_id = #{id};")
    @ResultMap("volunteerResultMap")
    Volunteer selectById(int id);

    @Insert("insert into tb_student  values (#{id},#{name},#{sex},#{grade},#{call})")
    void insert(Volunteer volunteer);

    @Delete("delete from tb_student where student_id = #{id};")
    @ResultMap("volunteerResultMap")
    void deleteById(int id);


    List<Volunteer> selectByTjSingle(Volunteer volunteer);
}
