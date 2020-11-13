package com.example.homework0007.bean;

import com.example.homework0007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "华为路由Q2S", "华为路由A2", "华为随行WiFi 3（白色）", "华为路由AX3",
            "华为智能体脂秤（黑色）", "华为超级快充立式无线充电器（Max 40W）", "华为充电器SuperCharge","华为三脚架自拍杆 无线版（白色）"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "华为路由Q2S（1母1子套装）大户型首选路由 哪里信号不好插哪里 有插座就有WIFI 最多支持1拖15 子母路由 覆盖无忧",
            "华为路由A2（白色）多连不卡 一碰连网 上网保护 四核处理器 三频高速WIFI 手游加速",
            "华为随行WiFi 3（白色）",
            "【新品】华为路由AX3 凌霄双核Wi-Fi 6+ 3000Mbps无线连接 多穿一堵墙 上网保护 白色",
            "华为智能体脂秤（黑色） ",
            "华为超级快充立式无线充电器（Max 40W） ",
            "华为充电器SuperCharge快充版（Max 40W） ",
            "华为三脚架自拍杆 无线版（白色） "


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {599, 399, 299, 499, 169, 259,58,99};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.q2s_s, R.drawable.a2_s, R.drawable.wifia_s, R.drawable.ax2_s, R.drawable.c_s,
            R.drawable.chong_s, R.drawable.kuai_s, R.drawable.san_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.q2s, R.drawable.a2, R.drawable.wifia, R.drawable.ax2, R.drawable.c,
            R.drawable.chong, R.drawable.kuai, R.drawable.san

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
