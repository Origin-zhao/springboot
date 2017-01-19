package com.hudongwx.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author origin
 * @version 1.0, 2017/1/19 0019 <br/>
 * @desc <p>
 * <p>
 * 创建　origin　2017/1/19 0019　<br/>
 * <p>
 *
 * <p>
 * @email 294786949@qq.com
 */
@RestController
public class IndexController {

    @RequestMapping("/index.html")
    public String index1(){
        return "测demo成功了";
    }

    @RequestMapping("/index.jsp")
    public String index2(){
        return "测demo成功了";
    }

}
