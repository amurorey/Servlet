package javademo.service.impl;

import javademo.dao.TestDao;
import javademo.dao.impl.TestDaolmpl;
import javademo.service.TestService;

import java.util.List;

/**
 * Created by amuro on 2017-07-21.
 * 业务逻辑层的实现
 */
public class TestServiceImpl implements TestService {

    TestDao testDao = new TestDaolmpl();

    @Override
    public List<Object> getTestList() {
        String sql = "select * from YSCODE";
        return testDao.query(sql, null);
    }

    @Override
    public int insertTest(Object[] params) {
        String sql ="insert into test(name) values(?)";
        return testDao.update(sql, params);
    }

    @Override
    public int modifyTest(Object[] params) {
        String sql ="update test set name = ? where id = ?";
        return testDao.update(sql, params);
    }

    @Override
    public int deleteTest(Object[] params) {
        String sql ="delete from test where id = ?";
        return testDao.update(sql, params);
    }

    //获取用户的登录信息
    @Override
    public List<Object> getUserInfo(Object[] params) {
        String sql = "SELECT CODE,PASSWORD,KSCODE,NAME,KSNAME FROM dbo.YSCODE WHERE CODE = ? AND PASSWORD = ?";
        return testDao.query(sql,params);
    }

}
