package top.silentyears.freetime.constant;

/**
 * 定时任务 corn表达式
 * @author : WuChaojie
 * @date : 2022/7/18 13:59
 */
public interface CornConstant {

    /**
     * 每天09:00:00
     */
    String DAILY_08_00_00 = "0 0 8 * * *";

    /**
     * 每天23:00:00
     */
    String DAILY_23_00_00 = "0 0 23 * * *";

    /**
     * 每月1号的08:00:00
     */
    String MONTH_01_08_00_00 = "0 0 8 1 * *";


    String test = "0/30 * * * * *";
}
