package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
=======
import android.widget.RadioButton;
>>>>>>> develop-casa
import android.widget.RadioGroup;

public class FirstQuestion extends AppCompatActivity {

<<<<<<< HEAD
=======
    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton correta;
    String nomeRecebido;

>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
<<<<<<< HEAD

        Button btnProxima = (Button)findViewById(R.id.btnFirst);
        RadioGroup rdGroup = (RadioGroup)findViewById(R.id.radioGroup);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent proximaPergunta = new Intent(FirstQuestion.this, SecondQuestion.class);
                startActivity(proximaPergunta);
            }
        });
    }
}
=======
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador");
        nomeRecebido = value.getString("nome");

        correta = findViewById(R.id.rbCorreta);

        Button btnNext = (Button)findViewById(R.id.btnFirst);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correta.isChecked()){
                    countReceived += 1;
                }
                Intent nextQuestion = new Intent(FirstQuestion.this, SecondQuestion.class);
                nextQuestion.putExtra("contador2", countReceived);
                nextQuestion.putExtra("nome", nomeRecebido.toString());
                startActivity(nextQuestion);
            }
        });
    }



    public View checkButton(View view){
        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);

        return radioButton;
    }
}

>>>>>>> develop-casa
