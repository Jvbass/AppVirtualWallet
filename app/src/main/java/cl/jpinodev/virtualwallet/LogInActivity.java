package cl.jpinodev.virtualwallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    Button loginBtn;
    TextView crearCuentaLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginBtn = findViewById(R.id.login_button); //se obtiene la referencia del botón
        loginBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LogInActivity.this, HomePageActivity.class);
            startActivity(intent);
        });

        crearCuentaLink = findViewById(R.id.link_crear_cuenta); //se obtiene la referencia del link
        crearCuentaLink.setOnClickListener(v -> {
            Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
            startActivity(intent);
        });


    }
}