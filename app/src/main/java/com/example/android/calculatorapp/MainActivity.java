package com.example.android.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double mResult;
    double mVal1;
    double mVal2;
    String mOperand;
    boolean mOpSet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void butAdd(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.result);
        TextView textView3 = (TextView) findViewById(R.id.operand);
        textView3.setText("+");
        if(mOpSet == false){
            if(temp != "") {
                mVal1 = Double.parseDouble(temp);
                mOperand = "+";
                textView.setText("");
                mOpSet = true;
            }else{
                Toast.makeText(this, "No Numbers Entered", Toast.LENGTH_SHORT).show();
            }
        }else{
            textView.setText("");
            mVal2 = Double.parseDouble(temp);
            if(mOperand == "-"){
                mResult = mVal1 - mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if (mOperand == "+"){
                mResult = mVal1 + mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "*"){
                mResult = mVal1 * mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "/"){
                if (mVal2 != 0) {
                    mResult = mVal1 / mVal2;
                    textView2.setText(String.valueOf(mResult));
                }
            }else{

            }
            mVal1 = mResult;
            mOperand = "+";
        }
    }

    public void butMin(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.result);
        TextView textView3 = (TextView) findViewById(R.id.operand);
        textView3.setText("-");
        if(mOpSet == false){
            if(temp != "") {
                mVal1 = Double.parseDouble(temp);
                mOperand = "-";
                textView.setText("");
                mOpSet = true;
            }else{
                Toast.makeText(this, "No Numbers Entered", Toast.LENGTH_SHORT).show();
            }
        }else{
            textView.setText("");
            mVal2 = Double.parseDouble(temp);
            if(mOperand == "-"){
                mResult = mVal1 - mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if (mOperand == "+"){
                mResult = mVal1 + mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "*"){
                mResult = mVal1 * mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "/"){
                if (mVal2 != 0) {
                    mResult = mVal1 / mVal2;
                    textView2.setText(String.valueOf(mResult));
                }
            }else{

            }
            mVal1 = mResult;
            mOperand = "-";
        }
    }
    public void butMul(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.result);
        TextView textView3 = (TextView) findViewById(R.id.operand);
        textView3.setText("*");
        if(mOpSet == false){
            if(temp != "") {
                mVal1 = Double.parseDouble(temp);
                mOperand = "*";
                textView.setText("");
                mOpSet = true;
            }else{
                Toast.makeText(this, "No Numbers Entered", Toast.LENGTH_SHORT).show();
            }
        }else{
            textView.setText("");
            mVal2 = Double.parseDouble(temp);
            if(mOperand == "-"){
                mResult = mVal1 - mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if (mOperand == "+"){
                mResult = mVal1 + mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "*"){
                mResult = mVal1 * mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "/"){
                if (mVal2 != 0) {
                    mResult = mVal1 / mVal2;
                    textView2.setText(String.valueOf(mResult));
                }
            }else{

            }
            mVal1 = mResult;
            mOperand = "*";
        }
    }
    public void butDiv(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.result);
        TextView textView3 = (TextView) findViewById(R.id.operand);
        textView3.setText("/");
        if(mOpSet == false){
            if(temp != "") {
                mVal1 = Double.parseDouble(temp);
                mOperand = "/";
                textView.setText("");
                mOpSet = true;
            }else{
                Toast.makeText(this, "No Numbers Entered", Toast.LENGTH_SHORT).show();
            }
        }else{
            textView.setText("");
            mVal2 = Double.parseDouble(temp);
            if(mOperand == "-"){
                mResult = mVal1 - mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if (mOperand == "+"){
                mResult = mVal1 + mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "*"){
                mResult = mVal1 * mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "/"){
                if (mVal2 != 0) {
                    mResult = mVal1 / mVal2;
                    textView2.setText(String.valueOf(mResult));
                }
            }else{

            }
            mVal1 = mResult;
            mOperand = "/";
        }
    }

    public void butEqu(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        TextView textView2 = (TextView) findViewById(R.id.result);
        TextView textView3 = (TextView) findViewById(R.id.operand);
        textView3.setText("=");
        if(mOpSet == true){
            if(temp != "") {
                mVal2 = Double.parseDouble(temp);
            }else{
                mVal2 = 0.0;
            }
            if(mOperand == "-"){
                mResult = mVal1 - mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if (mOperand == "+"){
                mResult = mVal1 + mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "*"){
                mResult = mVal1 * mVal2;
                textView2.setText(String.valueOf(mResult));
            }else if(mOperand == "/"){
                if (mVal2 != 0) {
                    mResult = mVal1 / mVal2;
                    textView2.setText(String.valueOf(mResult));
                }
            }else{

            }
            textView.setText("");
            mVal1 = mResult;
            mOpSet = false;
        }

    }


    public void butClr(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        textView.setText("");
        TextView textView2 = (TextView) findViewById(R.id.result);
        textView2.setText("");
        mVal1 = 0;
        mVal2 = 0;
        TextView textView4 = (TextView) findViewById(R.id.operand);
        textView4.setText("");
    }

    public void butDot (View v) {
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        String sdot = ".";
        char dot = sdot.charAt(0);
        boolean Dpre = false;
        int i = 0;
        while(Dpre == false && i < temp.length()){
            char fromWord = temp.charAt(i);
            if(fromWord == dot) {
                Dpre = true;
            }
            i++;
        }
        if(Dpre==false) {
            append(".");
        }
    }

    public void but0(View v){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();

        if(temp != "") {
            append("0");
        }else{

        }
    }

    public void but1 (View v) {
        append("1");
    }

    public void but2 (View v) {
        append("2");
    }

    public void but3 (View v) {
        append("3");
    }

    public void but4 (View v) {
        append("4");
    }

    public void but5 (View v) {
        append("5");
    }

    public void but6 (View v) {
        append("6");
    }

    public void but7 (View v) {
        append("7");
    }

    public void but8 (View v) {
        append("8");
    }

    public void but9 (View v) {
        append("9");
    }



    public void append(String number){
        TextView textView = (TextView) findViewById(R.id.display);
        String temp = textView.getText().toString();
        temp+=number;
        textView.setText(temp);
    }

}
