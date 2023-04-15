package com.ztbu.service;

import com.ztbu.mapper.volunteerMapper;
import com.ztbu.pojo.Volunteer;
import com.ztbu.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class VolunteerService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有
     * @return
     */
    public List<Volunteer> selectAll(){

        SqlSession sqlSession = factory.openSession();
        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);


        List<Volunteer> volunteers = mapper.selectAll();

        sqlSession.close();

        return volunteers;
    }
    public void update(Volunteer volunteer){
        SqlSession sqlSession = factory.openSession();

        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);
        mapper.update(volunteer);

        sqlSession.commit();
        sqlSession.close();
    }

    public Volunteer selectById(int id){
        SqlSession sqlSession = factory.openSession();

        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);
        Volunteer volunteer = mapper.selectById(id);
        sqlSession.close();
        return volunteer;
    }

    public void insert(Volunteer volunteer){
        SqlSession sqlSession = factory.openSession();

        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);
        mapper.insert(volunteer);

        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteById(int id){
        SqlSession sqlSession = factory.openSession();
        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);
        mapper.deleteById(id);

        sqlSession.commit();
        sqlSession.close();
    }

    public List<Volunteer> selectByTjSingle(Volunteer volunteer){
        SqlSession sqlSession = factory.openSession();
        volunteerMapper mapper = sqlSession.getMapper(volunteerMapper.class);
        List<Volunteer> volunteers = mapper.selectByTjSingle(volunteer);

        sqlSession.close();
        return volunteers;
    }
}
