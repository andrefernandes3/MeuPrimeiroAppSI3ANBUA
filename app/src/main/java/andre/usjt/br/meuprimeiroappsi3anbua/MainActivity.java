package andre.usjt.br.meuprimeiroappsi3anbua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textoEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoEditText = (EditText) findViewById(R.id.textoEditText);

    }

    public void enviarMensagem( View v){
        String texto = textoEditText.getText().toString();
        Bundle b = new Bundle();
        b.putString("txt", texto);
        Intent i = new Intent (this, ExibirMensagemActivity.class);
        i.putExtras(b);
        startActivity(i);
    }
}
