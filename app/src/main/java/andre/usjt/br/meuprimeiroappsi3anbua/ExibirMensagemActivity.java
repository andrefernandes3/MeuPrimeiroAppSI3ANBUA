package andre.usjt.br.meuprimeiroappsi3anbua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExibirMensagemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_mensagem);
        //obtenho a intent do metodo herdado
        Intent x = getIntent();
        //pego o bundle e coloco como parametro uma chave TXT
        String texto = x.getStringExtra(MainActivity.TXT);
        TextView textView = new TextView(this);
        //textView.setTextSize(100);
        textView.setText(texto);
        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_exibir_mensagem);
        layout.addView(textView);
    }
}