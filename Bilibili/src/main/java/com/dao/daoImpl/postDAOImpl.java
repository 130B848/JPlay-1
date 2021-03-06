package com.dao.daoImpl;

import com.dao.postDAO;
import com.pojo.Post;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * postDAOImpl类对postDAO接口的方法进行了实现。<br>
 * 主要包含对post类的增删改查四个功能。
 */
public class postDAOImpl extends HibernateDaoSupport implements postDAO{
    /**
     * createPost方法实现了向数据库中增加一个post的功能
     * @param post 传入要增加的post
     */
    @Override
    public void createPost(Post post) {
        getHibernateTemplate().save(post);
//        getHibernateTemplate().flush();
    }

    /**
     * deletePost方法实现了从数据库中删除一个post的功能
     * @param postId 传入postId以根据postId找到要删除的post
     */
    @Override
    public void deletePost(int postId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Post.class, postId));
//        getHibernateTemplate().flush();
    }

    /**
     * updatePost方法实现了向数据库中修改一个post属性的功能
     * @param post 传入要修改的post（包含修改属性）
     */
    @Override
    public void updatePost(Post post) {
        getHibernateTemplate().merge(post);
//        getHibernateTemplate().flush();
    }

    /**
     * findPostById方法实现了根据postId找到一个post信息的功能
     * @param postId 传入postId作为查找因子
     * @return 返回需要查找的Post类的对象
     */
    @Override
    public Post findPostById(int postId) {
        return  getHibernateTemplate().load(Post.class, postId);
    }
}
