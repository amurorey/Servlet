package javademo.service;

import java.util.List;

/**
 * Created by amuro on 2017-07-21.
 * 业务逻辑层
 */
public interface TestService {

    List<Object> getTestList();//获取列表

    int insertTest(Object[] params);//插入一条

    int modifyTest(Object[] params);//修改

    int deleteTest(Object[] params);//删除

    List<Object> getUserInfo(Object[] params);//获取登录人员的信息

}
