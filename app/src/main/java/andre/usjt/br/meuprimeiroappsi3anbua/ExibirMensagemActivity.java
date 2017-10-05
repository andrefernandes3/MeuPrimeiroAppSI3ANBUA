package andre.usjt.br.meuprimeiroappsi3anbua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExibirMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_mensagem);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String texto =
    }
}
