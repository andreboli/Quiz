package andreoliveira.com.br.quiz;

<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {

=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    int countReceived;
    TextView result;
    TextView nome;
    Button novo;

>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
<<<<<<< HEAD
=======

        Intent actualScreen = getIntent();
        Bundle value = actualScreen.getExtras();
        String nomeRecebido;

        countReceived = value.getInt("result");
        nomeRecebido = value.getString("nome");

        nome = (TextView)findViewById(R.id.edtNome);
        nome.setText(String.valueOf(nomeRecebido));

        result = (TextView)findViewById(R.id.result);
        result.setText(String.valueOf(countReceived));

        novo = (Button)findViewById(R.id.novo);
        novo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(novo);
            }
        });
>>>>>>> develop-casa
    }
}
