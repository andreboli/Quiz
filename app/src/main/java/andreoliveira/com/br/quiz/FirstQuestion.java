package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstQuestion extends AppCompatActivity {

    int CountReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        Intent telaAtual = getIntent();
        Bundle valor = telaAtual.getExtras();
        CountReceived = valor.getInt("contador");


        Button btnNext = (Button)findViewById(R.id.btnFirst);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximaPergunta = new Intent(FirstQuestion.this, SecondQuestion.class);
                proximaPergunta.putExtra("contador2", CountReceived);
                startActivity(proximaPergunta);
            }
        });
    }
}


  /*  TextView teste;*/

/*

    RadioGroup rg = findViewById(R.id.radioGroup);

    RadioButton rbutton1 = findViewById(R.id.rb1);
    RadioButton rbutton2 = findViewById(R.id.rb2);
    RadioButton rbutton3 = findViewById(R.id.rbCorreta);
    RadioButton rbutton4 = findViewById(R.id.rb4);
*/

/* teste = (TextView)findViewById(R.id.test);
        teste.setText(String.valueOf(CountReceived));*/
