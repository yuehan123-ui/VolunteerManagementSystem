package com.ztbu.service;

import com.ztbu.mapper.teacherMapper;
import com.ztbu.pojo.Teacher;
import com.ztbu.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TeacherService {

    public SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Teacher login(String username, String password){

        SqlSession sqlSession = factory.openSession();

        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);

        Teacher teacher = mapper.selectByusername(username,password);
        //释放资源
        sqlSession.close();

        return  teacher;
    }

    public boolean register(Teacher teacher){

        SqlSession sqlSession = factory.openSession();

        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);

        Teacher u = mapper.selectByUsername(teacher.getUsername());

        if(u == null){
            // 用户名不存在，注册
            mapper.insert(teacher);
            sqlSession.commit();
        }
        sqlSession.close();

        return u == null;

    }
}
