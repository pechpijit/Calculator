package com.pechpijit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String TAG = "MainActivity";
    String subText = "";
    String txtValue = "";
    String txt = "";

    TextView main, sub;
    double[] value = new double[2];

    double value1 = 0;
    int index = 0;
    int m1 = 0;
    int m2 = 0;
    int m3 = 0;
    int m4 = 0;

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
                subText += "1";
                txtValue += "1";
                sub.setText(subText);
                break;
            case R.id.btn1:
                subText += "1";
                txtValue += "1";
                sub.setText(subText);
                break;
            case R.id.btn2:
                subText += "2";
                txtValue += "2";
                sub.setText(subText);
                break;
            case R.id.btn3:
                subText += "3";
                txtValue += "3";
                sub.setText(subText);
                break;
            case R.id.btn4:
                subText += "4";
                txtValue += "4";
                sub.setText(subText);
                break;
            case R.id.btn5:
                subText += "5";
                txtValue += "5";
                sub.setText(subText);
                break;
            case R.id.btn6:
                subText += "6";
                txtValue += "6";
                sub.setText(subText);
                break;
            case R.id.btn7:
                subText += "7";
                txtValue += "7";
                sub.setText(subText);
                break;
            case R.id.btn8:
                subText += "8";
                txtValue += "8";
                sub.setText(subText);
                break;
            case R.id.btn9:
                subText += "9";
                txtValue += "9";
                sub.setText(subText);
                break;
            case R.id.btnA:
                if (m2 == 1 || m3 == 1 || m4 == 1) {
                    m2 = m3 = m4 = 0;
                    m1 = 1;
                    sub.setText(subText.substring(0,subText.indexOf(" "))+" + ");
                } else {
                    if (m1 == 1) {

                    } else {
                        if (index < 1) {
                            value1 = Double.parseDouble(txtValue);
                            subText += " + ";
                            m1 = 1;
                            sub.setText(subText);
                            txtValue = "";
                            index++;
                        } else {
                            value1 = value1 + Double.parseDouble(txtValue);
                            String temp = String.valueOf(value1);
                            subText = temp.substring(0,temp.indexOf(".")) + " + ";
                            sub.setText(subText);
                            txtValue = "";
                        }
                    }

                }

                break;
            case R.id.btnS:
                if (index < 1) {
                    value1 = Double.parseDouble(txtValue);
                    subText += " - ";
                    sub.setText(subText);
                    txtValue = "";
                    index++;
                    m2 = 1;
                } else {
                    value1 = value1 - Double.parseDouble(txtValue);
                    String temp = String.valueOf(value1);
                    subText = temp.substring(0,temp.indexOf(".")) + " - ";
                    if (subText.equals("0 + ")) {
                        value1 = 0;
                        index = 0;
                        subText = "";
                        txtValue = "";
                        sub.setText("0");
                    } else {
                        sub.setText(subText);
                    }
                    txtValue = "";
                }
                break;
            case R.id.btnM:
                break;
            case R.id.btnD:
                break;
            case R.id.btnAss:
                break;
            case R.id.btnC:
                value1 = 0;
                index = 0;
                subText = "";
                txtValue = "";
                sub.setText("0");
                break;
            case R.id.btnDo:
                break;
        }
    }
}
