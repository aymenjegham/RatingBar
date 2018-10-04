package com.example.asus.ratingbar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarActivity extends AppCompatActivity {

    TextView ratingtv;
    RatingBar ratingBar;
    static Context cxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        ratingtv  = (TextView)findViewById(R.id.ratingbar_tv);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar_rb);

        cxt = getApplicationContext();

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                ratingtv.setText(String.valueOf(rating));
                Toast.makeText(RatingBarActivity.this, String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();

            }
        });

    }
    public static Context getContext() {

        return cxt;
    }

    public void setContext(Context mContext) {
        this.cxt = mContext;
    }


}
