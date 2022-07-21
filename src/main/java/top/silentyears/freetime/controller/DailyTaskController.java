package top.silentyears.freetime.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import top.silentyears.freetime.common.HttpResult;
import top.silentyears.freetime.common.ResultUtil;
import top.silentyears.freetime.entity.DailyTask;
import top.silentyears.freetime.service.DailyTaskService;

import javax.annotation.Resource;
import java.util.List;

/**
 * DailyTaskController
 * @author : WuChaojie
 * @date : 2022/5/25 15:24
 */
@Slf4j
@RestController
public class DailyTaskController {

    @Resource
    private DailyTaskService dailyTaskService;

    /**
     * 查询所有的任务数据(未完成)
     * @return
     */
    @GetMapping("/todoTask")
    public HttpResult listTodoTask() {
        log.info("开始执行Get： [/todoTask]");
        List<DailyTask> dailyTasks = dailyTaskService.listTodoTask();
        return ResultUtil.success(dailyTasks);
    }

    /**
     * 查询指定日志已完成的task
     * @param date
     * @return
     */
    @GetMapping("/finishTask/{date}")
    public HttpResult listFinishTaskByDate(@PathVariable("date") String date) {
        log.info("开始执行Get: [/finishTask/{}]", date);
        List<DailyTask> dailyTasks = dailyTaskService.listFinishTaskByDate(date);
        return ResultUtil.success(dailyTasks);
    }

    /**
     * 查询所有已完成的task（按日期分组）
     * @return
     */
    @GetMapping("/finishTask")
    public HttpResult listFinishTask() {
        log.info("开始执行Get: [/finishTask]");
        List<DailyTask> dailyTasks = dailyTaskService.listFinishTask();
        return ResultUtil.success(dailyTasks);
    }

    /**
     * 新建任务
     * @param dailyTask
     * @return
     */
    @PostMapping("/todoTask")
    public HttpResult addDailyTask(@RequestBody DailyTask dailyTask) {
        log.info("开始执行Post：[/todoTask] taskInfo:{}", dailyTask.getTaskInfo());
        return ResultUtil.success(dailyTaskService.createTodoTask(dailyTask));
    }

    /**
     * 删除任务
     * @param id
     * @return
     */
    @DeleteMapping("/todoTask/{id}")
    public HttpResult deleteDailyTask(@PathVariable("id") Integer id) {
        log.info("开始执行Delete:[/todoTask/{}]", id);
        return ResultUtil.success(dailyTaskService.deleteTodoTask(id));
    }

    /**
     * 更新任务
     * @param dailyTask
     * @return
     */
    @PutMapping("/todoTask")
    public HttpResult updateDailyTask(@RequestBody DailyTask dailyTask) {
        log.info("开始执行Put:[/todoTask] taskInfo:{}", dailyTask.getTaskInfo());
        return ResultUtil.success(dailyTaskService.updateTodoTask(dailyTask));
    }

    /**
     * 完成任务
     * @return
     */
    @PutMapping("/finishTodoTask/{id}")
    public HttpResult finishTodoTask(@PathVariable("id") Integer id) {
        log.info("开始执行Put：[/finishTodoTask/{}]", id);
        return ResultUtil.success(dailyTaskService.finishTodoTask(id));
    }



}
