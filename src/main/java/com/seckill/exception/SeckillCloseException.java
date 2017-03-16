package com.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by liheng on 2017/3/16.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
