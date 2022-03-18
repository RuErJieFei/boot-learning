package com.yy;

/**
 * @author yy
 * @date 2022/3/8 9:45 下午
 */
public class SnowService {
    public long getSnow() {
        return new SnowflakeIdWorker(0, 0).nextId();
    }
}
