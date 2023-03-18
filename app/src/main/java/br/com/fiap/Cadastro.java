package br.com.fiap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        EditText campoEmail = findViewById(R.id.activity_formulario_email);
        EditText campoSenha = findViewById(R.id.activity_formulario_senha);
        EditText campoSenhaConfirma = findViewById(R.id.activity_formulario_senha_confirma);

        Button botaoSalvar = findViewById(R.id.action_formulario_botao_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = campoEmail.getText().toString();
                String senha = campoSenha.getText().toString();
                String senhaConfirma = campoSenhaConfirma.getText().toString();

                startActivity(new Intent(Cadastro.this,
                        MainActivity.class));

                finish();

            }
        });
    }
}