package com.pechpijit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = "MainActivity";
    String subText = "";
    String txtValue = "";
    String value1 = "";
    TextView main,sub;
    int mode = 0;
    String temp;
    boolean ass = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        main = (TextView) findViewById(R.id.Monitor_Main);
        sub = (TextView) findViewById(R.id.Monitor_Sub);

        sub.setText("0");

        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);

        findViewById(R.id.btnA).setOnClickListener(this);
        findViewById(R.id.btnS).setOnClickListener(this);
        findViewById(R.id.btnM).setOnClickListener(this);
        findViewById(R.id.btnD).setOnClickListener(this);

        findViewById(R.id.btnAss).setOnClickListener(this);
        findViewById(R.id.btnC).setOnClickListener(this);
        findViewById(R.id.btnDo).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if (!ass) {
                    subText += "0";
                    txtValue += "0";
                    sub.setText(subText);
                }
                break;
            case R.id.btn1:
                if (!ass) {
                    subText += "1";
                    txtValue += "1";
                    sub.setText(subText);
                }
                break;
            case R.id.btn2:
                if (!ass) {
                    subText += "2";
                    txtValue += "2";
                    sub.setText(subText);
                }
                break;
            case R.id.btn3:
                if (!ass) {
                    subText += "3";
                    txtValue += "3";
                    sub.setText(subText);
                }
                break;
            case R.id.btn4:
                if (!ass) {
                    subText += "4";
                    txtValue += "4";
                    sub.setText(subText);
                }
                break;
            case R.id.btn5:
                if (!ass) {
                    subText += "5";
                    txtValue += "5";
                    sub.setText(subText);
                }
                break;
            case R.id.btn6:
                if (!ass) {
                    subText += "6";
                    txtValue += "6";
                    sub.setText(subText);
                }
                break;
            case R.id.btn7:
                if (!ass) {
                    subText += "7";
                    txtValue += "7";
                    sub.setText(subText);
                }
                break;
            case R.id.btn8:
                if (!ass) {
                    subText += "8";
                    txtValue += "8";
                    sub.setText(subText);
                }
                break;
            case R.id.btn9:
                if (!ass) {
                    subText += "9";
                    txtValue += "9";
                    sub.setText(subText);
                }
                break;
            case R.id.btnA:
                if (!ass) {
                    if (!txtValue.isEmpty()) {
                        if (mode > 0) {

                        } else {
                            value1 = txtValue;
                            txtValue = "";
                            subText += " + ";
                            sub.setText(subText);
                            mode = 1;
                        }
                    }
                }
                break;
            case R.id.btnS:
                if (!ass) {
                    if (!txtValue.isEmpty()) {
                        if (mode > 0) {

                        } else {
                            value1 = txtValue;
                            txtValue = "";
                            subText += " - ";
                            sub.setText(subText);
                            mode = 2;
                        }
                    }
                }
                break;
            case R.id.btnM:
                if (!ass) {
                    if (!txtValue.isEmpty()) {
                        if (mode > 0) {

                        } else {
                            value1 = txtValue;
                            txtValue = "";
                            subText += " * ";
                            sub.setText(subText);
                            mode = 3;
                        }
                    }
                }
                break;
            case R.id.btnD:
                if (!ass) {
                    if (!txtValue.isEmpty()) {
                        if (mode > 0) {

                        } else {
                            value1 = txtValue;
                            txtValue = "";
                            subText += " /  ";
                            sub.setText(subText);
                            mode = 4;
                        }
                    }
                }
                break;
            case R.id.btnAss:
                if (!ass) {
                    ass = true;
                    switch (mode) {
                        case 1:
                            temp = String.valueOf(Double.parseDouble(value1) + Double.parseDouble(txtValue));
                            main.setText(subText + " = ");
                            sub.setText(temp.substring(0, temp.indexOf(".")));
                            break;
                        case 2:
                            temp = String.valueOf(Double.parseDouble(value1) - Double.parseDouble(txtValue));
                            main.setText(subText + " = ");
                            sub.setText(temp.substring(0, temp.indexOf(".")));
                            break;
                        case 3:
                            temp = String.valueOf(Double.parseDouble(value1) * Double.parseDouble(txtValue));
                            main.setText(subText + " = ");
                            sub.setText(temp.substring(0, temp.indexOf(".")));
                            break;
                        case 4:
                            temp = String.valueOf(Double.parseDouble(value1) / Double.parseDouble(txtValue));
                            main.setText(subText + " = ");
                            sub.setText(temp.substring(0, temp.indexOf(".")));
                            break;
                    }
                }
                break;
            case R.id.btnC:
                value1 = "";
                txtValue = "";
                subText = "";
                main.setText("");
                sub.setText("0");
                mode = 0;
                ass = false;
                break;
            case R.id.btnDo:
                if (txtValue.lastIndexOf(".") == -1) {
                    subText += ".";
                    txtValue += ".";
                    sub.setText(subText);
                }
                break;
        }
        Log.d(TAG, "value1 : " + value1 + " ,txtValue : " + txtValue + " ,subText : " + subText);
    }
}
