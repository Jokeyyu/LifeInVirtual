package com.zhouliaoyu.lifeinvirtual.bean;

/**
 * Created by zhouliaoyu on 2017/7/4.
 */

public class Host extends Man {
    private static final String HOST_NAME = "James";
    private static Host host;
    private Host() {
        super();
        this.name = HOST_NAME;
    }
    public static Host getInstance(){
        if(host == null) {
            host = new Host();
        }
        return host;
    }


}
