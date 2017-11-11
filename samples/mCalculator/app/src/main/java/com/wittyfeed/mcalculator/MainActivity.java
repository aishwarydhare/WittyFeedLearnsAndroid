package com.wittyfeed.mcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by aishwarydhare on 09/11/17.
 */

public class MainActivity extends Activity {

    final static String TAG = "mCal";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"MainAct: onCreate");
        setContentView(R.layout.activity_main);

        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"add btn pressed");
                EditText op1_et = (EditText) findViewById(R.id.op1_et);
                EditText op2_et = (EditText) findViewById(R.id.op2_et);
                String result = ""+ (Integer.parseInt(""+op1_et.getText()) + Integer.parseInt(""+op2_et.getText()));
                TextView result_tv = (TextView) findViewById(R.id.result_tv);
                result_tv.setText("Result: " + result);
            }
        });

        findViewById(R.id.subtract_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"subtract btn pressed");
                EditText op1_et = (EditText) findViewById(R.id.op1_et);
                EditText op2_et = (EditText) findViewById(R.id.op2_et);
                String result = ""+ (Integer.parseInt(""+op1_et.getText()) - Integer.parseInt(""+op2_et.getText())) ;
                TextView result_tv = (TextView) findViewById(R.id.result_tv);
                result_tv.setText("Result: " + result);

            }
        });

        findViewById(R.id.multiply_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"multiply btn pressed");
                EditText op1_et = (EditText) findViewById(R.id.op1_et);
                EditText op2_et = (EditText) findViewById(R.id.op2_et);
                String result = ""+ Integer.parseInt(""+op1_et.getText()) * Integer.parseInt(""+op2_et.getText());
                TextView result_tv = (TextView) findViewById(R.id.result_tv);
                result_tv.setText("Result: " + result);

            }
        });

        findViewById(R.id.divide_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"divide btn pressed");
                EditText op1_et = (EditText) findViewById(R.id.op1_et);
                EditText op2_et = (EditText) findViewById(R.id.op2_et);
                String result = ""+ Integer.parseInt(""+op1_et.getText()) / Integer.parseInt(""+op2_et.getText());
                TextView result_tv = (TextView) findViewById(R.id.result_tv);
                result_tv.setText("Result: " + result);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"MainAct: onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"MainAct: onRestart");
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
        Log.d(TAG,"MainAct: onStateNotSaved");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainAct: onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG,"MainAct: onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainAct: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainAct: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainAct: onDestroy");
    }
}
