package andreoliveira.com.br.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD

public class ThirdQuestion extends AppCompatActivity {

=======
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ThirdQuestion extends AppCompatActivity {

    int countReceived;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton correta;
    String nomeRecebido;

>>>>>>> develop-casa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
<<<<<<< HEAD

        Button btnProxima = (Button)findViewById(R.id.btnThird);

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximaIntent = new Intent(ThirdQuestion.this, FourthQuestion.class);
                startActivity(proximaIntent);
=======
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        Intent actualScreen = getIntent();
        Bundle value =  actualScreen.getExtras();
        countReceived = value.getInt("contador3");
        nomeRecebido = value.getString("nome");

        correta = findViewById(R.id.rbCorreta);


        Button btnNext = (Button)findViewById(R.id.btnThird);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correta.isChecked()){
                    countReceived += 1;
                }
                Intent nextQuestion = new Intent(ThirdQuestion.this, FourthQuestion.class);
                nextQuestion.putExtra("contador4", countReceived);
                nextQuestion.putExtra("nome", nomeRecebido);
                startActivity(nextQuestion);
>>>>>>> develop-casa
            }
        });

    }
<<<<<<< HEAD
=======

    public View checkButton(View view){
        int radioID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);

        return radioButton;
    }
>>>>>>> develop-casa
}
