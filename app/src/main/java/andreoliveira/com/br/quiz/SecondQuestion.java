package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador2");

        Button btnNext = findViewById(R.id.btnSecond);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(SecondQuestion.this, ThirdQuestion.class);
                nextQuestion.putExtra("contador3", countReceived);
                startActivity(nextQuestion);
            }
        });
    }
}
