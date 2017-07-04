package com.zhouliaoyu.lifeinvirtual.dailylife;

import com.zhouliaoyu.lifeinvirtual.drink.IDrink;
import com.zhouliaoyu.lifeinvirtual.food.IFood;
import com.zhouliaoyu.lifeinvirtual.meal.Meal;

/**
 * Created by zhouliaoyu on 2017/7/4.
 */

public interface ICommons {
    public void walk();
    public void eat(IFood food);
    public void drink(IDrink drink);
    public void sleep(byte hours);
    public void wakeUp();
    public void eatBreakfast(Meal meal);
    public void eatSupper(Meal meal);
    public void eatLunch(Meal meal);
}
