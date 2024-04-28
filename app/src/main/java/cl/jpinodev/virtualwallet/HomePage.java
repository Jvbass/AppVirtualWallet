package cl.jpinodev.virtualwallet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import cl.jpinodev.virtualwallet.fragments.ButtonsHomeUser;
import cl.jpinodev.virtualwallet.fragments.TransactionsList;
import cl.jpinodev.virtualwallet.fragments.UserHeader;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        
        loadHeaderUserFragment();
        loadButtonsHomeUserFragment();
        loadHomeUserContentFragment();
    }

    FragmentManager fm = getSupportFragmentManager();

    private void loadHeaderUserFragment() {
        fm.beginTransaction().replace(R.id.fragmentUserHeader, new UserHeader()).commit();
    }
    private void loadButtonsHomeUserFragment() {
        fm.beginTransaction().replace(R.id.buttonPanel, new ButtonsHomeUser()).commit();
    }

    private void loadHomeUserContentFragment() {
        fm.beginTransaction().replace(R.id.fragmentUserContent, new TransactionsList()).commit();
    }

}