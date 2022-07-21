package top.silentyears.freetime.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.silentyears.freetime.constant.CornConstant;
import top.silentyears.freetime.entity.DailyTask;
import top.silentyears.freetime.service.DailyTaskService;
import top.silentyears.freetime.tools.EmailTool;
import top.silentyears.freetime.tools.TimeTool;

import java.util.List;

/**
 * 每日任务定时统计类
 * @author : WuChaojie
 * @date : 2022/7/18 14:00
 */
@Slf4j
@Component
public class DailyTaskJob {

    @Autowired
    private DailyTaskService dailyTaskService;

    @Autowired
    private EmailTool emailTool;

    /**
     * 每晚十一点提示今天完成的任务
     */
    @Scheduled(cron = CornConstant.DAILY_23_00_00)
    public void reportTodayTask() {
        // 查询指定日期完成的任务
        String today = TimeTool.getToday();
        List<DailyTask> dailyTasks = dailyTaskService.listFinishTaskByDate(today);
        // 对任务进行处理
        String msg = "今日完成任务信息：\n";
        for (DailyTask dailyTask : dailyTasks) {
            msg += "    " + (dailyTasks.indexOf(dailyTask) + 1) + "." + dailyTask.getTaskInfo() +"\n";
        }
        // 发送给我
        Boolean sendEmail = emailTool.sendEmail("1812555245@qq.com", "今日任务完成情况", msg);
        if (!sendEmail) {
            log.error("发送 " + today + " 的汇总邮件失败");
        }
    }

    /**
     * 每月一号提示上个月完成的任务
     */
    @Scheduled(cron = CornConstant.MONTH_01_08_00_00)
    public void reportLastMonthTask() {
        // 查询指定月份完成的任务
        String lastMonth = TimeTool.getLastMonth();
        List<DailyTask> dailyTasks = dailyTaskService.listFinishTaskByDate(lastMonth);
        // 对任务进行处理
        String msg = "上月完成任务信息汇总：\n";
        for (DailyTask dailyTask : dailyTasks) {
            msg += "    " + (dailyTasks.indexOf(dailyTask) + 1) + "." + dailyTask.getTaskInfo() +"\n";
        }
        // 发送给我
        Boolean sendEmail = emailTool.sendEmail("1812555245@qq.com", "今日任务完成情况", msg);
        if (!sendEmail) {
            log.error("发送 " + lastMonth + " 的汇总邮件失败");
        }
    }

    /**
     * 每天九点提示查看任务
     */
    @Scheduled(cron = CornConstant.test)
    public void tipTask() {
        // 查询还未完成的任务
        List<DailyTask> dailyTasks = dailyTaskService.listTodoTask();
        // 对任务进行处理
        String msg = "未完成任务信息汇总：\n";
        for (DailyTask dailyTask : dailyTasks) {
            msg += "    " + (dailyTasks.indexOf(dailyTask) + 1) + "." + dailyTask.getTaskInfo() +"\n";
        }
        // 发送给我
        Boolean sendEmail = emailTool.sendEmail("1812555245@qq.com", "今日任务完成情况", msg);
        if (!sendEmail) {
            log.error("发送今日的任务提醒邮件失败");
        }
    }
}
