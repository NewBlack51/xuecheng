package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.PageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Black
 * @version 1.0
 * @description com.xuecheng.manage_cms.controller
 * @date 2018/12/1
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {
    Logger logger = LoggerFactory.getLogger(CmsPageController.class);

    @Autowired
    private PageService pageService;

    @RequestMapping(value = "/list/{page}/{size}", method = RequestMethod.GET)
    @Override
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
      /*  //静态数据
        QueryResult<CmsPage> queryResult = new QueryResult<CmsPage>();
        List<CmsPage> list = new ArrayList<>();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("嘻嘻哈哈哈!!!!!");
        list.add(cmsPage);
        queryResult.setList(list);
        queryResult.setTotal(1);

        QueryResponseResult queryResponseResult = new QueryResponseResult(CmsCode.CMS_ADDPAGE_EXISTSNAME, queryResult);
        return queryResponseResult;*/
      logger.info("enter to get cms page imformation");
      return pageService.findList(page,size,queryPageRequest);
    }
}
