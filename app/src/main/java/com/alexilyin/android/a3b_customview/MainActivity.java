package com.alexilyin.android.a3b_customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnNew;
    ItemView itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();

        itemView = (ItemView) findViewById(R.id.itemView);
        btnNew = (Button) findViewById(R.id.buttonNew);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int item = random.nextInt(Data.image.length);
                int pos = random.nextInt(1000);
                int neg = random.nextInt(1000);

                itemView.setData(Data.title[item], Data.image[item], pos, neg);
            }
        });

        btnNew.callOnClick();
    }
}
