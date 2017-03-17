package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zxn on 2017-3-17.
 */
public class ForeCast {
    public String date;

    @SerializedName("tmp")
    public Temperatrue temperatrue;

    @SerializedName("cond")
    public More more;

    public class Temperatrue{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
