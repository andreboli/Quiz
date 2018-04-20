package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button)findViewById(R.id.Start);
        edtNome = (EditText) findViewById(R.id.edtNome);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNome.getText().toString().length() <= 0){
                    edtNome.setError("Obrigatório preenchimento");
                }else {
                    Intent startQuiz = new Intent(MainActivity.this, FirstQuestion.class);
                    startQuiz.putExtra("contador", count);
                    startQuiz.putExtra("nome", edtNome.getText().toString());

                    startActivity(startQuiz);
                }
            }
        });
    }
}
