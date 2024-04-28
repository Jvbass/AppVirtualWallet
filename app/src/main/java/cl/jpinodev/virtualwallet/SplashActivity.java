package cl.jpinodev.virtualwallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Utiliza un Handler para postergar la apertura de la siguiente actividad
        new Handler().postDelayed(() -> {
            //método se ejecutará después del tiempo especificado
            Intent intent = new Intent(SplashActivity.this, LoginSignupActivity.class);
            startActivity(intent);
            finish(); // Cierra esta actividad para prevenir regresar a ella con el botón de atrás
        }, SPLASH_DURATION);
    }
}