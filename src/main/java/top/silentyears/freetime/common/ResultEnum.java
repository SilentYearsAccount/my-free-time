package top.silentyears.freetime.common;

/**
 * 通用
 * @author : WuChaojie
 * @date : 2022/5/26 15:19
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1, "系统错误"),
    SUCCESS(0, "成功"),
    PARAMETER_ERROR(1, "参数错误"),
    SIGNATURE_ERROR(2, "签名错误"),
    SEND_ERROR(4,"发送失败"),
    REQUEST_METHOD_ERROR(5, "请求方式错误"),
    ;
    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取状态码
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 获取状态信息
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }
}
