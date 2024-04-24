package cl.jpinodev.virtualwallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSignupActivity extends AppCompatActivity {
    Button crearCuentaBtn;
    TextView loginLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        crearCuentaBtn = findViewById(R.id.btnCrearCuenta);
        crearCuentaBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LoginSignupActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        loginLink = findViewById(R.id.linkCrearCuenta);
        loginLink.setOnClickListener(v -> {
            Intent intent = new Intent(LoginSignupActivity.this, LogInActivity.class);
            startActivity(intent);
        });
    }
}