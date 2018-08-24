package net.leocadio.joao.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText v1, v2;
    private TextView operator;
    private Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText)findViewById(R.id.value1);
        v2 = (EditText)findViewById(R.id.value2);
        operator = (TextView)findViewById(R.id.operator);

        v1.setText("");
        v2.setText("");
        operator.setText("");
    }


    public void onValueOne(View view) {

        switch (view.getId())
        {
            case R.id.num0:
                v1.setText(v1.getText() + "0");
                break;

            case R.id.num1:
                v1.setText(v1.getText() + "1");
                break;

            case R.id.num2:
                v1.setText(v1.getText() + "2");
                break;

            case R.id.num3:
                v1.setText(v1.getText() + "3");
                break;

            case R.id.num4:
                v1.setText(v1.getText() + "4");
                break;

            case R.id.num5:
                v1.setText(v1.getText() + "5");
                break;

            case R.id.num6:
                v1.setText(v1.getText() + "6");
                break;

            case R.id.num7:
                v1.setText(v1.getText() + "7");
                break;

            case R.id.num8:
                v1.setText(v1.getText() + "8");
                break;

            case R.id.num9:
                v1.setText(v1.getText() + "9");
                break;
        }
    }

    public void onValueTwo(View view)
    {
        switch (view.getId())
        {
            case R.id.num0:
                v2.setText(v2.getText() + "0");
                break;

            case R.id.num1:
                v2.setText(v2.getText() + "1");
                break;

            case R.id.num2:
                v2.setText(v2.getText() + "2");
                break;

            case R.id.num3:
                v2.setText(v2.getText() + "3");
                break;

            case R.id.num4:
                v2.setText(v2.getText() + "4");
                break;

            case R.id.num5:
                v2.setText(v2.getText() + "5");
                break;

            case R.id.num6:
                v2.setText(v2.getText() + "6");
                break;

            case R.id.num7:
                v2.setText(v2.getText() + "7");
                break;

            case R.id.num8:
                v2.setText(v2.getText() + "8");
                break;

            case R.id.num9:
                v2.setText(v2.getText() + "9");
                break;
        }
    }

    public void onOperator(View view) {

        switch (view.getId())
        {
            case R.id.adicao:
                operator.setText("+");
                break;

            case R.id.subtracao:
                operator.setText("-");
                break;

            case R.id.multiplicacao:
                operator.setText("*");
                break;

            case R.id.divisao:
                operator.setText("/");
                break;

            default:
                operator.setText("");
                break;
        }
    }

    public void onClear(View view) {
        switch (view.getId())
        {
            case R.id.clear:
                v1.setText("");
                v2.setText("");
                operator.setText("");
                break;

            default:
                break;
        }
    }
}
