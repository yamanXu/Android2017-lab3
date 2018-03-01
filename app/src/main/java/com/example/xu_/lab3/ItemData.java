package com.example.xu_.lab3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by xu_ on 2017/10/23.
 */

public class ItemData {
    public ArrayList<Map<String, Object>> data;
    public ArrayList<Integer> stared;
    public ArrayList<Integer> itemid;
    public ArrayList<Integer> imgid;
    String[] name = {"Enchated Forest", "Arla Milk", "Devondale Milk", "Kindle Oasis",
            "waitrose 早餐麦片", "Mcvitie's 饼干", "Ferrero Rocher", "Maltesers", "Lindt",
            "Borggreve"};
    String[] price = {"¥5.00", "¥59.00", "¥79.00", "¥2399.00", "¥179.00", "¥14.90",
            "¥132.59", "¥141.43", "¥139.43", "¥28.90"};
    String[] type = {"作者", "产地", "产地", "版本", "重量", "产地", "重量", "重量", "重量",
            "重量"};
    String[] info = {"Johanna Basford", "德国", "澳大利亚", "8GB", "2Kg", "英国", "300g",
            "118g", "249g", "640g"};
    String[] first = {"E", "A", "D", "K", "W", "M", "F", "M", "L", "B"};
    Integer[] resimg = {R.mipmap.enchated_forest, R.mipmap.arla, R.mipmap.devondale,
            R.mipmap.kindle, R.mipmap.waitrose, R.mipmap.mcvitie, R.mipmap.ferrero,
            R.mipmap.maltesers, R.mipmap.lindt, R.mipmap.borggreve};
}
