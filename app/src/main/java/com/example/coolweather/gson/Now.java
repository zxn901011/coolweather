package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zxn on 2017-3-17.
 */
public class Now {
    @SerializedName("tmp")
    public String temperatrue;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
