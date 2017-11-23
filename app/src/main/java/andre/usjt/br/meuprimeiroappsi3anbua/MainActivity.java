package andre.usjt.br.meuprimeiroappsi3anbua;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText textoEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensagem( View v){
        //busca o elemento e faz un casting
        textoEditText = (EditText) findViewById(R.id.textoEditText);
        //obtenho o elemento na String toString uso para converter
        String texto = textoEditText.getText().toString();
        //coloco os objetos numa sacola
        Bundle b = new Bundle();
        //aqui coloco pares valor ; (chave, valor)
        b.putString(TXT, texto);
        //dizer a intenção que tambem é um objeto
        Intent intencao = new Intent (this, ExibirMensagemActivity.class);
        //aqui coloco dados extras dentro do intent
        intencao.putExtras(b);
        //inicio outra activity
        startActivity(intencao);
    }
    public static final String TXT = "";
}
