package javademo.dao.impl;

import javademo.dao.TestDao;
import javademo.utils.DBHelper;

import java.util.List;

/**
 * Created by amuro on 2017-07-21.
 * 数据访问层实现
 */
public class TestDaolmpl implements TestDao {

    //返回结果集的query
    @Override
    public List<Object> query(String sql, Object[] params) {
        DBHelper db = new DBHelper();
        return db.query(sql,params);
    }

    //插入数据到数据库的query返回条数
    @Override
    public int update(String sql, Object[] params) {
        DBHelper db = new DBHelper();
        return db.update(sql, params);
    }
}
