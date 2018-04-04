package com.module.service.serviceimpl;

import java.util.List;

import com.module.bean.Myuser;
import com.module.dao.MyuserDAO;
import com.module.service.UserService;
public class UserServiceImpl implements UserService
{
    private MyuserDAO myuserDao;

    public MyuserDAO getMyuserDao() {
        return this.myuserDao;
    }

    public void setMyuserDao(MyuserDAO myuserDao) {
        this.myuserDao = myuserDao;
    }

    public boolean login(Myuser myuser)
    {
        List<Myuser> list = this.myuserDao.login(myuser);
        if(list.size()==0){
            return false;
        }
        else{
            return true;
        }
    }
}
