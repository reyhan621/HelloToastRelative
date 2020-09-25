package com.example.hellotoastrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(this, "HELLO TOAST!", Toast.LENGTH_LONG);
        mCount = mCount-mCount;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount!= null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }

}