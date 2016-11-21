package pooa20162.iff.br.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");


        TextView sau = (TextView) findViewById(R.id.tvNome);
        sau.setText("Olá "+nome+", seja bem vindo");
    }
}
