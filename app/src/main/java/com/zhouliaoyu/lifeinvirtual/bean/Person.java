package com.zhouliaoyu.lifeinvirtual.bean;

import com.zhouliaoyu.lifeinvirtual.dailylife.ICommons;
import com.zhouliaoyu.lifeinvirtual.drink.IDrink;
import com.zhouliaoyu.lifeinvirtual.food.IFood;
import com.zhouliaoyu.lifeinvirtual.meal.Meal;

/**
 * Created by zhouliaoyu on 2017/7/4.
 */

public abstract class Person implements ICommons {

    protected String name;
    protected byte gender;
    protected boolean isEatBreakfast;

    public static final byte GENDER_MALE = 0;
    public static final byte GENDER_FEMALE = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    @Override
    public void walk() {

    }

    @Override
    public void sleep(byte hours) {

    }

    @Override
    public void wakeUp() {
        isEatBreakfast = false;
    }
    @Override
    public void eat(IFood food) {

    }

    @Override
    public void drink(IDrink drink) {

    }

    @Override
    public void eatBreakfast(Meal meal) {
        isEatBreakfast = true;
    }

    @Override
    public void eatLunch(Meal meal) {

    }

    @Override
    public void eatSupper(Meal meal) {

    }
}
