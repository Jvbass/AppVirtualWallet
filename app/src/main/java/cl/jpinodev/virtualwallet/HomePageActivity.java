package cl.jpinodev.virtualwallet;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import cl.jpinodev.virtualwallet.fragments.EmptyTransactionList;
import cl.jpinodev.virtualwallet.fragments.TransactionList;
import cl.jpinodev.virtualwallet.fragments.UserHeader;

public class HomePageActivity extends AppCompatActivity {

    public static boolean fragmentTransactionVisible = false;
    public static boolean fragmentSenderVisible = false;
    public static boolean fragmenReceiverVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        loadHeaderUserFragment();
        loadHomeUserContentFragment();
    }
    FragmentManager fm = getSupportFragmentManager();// FragmentManager se encarga de la interacción con los fragmentos

    private void loadHeaderUserFragment() {
        fm.beginTransaction().replace(R.id.fragmentUserHeader, new UserHeader()).commit();
    }

    private void loadHomeUserContentFragment() {
        fm.beginTransaction().replace(R.id.fragmentEmptyTransaction, new EmptyTransactionList()).commit();
    }

    /*
    * metodo cambia visivilidad del framelayout cuando escuche click en el boton de notificaciones en el fragmento header
    * */
    public void toggleTransactionVisibility() {
        if (!fragmentTransactionVisible) {
            findViewById(R.id.fragmentTransaction).setVisibility(View.VISIBLE);
            fragmentTransactionVisible = true;
            fm.beginTransaction().replace(R.id.fragmentTransaction, new TransactionList()).commit();
        } else {
            findViewById(R.id.fragmentTransaction).setVisibility(View.GONE);
            fragmentTransactionVisible = false;
        }
    }
}