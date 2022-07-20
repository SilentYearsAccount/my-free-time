package top.silentyears.freetime.common;

/**
 * 通用工具类
 * @author : WuChaojie
 * @date : 2022/5/26 15:20
 */
public class ResultUtil {

    /**
     * 返回成功状态带数据
     *
     * @param object
     * @return
     */
    public static HttpResult success(Object object) {
        HttpResult result = new HttpResult();
        result.setData(object);
        result.setErrorCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMsg());
        return result;
    }

    /**
     * 返回成功状态不带数据
     *
     * @return
     */
    public static HttpResult success() {
        return success(null);
    }

    /**
     * 返回错误状态 传入状态枚举
     *
     * @param resultEnum
     * @return
     */
    public static HttpResult error(ResultEnum resultEnum) {
        HttpResult result = new HttpResult();
        result.setErrorCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMsg());
        return result;
    }

    /**
     * 根据状态码和错误信息 返回错误实体
     *
     * @param code
     * @param msg
     * @return
     */
    public static HttpResult error(Integer code, String msg) {
        HttpResult result = new HttpResult();
        result.setErrorCode(code);
        result.setMessage(msg);
        return result;
    }

    /**
     * 返还带数据的错误状态
     *
     * @param resultEnum
     * @param object
     * @return
     */
    public static HttpResult error(ResultEnum resultEnum, Object object) {
        HttpResult result = new HttpResult();
        result.setErrorCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMsg());
        result.setData(object);
        return result;
    }
}
