package com.zhouliaoyu.lifeinvirtual.vehicle;

/**
 * Created by zhouliaoyu on 2017/7/4.
 */

public interface vehicle {
    public void start();
    public moveTo(Station station);
    public void stop();
    public boolean isFull();
}
