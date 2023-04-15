package com.example.telaloginaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainActivity() {
    }

    private String Email;
    private String Senha;


    public void confirmarLogin() {

        if (getEmail().equals("adm") && getSenha().equals("public")){

            Intent i = new Intent(this, ConfirmacaoLogin.class);
            i.putExtra("usuario", getEmail());
            i.putExtra("senha", getSenha());
            startActivity(i);

        } else {

            mostrarMensagem();

        }

    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }


    public void mostrarMensagem() {

        Toast.makeText(this, "Usuario incorretos!", Toast.LENGTH_LONG).show();

    }
}