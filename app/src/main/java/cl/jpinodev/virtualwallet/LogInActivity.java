package cl.jpinodev.virtualwallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        loginBtn = findViewById(R.id.login_button); //se obtiene la referencia del botón
        loginBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LogInActivity.this, HomePage.class);
            startActivity(intent);
        });

    }
}