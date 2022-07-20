package top.silentyears.freetime.service;

import top.silentyears.freetime.entity.DailyTask;

import java.util.List;

/**
 * 
 * @author : WuChaojie
 * @date : 2022/5/25 15:32
 */
public interface DailyTaskService {


    /**
     * 查询所有的任务数据(未完成)
     * @return
     */
    List<DailyTask> listTodoTask();

    /**
     * 根据日期查询已完成的任务
     * @param date
     * @return
     */
    List<DailyTask> listFinishTaskByDate(String date);

    /**
     * 根据日期分组获得所有已完成任务
     * @return
     */
    List<DailyTask> listFinishTask();

    /**
     * 新建任务
     * @param dailyTask
     * @return
     */
    Integer createTodoTask(DailyTask dailyTask);

    /**
     * 删除未完成任务
     * @param id
     * @return
     */
    Integer deleteTodoTask(Integer id);

    /**
     * 更新未完成任务
     * @param dailyTask
     * @return
     */
    Integer updateTodoTask(DailyTask dailyTask);

    /**
     * 更改任务状态
     * @param id
     * @return
     */
    Integer finishTodoTask(Integer id);
}
