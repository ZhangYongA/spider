package com.ys.spider.api;

import com.alibaba.druid.support.json.JSONParser;
import com.google.common.collect.ImmutableList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangyong
 */
@RestController
public class TestApi {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Object> test() {
        JSONParser parser = new JSONParser("{ \"name\" : \"P53-zm3\", \"cluster_name\" : \"elasticsearch_zhangyong\", \"cluster_uuid\" : \"rYBTpIKoQneWjOxY2d-Psg\", \"version\" : { \"number\" : \"5.1.1\", \"build_hash\" : \"5395e21\", \"build_date\" : \"2016-12-06T12:36:15.409Z\", \"build_snapshot\" : false, \"lucene_version\" : \"6.3.0\" }, \"tagline\" : \"You Know, for Search\" }");
        return ImmutableList.of(parser.parse());
    }

}
