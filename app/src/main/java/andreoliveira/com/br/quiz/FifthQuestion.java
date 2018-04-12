package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador5");

        Button btnNext = (Button)findViewById(R.id.btnFifth);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(FifthQuestion.this, SixthQuestion.class);
                nextQuestion.putExtra("contador6", countReceived);
                startActivity(nextQuestion);
            }
        });
    }
}
