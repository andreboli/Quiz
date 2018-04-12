package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdQuestion extends AppCompatActivity {

    int countReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        Intent actualScreen = getIntent();
        Bundle value =  actualScreen.getExtras();
        countReceived = value.getInt("contador3");

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
}
