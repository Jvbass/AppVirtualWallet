package cl.jpinodev.virtualwallet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cl.jpinodev.virtualwallet.R;

public class SignUpFrgmntNav extends Fragment {


    public SignUpFrgmntNav() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up_frgmnt_nav, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button crearCuentaBtn = view.findViewById(R.id.crearCuentaBtn);
        TextView loginLink = view.findViewById(R.id.linkCrearCuenta);

        crearCuentaBtn.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.signUpFrgmntNav);
        });

        loginLink.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.loginFrgmntNav);
        });
    }
}