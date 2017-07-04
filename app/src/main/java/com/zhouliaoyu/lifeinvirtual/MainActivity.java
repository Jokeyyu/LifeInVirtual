package com.zhouliaoyu.lifeinvirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhouliaoyu.lifeinvirtual.bean.Host;
import com.zhouliaoyu.lifeinvirtual.drink.Milk;
import com.zhouliaoyu.lifeinvirtual.food.Egg;
import com.zhouliaoyu.lifeinvirtual.meal.Meal;

public class MainActivity extends AppCompatActivity {

    private Host host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initValues() {
        host = Host.getInstance();
        host.wakeUp();
        Meal breakfast = new Meal();
        breakfast.add(new Milk());
        breakfast.add(new Egg());
        host.eatBreakfast(breakfast);
    }

    private void initViews() {

    }
}
