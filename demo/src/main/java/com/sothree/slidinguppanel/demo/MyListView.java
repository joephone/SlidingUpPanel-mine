package com.sothree.slidinguppanel.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/5/26.
 */
public class MyListView extends ListView{
    private  String TAG = "MyListView";
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,"--onInterceptTouchEvent--B");
        return  false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e(TAG,"--onTouchEvent--B");

        Log.e(TAG,"event B:"+super.onTouchEvent(ev));
        return super.onTouchEvent(ev);
    }

}
