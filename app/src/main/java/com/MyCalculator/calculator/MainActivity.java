package com.MyCalculator.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.MyCalculator.calculator.R;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    AppCompatTextView PrimaryTxtView, SecondaryTxtView;
    AppCompatButton btnAllClear, btnClear, btnMod, btnDivide, btnEqual, btnSub, btnAdd, btnDot, btnMultiply;
    AppCompatButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("0");
                PrimaryTxtView.setText(temp);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("1");
                PrimaryTxtView.setText(temp);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("2");
                PrimaryTxtView.setText(temp);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("3");
                PrimaryTxtView.setText(temp);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("4");
                PrimaryTxtView.setText(temp);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("5");
                PrimaryTxtView.setText(temp);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("6");
                PrimaryTxtView.setText(temp);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("7");
                PrimaryTxtView.setText(temp);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("8");
                PrimaryTxtView.setText(temp);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();
                temp = temp.concat("9");
                PrimaryTxtView.setText(temp);
            }
        });

        btnAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrimaryTxtView.setText("");
                SecondaryTxtView.setText("");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null)
                    temp = PrimaryTxtView.getText().toString();

                if (!temp.isEmpty()) {
                    String temp2 = temp.substring(0, temp.length() - 1);
                    PrimaryTxtView.setText(temp2);
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat("%");
                PrimaryTxtView.setText(temp);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat("/");
                PrimaryTxtView.setText(temp);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat("+");
                PrimaryTxtView.setText(temp);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat("-");
                PrimaryTxtView.setText(temp);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat("x");
                PrimaryTxtView.setText(temp);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null){
                    temp = PrimaryTxtView.getText().toString();
                }
                temp = temp.concat(".");
                PrimaryTxtView.setText(temp);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expression = "";

                if (PrimaryTxtView != null && PrimaryTxtView.getText() != null) {
                    expression = PrimaryTxtView.getText().toString();
                    expression = expression.replace("x", "*");
                }
                else {
                    return;
                }

                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("rhino");

                try {
                    Object result = engine.eval(expression);

                    if (Math.abs((double) result) > 1e8 || Math.abs((double) result) < 1e-7 && (double) result != 0) {
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        result = df.format(result);
                    } else if ((double) result % 1 == 0 ){
                        result = String.format(Locale.US, "%.0f", result);
                    }
                    else {
                        result = String.format(Locale.US, "%.4f", result);
                    }

                    PrimaryTxtView.setText(result.toString());
                    SecondaryTxtView.setText(expression);
                } catch (ScriptException e) {
                    Toast.makeText(MainActivity.this, "Invalid Expression", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    private void init(){
        PrimaryTxtView = findViewById(R.id.PrimaryTxtView);
        SecondaryTxtView = findViewById(R.id.SecondaryTxtView);

        btnAllClear = findViewById(R.id.btnAllClear);
        btnClear = findViewById(R.id.btnClear);
        btnMod = findViewById(R.id.btnMod);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
    }
}