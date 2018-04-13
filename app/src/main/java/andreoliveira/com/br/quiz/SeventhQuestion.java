package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SeventhQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_question);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador7");

        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);

        checkButton(findViewById(R.id.rbCorreta));

        if(radioButton == findViewById(R.id.rbCorreta)){
            countReceived += 1;
        }

        Button btnNext = (Button)findViewById(R.id.btnSeventh);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(SeventhQuestion.this, EighthQuestion.class);
                nextQuestion.putExtra("contador8", countReceived);
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
