package cl.jpinodev.virtualwallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SignUpActivity extends AppCompatActivity {
    TextView linkLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        linkLogin = findViewById(R.id.linkLogin);
        linkLogin.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
            startActivity(intent);
        });
    }
}