package com.example.administrator.customview.Utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.customview.R;

/**
 * Created by Administrator on 2017/5/9.
 */
/*
* 通过引入布局的方式，创建组合控件CustomView
* */
public class CustomView extends LinearLayout {
    String mtv1_text;
    String mtv2_text;
    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initData(context,attrs);



    }
    private void initData(Context context, AttributeSet attrs){
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.customview);
        View view = LayoutInflater.from(context).inflate(R.layout.view_layout, this);
        TextView tv1 = (TextView) view.findViewById(R.id.tv1);
        TextView tv2 = (TextView) view.findViewById(R.id.tv2);
        mtv1_text =  ta.getString(R.styleable.customview_tv1_text);
        mtv2_text = ta.getString(R.styleable.customview_tv2_text);

        tv1.setText(mtv1_text);
        tv2.setText(mtv2_text);
    }
}
