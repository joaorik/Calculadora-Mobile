package net.leocadio.joao.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText v1, v2;
    private TextView operador;
    private Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText)findViewById(R.id.value1);
        v2 = (EditText)findViewById(R.id.value2);
        operador = (TextView)findViewById(R.id.operator);

        v1.setText("");
        v2.setText("");
        operador.setText("");
    }


    public void onResult()
    {
        if (operador.getText() == "/") {
            double v11 = Double.parseDouble("" + v1);
            double v22 = Double.parseDouble("" + v2);
            divisao(v11, v22);
        }

        if (operador.getText() == "+") {
            double v11 = Double.parseDouble("" + v1);
            double v22 = Double.parseDouble("" + v2);
            adisao(v11, v22);
        }

        if (operador.getText() == "*") {
            double v11 = Double.parseDouble("" + v1);
            double v22 = Double.parseDouble("" + v2);
            multiplicacao(v11, v22);
        }

        if (operador.getText() == "-") {
            double v11 = Double.parseDouble("" + v1);
            double v22 = Double.parseDouble("" + v2);
            subtracao(v11, v22);
        }
    }

    public Double divisao(double v1, double v2) {
        return v1 / v2;
    }

    public Double adisao(double v1, double v2) {
        return v1 + v2;
    }

    public Double multiplicacao(double v1, double v2) {
        return v1 * v2;
    }

    public Double subtracao(double v1, double v2) {
        return v1 - v2;
    }

    public void onOperator(View view) {

        switch (view.getId())
        {
            case R.id.adicao:
                operador.setText("+");
                break;

            case R.id.subtracao:
                operador.setText("-");
                break;

            case R.id.multiplicacao:
                operador.setText("*");
                break;

            case R.id.divisao:
                operador.setText("/");
                break;

            default:
                operador.setText("");
                break;
        }
    }

    public void onClear(View view) {
        switch (view.getId())
        {
            case R.id.clear:
                v1.setText("");
                v2.setText("");
                operador.setText("");
                break;

            default:
                break;
        }
    }
}
