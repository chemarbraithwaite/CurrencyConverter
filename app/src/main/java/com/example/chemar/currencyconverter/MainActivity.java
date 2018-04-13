package com.example.chemar.currencyconverter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner ddlCurrencyFrom = (Spinner) findViewById(R.id.ddlFrom);
        final Spinner ddlCurrencyTo = (Spinner) findViewById(R.id.ddlTo);
        final ImageView flagFrom = (ImageView) findViewById(R.id.ivFrom);
        final ImageView flagTo = (ImageView) findViewById(R.id.ivTo);


        final Button btnBack = (Button) findViewById(R.id.btnBack);
        final Button btn0 = (Button) findViewById(R.id.btn0);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);
        final Button btn5 = (Button) findViewById(R.id.btn5);
        final Button btn6 = (Button) findViewById(R.id.btn6);
        final Button btn7 = (Button) findViewById(R.id.btn7);
        final Button btn8 = (Button) findViewById(R.id.btn8);
        final Button btn9 = (Button) findViewById(R.id.btn9);
        final Button btnDot = (Button) findViewById(R.id.btnDot);
        final Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        final Button btnSwitch = (Button) findViewById(R.id.btnSwitch);

        final TextView result = (TextView) findViewById(R.id.lblTextTo);
        final TextView currencyTo = (TextView) findViewById(R.id.lblCurrencyTo);
        final TextView currencyFrom = (TextView) findViewById(R.id.lblCurrencyFrom);

        input = (EditText) findViewById((R.id.txtFrom));

        input.setShowSoftInputOnFocus(false);




        ArrayAdapter<String> currenyOptions = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.currency));
        currenyOptions.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ddlCurrencyFrom.setAdapter(currenyOptions);
        ddlCurrencyTo.setAdapter(currenyOptions);

        ddlCurrencyFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        flagFrom.setImageResource(R.mipmap.jmd);
                        currencyFrom.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 1:
                        flagFrom.setImageResource(R.mipmap.usa);
                        currencyFrom.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 2:
                        flagFrom.setImageResource(R.mipmap.cad);
                        currencyFrom.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 3:
                        flagFrom.setImageResource(R.mipmap.gbp);
                        currencyFrom.setText("£");
                        btnSubmit.callOnClick();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ddlCurrencyTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        flagTo.setImageResource(R.mipmap.jmd);
                        currencyTo.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 1:
                        flagTo.setImageResource(R.mipmap.usa);
                        currencyTo.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 2:
                        flagTo.setImageResource(R.mipmap.cad);
                        currencyTo.setText("$");
                        btnSubmit.callOnClick();
                        break;
                    case 3:
                        flagTo.setImageResource(R.mipmap.gbp);
                        currencyTo.setText("£");
                        btnSubmit.callOnClick();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDigit("9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!input.getText().toString().contains("."))
                    if(input.getText().length() == 0)
                        addDigit("0.");
                    else
                        addDigit(".");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeDigit();
            }

            private void removeDigit() {

                if(input != null)
                    if(input.getText().length() > 0){
                        int endPos = input.getSelectionEnd();
                        int startPos = input.getSelectionStart();
                        if(startPos == endPos && startPos > 0)
                            input.setText(input.getText().delete(startPos - 1, endPos));
                        else
                            input.setText(input.getText().delete(startPos, endPos));

                        input.setSelection(startPos-1);
                    }



            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(input.getText().length()> 0)
                    try{

                        Double.parseDouble(input.getText().toString());

                        if(input != null)
                            if(input.getText().toString().length() > 0){

                            switch (ddlCurrencyFrom.getSelectedItemPosition()){
                                case 0:
                                    switch (ddlCurrencyTo.getSelectedItemPosition()){
                                        case 0:
                                            result.setText(input.getText());
                                            break;
                                        case 1:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.008) + "");
                                            break;
                                        case 2:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.01) + "");
                                            break;
                                        case 3:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.0057) + "");
                                            break;
                                    }
                                    break;
                                case 1:
                                    switch (ddlCurrencyTo.getSelectedItemPosition()){
                                        case 0:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 124.45) + "");
                                            break;
                                        case 1:
                                            result.setText(input.getText());
                                            break;
                                        case 2:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 1.28) + "");
                                            break;
                                        case 3:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.71) + "");
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (ddlCurrencyTo.getSelectedItemPosition()){
                                        case 0:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 97.33) + "");
                                            break;
                                        case 1:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.78) + "");
                                            break;
                                        case 2:
                                            result.setText(input.getText());
                                            break;
                                        case 3:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 0.55) + "");
                                            break;
                                    }
                                    break;
                                case 3:
                                    switch (ddlCurrencyTo.getSelectedItemPosition()){
                                        case 0:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 175.54 ) + "");
                                            break;
                                        case 1:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 1.41) + "");
                                            break;
                                        case 2:
                                            result.setText(String.format("%.2f",Float.parseFloat(input.getText().toString()) * 1.8) + "");
                                            break;
                                        case 3:
                                            result.setText(input.getText());
                                            break;
                                    }
                                    break;


                            }

                        }
                    }catch (Exception e){

                        Toast.makeText(getApplicationContext(), "Invalid number format.", Toast.LENGTH_LONG).show();

                    }

            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                    Double.parseDouble(input.getText().toString());
                    int from = ddlCurrencyFrom.getSelectedItemPosition();
                    ddlCurrencyFrom.setSelection(ddlCurrencyTo.getSelectedItemPosition());
                    ddlCurrencyTo.setSelection(from);

                }catch(Exception e){

                    Toast.makeText(getApplicationContext(), "Invalid number format.", Toast.LENGTH_LONG).show();
                }



            }
        });

        btnBack.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                input.setText("");
                return false;
            }
        });


        ddlCurrencyTo.setSelection(1);


    }

    private void addDigit(String digit){

        if(input.length() <= 14){
            if(input.getText().length() != 0)
                try{

                    Double.parseDouble(input.getText().toString());
                    int start = input.getSelectionStart();
                    int end = input.getSelectionEnd();

                    if (start == end) {
                        input.setText(input.getText().insert(input.getSelectionStart(), digit));
                        input.setSelection(start + digit.length());
                    }else{
                        input.setText(input.getText().delete(start, end));
                        input.setSelection(start);
                        input.setText(input.getText().insert(input.getSelectionStart(), digit));
                        input.setSelection(start + digit.length());

                }

                }catch(Exception e){

                    Toast.makeText(this, "Invalid number format.", Toast.LENGTH_LONG).show();

                }
            else
            {
                int start = input.getSelectionStart();
                input.setText(input.getText().insert(input.getSelectionStart(), digit));
                input.setSelection(start + digit.length());
            }







        }else{
            Toast.makeText(this, "Maximum number of digits (15) exceeded.", Toast.LENGTH_LONG).show();
        }
    }
}
