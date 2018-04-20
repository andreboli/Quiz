package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD

public class NinethQuestion extends AppCompatActivity {

=======
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NinethQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton correta;
    String nomeRecebido;

>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth_question);
<<<<<<< HEAD

        Button btnProxima = (Button)findViewById(R.id.btnNineth);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProxima = new Intent(NinethQuestion.this, TenthQuestion.class);
                startActivity(intentProxima);
            }
        });
    }
=======
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador9");
        nomeRecebido = value.getString("nome");

        correta = findViewById(R.id.rbCorreta);

        Button btnNext = (Button)findViewById(R.id.btnNineth);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correta.isChecked()){
                    countReceived += 1;
                }
                Intent nextQuestion = new Intent(NinethQuestion.this, TenthQuestion.class);
                nextQuestion.putExtra("contador10", countReceived);
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
