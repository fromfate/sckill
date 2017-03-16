package com.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by liheng on 2017/3/16.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
