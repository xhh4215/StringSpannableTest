package com.example.xiaoheihei;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textViewId);
        //spannableString   spannableStringBuffer  的区别和string和stringbuffer的区别相同
        SpannableString spannableString = new SpannableString("好好学习，好好工作");
        ForegroundColorSpan span = new ForegroundColorSpan(Color.RED);//设置字体的颜色
        BackgroundColorSpan span1 = new BackgroundColorSpan(Color.YELLOW);//设置字体的北京颜色
        AbsoluteSizeSpan span2 = new AbsoluteSizeSpan(20);//设置字体的大小
        StyleSpan span3 = new StyleSpan(Typeface.ITALIC);//设置字体的样式
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
        drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());//图片替换文字
        ImageSpan span4 = new ImageSpan(drawable,ImageSpan.ALIGN_BASELINE);
        spannableString.setSpan(span,1,4, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        spannableString.setSpan(span1,2,6,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        spannableString.setSpan(span2,7,9,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        spannableString.setSpan(span3,0,9,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        spannableString.setSpan(span4,2,4,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        textView.setText(spannableString);

    }
}
