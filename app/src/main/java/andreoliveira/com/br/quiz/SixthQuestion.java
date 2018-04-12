package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contador6");

        Button btnNext = (Button)findViewById(R.id.btnSixth);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(SixthQuestion.this, SeventhQuestion.class);
                nextQuestion.putExtra("contador7", countReceived);
                startActivity(nextQuestion);
            }
        });
    }
}
