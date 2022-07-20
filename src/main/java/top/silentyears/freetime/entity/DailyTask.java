package top.silentyears.freetime.entity;

import lombok.Data;

/**
 * 每日任务实体类
 * @author : WuChaojie
 * @date : 2022/5/25 15:28
 */
@Data
public class DailyTask {

    /**
     * id
     */
    private Integer id;

    /**
     * 任务信息
     */
    private String taskInfo;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 完成时间
     */
    private String finishTime;

    /**
     * 是否完成 0：未完成 1：已完成
     */
    private Boolean complete;
}
