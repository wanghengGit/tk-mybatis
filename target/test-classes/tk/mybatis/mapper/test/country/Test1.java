package tk.mybatis.mapper.test.country;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.mapper.mapper.CountryMapper;
import tk.mybatis.mapper.mapper.MybatisHelper;
import tk.mybatis.mapper.model.Country;

public class Test1 {

    @Test(expected = TooManyResultsException.class)
    public void testDynamicSelectAll() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        try {
            CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
            Country country = mapper.selectOne(new Country());
            System.out.println("===============================================");
        } finally {
            sqlSession.close();
        }
    }
}
