package com.zhouliaoyu.lifeinvirtual.meal;

import android.util.Log;

import com.zhouliaoyu.lifeinvirtual.common.IEatable;

import java.util.ArrayList;

/**
 * Created by zhouliaoyu on 2017/7/4.
 */

public class Meal {
    private ArrayList<IEatable> meal;

    public Meal() {
        meal = new ArrayList<IEatable>();
    }

    public void add(IEatable eatable) {
        meal.add(eatable);
    }

    public void remove(IEatable eatable) {
        meal.remove(eatable);
    }
    public void clear() {
        meal.clear();
    }

    public ArrayList<IEatable> getMeal() {
        return meal;
    }
}
