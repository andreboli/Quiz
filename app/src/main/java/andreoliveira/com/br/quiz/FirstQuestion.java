package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class FirstQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        Button btnProxima = (Button)findViewById(R.id.btnFirst);
        RadioGroup rdGroup = (RadioGroup)findViewById(R.id.radioGroup);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent proximaPergunta = new Intent(FirstQuestion.this, SecondQuestion.class);
                startActivity(proximaPergunta);
            }
        });
    }
}
