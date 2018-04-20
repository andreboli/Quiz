package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD

public class MainActivity extends AppCompatActivity {

=======
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    EditText edtNome;

>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button)findViewById(R.id.Start);
<<<<<<< HEAD
=======
        edtNome = (EditText) findViewById(R.id.edtNome);
>>>>>>> develop-casa

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Intent startQuiz = new Intent(MainActivity.this, FirstQuestion.class);
                startActivity(startQuiz);
=======
                if(edtNome.getText().toString().length() <= 0){
                    edtNome.setError("Obrigatório preenchimento");
                }else {
                    Intent startQuiz = new Intent(MainActivity.this, FirstQuestion.class);
                    startQuiz.putExtra("contador", count);
                    startQuiz.putExtra("nome", edtNome.getText().toString());

                    startActivity(startQuiz);
                }
>>>>>>> develop-casa
            }
        });
    }
}
