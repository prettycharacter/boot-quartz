package cjwm.quartz.demo.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author: XuPengfei
 * @data: 2020/7/10 23 01
 * @description:
 */
public class TestTask extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("正在执行" + jobExecutionContext.getMergedJobDataMap().get("sss"));
    }
}
