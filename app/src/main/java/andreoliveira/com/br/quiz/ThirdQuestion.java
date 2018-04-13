package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ThirdQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        Intent actualScreen = getIntent();
        Bundle value =  actualScreen.getExtras();
        countReceived = value.getInt("contador3");


        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);

        checkButton(findViewById(R.id.rbCorreta));

        if(radioButton == findViewById(R.id.rbCorreta)){
            countReceived += 1;
        }

        Button btnNext = (Button)findViewById(R.id.btnThird);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(ThirdQuestion.this, FourthQuestion.class);
                nextQuestion.putExtra("contador4", countReceived);
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
