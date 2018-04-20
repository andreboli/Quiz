package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD

public class FifthQuestion extends AppCompatActivity {

=======
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FifthQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton correta;
    String nomeRecebido;


>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);
<<<<<<< HEAD

        Button btnProxima = (Button)findViewById(R.id.btnFifth);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProxima = new Intent(FifthQuestion.this, SixthQuestion.class);
                startActivity(intentProxima);
            }
        });
    }
=======
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador5");
        nomeRecebido = value.getString("nome");

        correta = findViewById(R.id.rbCorreta);

        Button btnNext = (Button)findViewById(R.id.btnFifth);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correta.isChecked()){
                    countReceived += 1;
                }
                Intent nextQuestion = new Intent(FifthQuestion.this, SixthQuestion.class);
                nextQuestion.putExtra("contador6", countReceived);
                nextQuestion.putExtra("nome", nomeRecebido);
                startActivity(nextQuestion);
            }
        });
    }

    public View checkButton(View view){
        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);

        return radioButton;
    }
>>>>>>> develop-casa
}
