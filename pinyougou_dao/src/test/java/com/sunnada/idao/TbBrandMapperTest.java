package com.sunnada.idao;

import com.sunnada.pojo.TbBrand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class TbBrandMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        List<TbBrand> tbBrands = mapper.selectByExample(null);
        if (tbBrands!=null&&!tbBrands.isEmpty()) {
            System.out.println(tbBrands);
        }
        sqlSession.close();
    }
}