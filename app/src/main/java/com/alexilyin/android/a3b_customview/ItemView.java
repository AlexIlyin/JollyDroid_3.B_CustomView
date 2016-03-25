package com.alexilyin.android.a3b_customview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by user on 25.03.16.
 */
public class ItemView extends RelativeLayout {

    TextView title;
    ImageView preview;
    TextView ratingPositive;
    TextView ratingNegative;

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflate(context, R.layout.item_view, this);

        title = (TextView) findViewById(R.id.item_view_title);
        preview = (ImageView) findViewById(R.id.item_view_preview);
        ratingPositive = (TextView) findViewById(R.id.item_view_positive_text);
        ratingNegative = (TextView) findViewById(R.id.item_view_negative_text);
    }


    public void setData(String title, int imageResource, Integer positive, Integer negative) {
        this.title.setText(title);
        this.preview.setImageDrawable(ContextCompat.getDrawable(getContext(), imageResource));
        this.ratingPositive.setText(positive.toString());
        this.ratingNegative.setText(negative.toString());
    }
}
