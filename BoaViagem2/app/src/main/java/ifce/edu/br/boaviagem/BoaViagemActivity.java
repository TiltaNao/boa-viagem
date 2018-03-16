package ifce.edu.br.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by RDC on 16/03/2018.
 */

public class BoaViagemActivity extends Activity{


    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick(View v){

        String usuarioInformado = usuario.getText().toString();
        String senhaInformado = senha.getText().toString();

        if("felipe".equals(usuarioInformado) && "1234".equals(senhaInformado)){
            //vai para outra activity
        }else{
            String mensagenErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this,mensagenErro,Toast.LENGTH_SHORT);
            toast.show();
            //mostra erro
        }


    }
}
