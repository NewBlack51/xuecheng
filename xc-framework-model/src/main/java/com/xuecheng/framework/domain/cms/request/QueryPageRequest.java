package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author Black
 * @version 1.0
 * @description com.xuecheng.framework.domain.cms.request
 * @date 2018/12/1
 */
@Data
public class QueryPageRequest extends RequestData {
    //站点id
    private String siteId;
    //页面id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}
