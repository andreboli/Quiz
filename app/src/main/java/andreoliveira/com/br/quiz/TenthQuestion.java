package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenthQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_question);
        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        countReceived = value.getInt("contator10");

        Button btnNext = (Button)findViewById(R.id.btnTenth);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextQuestion = new Intent(TenthQuestion.this, ResultActivity.class);
                nextQuestion.putExtra("result", countReceived);
                startActivity(nextQuestion);
            }
        });

    }
}
