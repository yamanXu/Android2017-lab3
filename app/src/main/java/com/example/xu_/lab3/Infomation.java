package com.example.xu_.lab3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu_ on 2017/10/22.
 */

public class Infomation{

    public Context context;

    public static List<itemInfo> product;
    public static void setProductInfo(){
        String [] Names = {
                "Enchated Forest",
                "Aria Milk",
                "Devondale Milk",
                "Kindle Oasis",
                "Waitrose 早餐麦片",
                "Mcvitie's 饼干",
                "Ferrero Rocher",
                "Maltesers",
                "Lindt",
                "Borggreve"
        };
        String [] Prices = {
                "¥5.00",
                "¥59.00",
                "¥79.00",
                "¥2399.00",
                "¥179.00",
                "¥14.90",
                "¥132.59",
                "¥141.43",
                "¥139.43",
                "¥28.90"
        };

        product = new ArrayList<>();
        int size = Names.length;
        for(int i=0; i<size; i++){
            itemInfo item = new itemInfo();
            item.name = Names[i];
            item.price = Prices[i];
            product.add(item);
        }
    }
}
