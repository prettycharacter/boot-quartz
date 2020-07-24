package cjwm.quartz.demo.controller;

import cjwm.quartz.demo.task.TestTask;
import cjwm.quartz.demo.uitl.QuartzManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: XuPengfei
 * @data: 2020/7/10 22 59
 * @description:
 */
@RestController
@RequestMapping("/test")
@Api(tags = "时间测试")
@Slf4j
public class TestController {
    /**
     * @Description:
     * @Param: * @param null
     * @return:
     * @Author: xpf
     * @date: 2020/7/10
     */
    @GetMapping("addquartz")
    @ApiOperation(value = "新增定时任务 xpf")
    public void addQuartz() {
        try {
            Map map = new HashMap();
            map.put("sss", "徐鹏飞");
            QuartzManager.getInstance().addJob(TestTask.class, "test1", "test", "*/5 * * * * ?", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.warn("执行了");
    }

    /**
     * @Description:
     * @Param: * @param null
     * @return:
     * @Author: xpf
     * @date: 2020/7/10
     */
    @GetMapping("delquartz")
    @ApiOperation(value = "删除定时任务 xpf")
    public void delQuartz() {
        try {
            QuartzManager.getInstance().deleteJob("test1", "test");
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.warn("执行了");
    }
}
