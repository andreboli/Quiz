package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecondQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton correta;
    EditText edtNome;
    String nomeRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador2");
        nomeRecebido = value.getString("nome");

        correta = findViewById(R.id.rbCorreta);

        Button btnNext = findViewById(R.id.btnSecond);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correta.isChecked()){
                    countReceived += 1;
                }
                Intent nextQuestion = new Intent(SecondQuestion.this, ThirdQuestion.class);
                nextQuestion.putExtra("contador3", countReceived);
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
