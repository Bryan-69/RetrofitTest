package com.example.retrofittest;

import android.util.Log;

import java.util.List;

public class Translation {
    public static final String TAG = "Translation";
    private String status;
    private String info;
    private String infocode;
    private String count;
    private class suggestion{
        private List<String> keywords;
        private List<String> cities;
    }
    private List<message> districts;
    private class message{
        private String citycode;
        private String adcode;
        private String name;
        private String polyline;
        private String center;
        private String level;
        private List<String> districts_child;
    }
    public void show(){
        if(districts.isEmpty()){
            Log.e(TAG,"Error : wrong response");
        }
        String center_show = districts.get(0).center;
        String polyline_show = districts.get(0).polyline;
        Log.d(TAG,"status -> "+status);
        Log.d(TAG,"info -> "+info+"\n"+"infocode -> "+infocode);
        Log.d(TAG,"center -> " + center_show);
        Log.d(TAG,"polyline -> " + polyline_show);
    }

}
