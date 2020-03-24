package com.metu.cityspider.service.impl;

import cn.wanghaomiao.seimi.annotation.Crawler;
import cn.wanghaomiao.seimi.config.SeimiConfig;
import cn.wanghaomiao.seimi.core.Seimi;
import cn.wanghaomiao.seimi.def.BaseSeimiCrawler;
import cn.wanghaomiao.seimi.struct.Request;
import cn.wanghaomiao.seimi.struct.Response;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.metu.cityspider.service.LianjiaCrawlerService;
import org.seimicrawler.xpath.JXDocument;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Component;

import javax.websocket.RemoteEndpoint;
import java.util.List;

/**
 * @ClassName LianjiaCrawlerServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2019/11/29 16:04
 * @Version 1.0
 **/
@Component
public class LianjiaCrawlerServiceImpl implements LianjiaCrawlerService {
    @Value(value="")
    private String url_prefix;

}