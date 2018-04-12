package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador");

        Button btnNext = (Button)findViewById(R.id.btnFirst);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(FirstQuestion.this, SecondQuestion.class);
                nextQuestion.putExtra("contador2", countReceived);
                startActivity(nextQuestion);
            }
        });
    }
}

