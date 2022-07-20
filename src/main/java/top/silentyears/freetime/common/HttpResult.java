package top.silentyears.freetime.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回
 * @author : WuChaojie
 * @date : 2022/5/26 15:12
 */
@Data
public class HttpResult<T> implements Serializable {
    private static final long serialVersionUID = -4423326975924060605L;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;
}
