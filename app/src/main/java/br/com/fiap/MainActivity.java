package br.com.fiap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.dao.UsuarioDAO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Novo por aqui ?");
        UsuarioDAO dao = new UsuarioDAO();
    }
}