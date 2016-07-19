package com.databasetest1;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by ASUS on 2016/7/19.
 */
public class ValleyRequest {

    private RequestQueue mRequestQueue = null;

    public ValleyRequest(RequestQueue mRequestQueue){
        this.mRequestQueue = mRequestQueue;
    }

    // GET请求
    public void StringRequest1(String address) {

        StringRequest stringRequest = new StringRequest(address, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.d("ValleyRequest", s);
                JsonBean jsonBean = new Gson().fromJson(s,JsonBean.class);
                Log.d("ValleyRequest",jsonBean.getError_code() + "");

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.d("ValleyRequest", volleyError.getMessage(), volleyError);
            }
        });
        mRequestQueue.add(stringRequest);
    }
    // POST请求
   public void StringRequest2(String address, final String admin, final String password) {
       StringRequest stringRequest = new StringRequest(Request.Method.POST, address, new Response.Listener<String>() {
           @Override
           public void onResponse(String s) {

           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError volleyError) {

           }
       }) {
           protected Map<String, String> getParams() throws AuthFailureError {
               Map<String, String> map = new HashMap<>();
               map.put("admin", admin);
               map.put("password", password);
               return map;
           }
       };
       mRequestQueue.add(stringRequest);
   }




}
