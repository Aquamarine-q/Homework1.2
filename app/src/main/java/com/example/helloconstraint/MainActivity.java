package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(mCount);
        }

        Button zeroButton = findViewById(R.id.zero_button);
        zeroButton.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.teal_200));

        if ((Integer.parseInt(mShowCount.getText().toString())) % 2 == 0) {
            view.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.teal_700));
        } else {
            view.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.purple_200));
        }

    }

    public void makeZero(View view) {
        mCount = 0;
        mShowCount.setText("0");
        view.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.gray));
    }
}