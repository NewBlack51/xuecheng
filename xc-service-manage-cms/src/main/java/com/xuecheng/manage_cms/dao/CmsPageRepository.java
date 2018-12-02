package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Black
 * @version 1.0
 * @description com.xuecheng.manage_cms.dao
 * @date 2018/12/2
 */
@Repository
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    public CmsPage findByPageAliase(String pageAliase);
}
