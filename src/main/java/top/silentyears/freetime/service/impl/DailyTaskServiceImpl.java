package top.silentyears.freetime.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.silentyears.freetime.entity.DailyTask;
import top.silentyears.freetime.mapper.DailyTaskMapper;
import top.silentyears.freetime.service.DailyTaskService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @author : WuChaojie
 * @date : 2022/5/25 15:32
 */
@Service
public class DailyTaskServiceImpl implements DailyTaskService {
    @Resource
    private DailyTaskMapper dailyTaskMapper;


    @Override
    public List<DailyTask> listTodoTask() {
        return dailyTaskMapper.listTodoTask();
    }

    @Override
    public List<DailyTask> listFinishTaskByDate(String date) {
        return dailyTaskMapper.listFinishTaskByDate(date);
    }

    @Override
    public List<DailyTask> listFinishTask() {
        return dailyTaskMapper.listFinishTask();
    }

    @Override
    public Integer createTodoTask(DailyTask dailyTask) {
        return dailyTaskMapper.createTodoTask(dailyTask);
    }

    @Override
    public Integer deleteTodoTask(Integer id) {
        return dailyTaskMapper.deleteTodoTask(id);
    }

    @Override
    public Integer updateTodoTask(DailyTask dailyTask) {
        return dailyTaskMapper.updateTodoTask(dailyTask);
    }

    @Override
    public Integer finishTodoTask(Integer id) {
        return dailyTaskMapper.finishTodoTask(id);
    }
}
