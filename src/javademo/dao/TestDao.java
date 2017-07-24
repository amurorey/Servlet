package javademo.dao;

import java.util.List;

/**
 * Created by amuro on 2017-07-21.
 * 数据访问层接口
 */
public interface TestDao {

    List<Object> query(String sql, Object[] params);

    int update(String sql,Object[] params);
}
