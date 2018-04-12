package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class FirstQuestion extends AppCompatActivity {

    int count;
    TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        int countRecebido;
        Intent telaAtual = getIntent();
        Bundle valor = telaAtual.getExtras();



        
        count = valor.getInt("contador") + 1;

        teste = (TextView)findViewById(R.id.test);
        teste.setText(String.valueOf(count));


        Button btnProxima = (Button)findViewById(R.id.btnFirst);
        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximaPergunta = new Intent(FirstQuestion.this, SecondQuestion.class);
                startActivity(proximaPergunta);


            }
        });
    }
}
