package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondQuestion extends AppCompatActivity {

    int count;
    TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        int countRecebido;
        Intent telaAtual = getIntent();
        Bundle valor = telaAtual.getExtras();

        teste = (TextView)findViewById(R.id.test);
        teste.setText(String.valueOf(count));
        count = valor.getInt("contador2");

        teste = (TextView)findViewById(R.id.test);
        teste.setText(String.valueOf(count));

        Button btnProxima = findViewById(R.id.btnSecond);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximaPergunta = new Intent(SecondQuestion.this, ThirdQuestion.class);
                startActivity(proximaPergunta);
            }
        });
    }
}
