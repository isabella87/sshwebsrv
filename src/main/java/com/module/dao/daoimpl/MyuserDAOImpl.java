package com.module.dao.daoimpl;


import java.util.List;

import com.module.bean.Myuser;
import com.module.dao.MyuserDAO;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class MyuserDAOImpl extends HibernateDaoSupport implements MyuserDAO
{
    @SuppressWarnings("unchecked")
//    @Override
    public List<Myuser> login(Myuser myuser)
    {

        String sql = " from Myuser as user where user.username='"+myuser.getUsername()+"' and user.password='"+myuser.getPassword() +"'"  ;
        return (List<Myuser>) this.getHibernateTemplate().find(sql);
    }
}
