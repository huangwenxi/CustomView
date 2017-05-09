package com.example.administrator.customview.Utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.customview.R;

/**
 * Created by Administrator on 2017/5/9.
 */

public class CusomView2 extends LinearLayout {
    private String mtv1_text;
    private String mtv2_text;
    public CusomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.customview);
        TextView tv1 = new TextView(context);
        TextView tv2 = new TextView(context);
        LinearLayout ll = new LinearLayout(context);
        LinearLayout.LayoutParams ll_param1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams ll_param2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams ll_param3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mtv1_text = ta.getString(R.styleable.customview_tv1_text);
        mtv2_text = ta.getString(R.styleable.customview_tv2_text);
        tv1.setText(mtv1_text);
        tv2.setText(mtv2_text);

        ll.addView(tv1, ll_param1);
        ll.addView(tv2, ll_param2);
        addView(ll, ll_param3);


    }
}
