package br.ufpi.es.checar.Visao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.checar.Persistencia.ControleBanco;
import br.ufpi.es.checar.R;

public class TelaCadastro extends AppCompatActivity {
    private static final String TAG = "Checar.java";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        // Tela de teste para cadastro de clientes no banco de dados
        Button botao = (Button) findViewById(R.id.buttoncadastro);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControleBanco bd = new ControleBanco(getBaseContext());
                // Variaveis correspondentes a cada um dos campos do banco de dados
                EditText cpf = (EditText) findViewById(R.id.textEditCPF);
                EditText rg = (EditText) findViewById(R.id.editTextRG);
                EditText nome = (EditText) findViewById(R.id.editTextNome);
                // Transformando para string
                String CPF = "1163259460";
                        //cpf.getText().toString();
                String RG = "3351296";
                        //rg.getText().toString();
                String Nome = "Luis Henrique Silva Vogado";
                        //nome.getText().toString();
                String result;

                result = bd.InserirDado(CPF, RG, Nome);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();

                //Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
