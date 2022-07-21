package top.silentyears.freetime.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 时间工具类
 * @author : WuChaojie
 * @date : 2022/7/20 15:41
 */
public class TimeTool {

    /**
     * 获取今天的日期时间
     * @return
     */
    public static String getToday() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 0);
        String tomorrow = sf.format(c.getTime());
        return tomorrow;
    }
    /**
     * 获取昨天的日期时间
     * @return
     */
    public static String getTomorrow() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -1);
        String tomorrow = sf.format(c.getTime());
        return tomorrow;
    }

    /**
     * 获取上个月的日期时间
     * @return
     */
    public static String getLastMonth() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        String lastMonth = sf.format(c.getTime());
        return lastMonth;
    }

    /**
     * 获取去年的日期时间
     * @return
     */
    public static String getLastYear() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, -1);
        String lastYear = sf.format(c.getTime());
        return lastYear;
    }

}
