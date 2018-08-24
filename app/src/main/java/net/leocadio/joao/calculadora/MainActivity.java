package net.leocadio.joao.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Aplicações Mobile
 * Joao Leocadio - TADS 5 Semestre
 */

public class MainActivity extends Activity {

    private Button adicao, subtracao, multiplicacao, divisao;
    private TextView resultado;
    private EditText value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClear();
    }

    private void init() {

        adicao = (Button)findViewById(R.id.adicao);
        subtracao = (Button)findViewById(R.id.subtracao);
        multiplicacao = (Button)findViewById(R.id.multiplicacao);
        divisao = (Button)findViewById(R.id.divisao);

        value1 = (EditText)findViewById(R.id.value1);
        value2 = (EditText)findViewById(R.id.value2);

        resultado = (TextView)findViewById(R.id.resultado);
    }

    public void onClick(View view)
    {
        String num1 = value1.getText().toString();
        String num2 = value2.getText().toString();

        if (num1.length() != 0 && num2.length() != 0) {

            switch (view.getId())
            {
                case R.id.adicao:
                    float add = (Float.parseFloat(num1) + Float.parseFloat(num2));
                    resultado.setText(String.valueOf(add));
                    onClear();
                    break;

                case R.id.subtracao:
                    float sub = (Float.parseFloat(num1) - Float.parseFloat(num2));
                    resultado.setText(String.valueOf(sub));
                    onClear();
                    break;

                case R.id.multiplicacao:
                    float multi = (Float.parseFloat(num1) * Float.parseFloat(num2));
                    resultado.setText(String.valueOf(multi));
                    onClear();
                    break;

                case R.id.divisao:
                    try {
                        float div = (Float.parseFloat(num1) / Float.parseFloat(num2));
                        resultado.setText(String.valueOf(div));
                    } catch (Exception e) {
                        resultado.setText("Divisao invalida.");
                    }
                    onClear();
                    break;
            }
        } else {
            resultado.setText("Entre com os valores.");
        }
    }

    public void onClear() {
        value1.setText("");
        value2.setText("");
    }
}
