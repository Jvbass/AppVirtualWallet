package cl.jpinodev.virtualwallet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.jpinodev.virtualwallet.R;

public class SplashFrgmntNav extends Fragment {

    private static final long SPLASH_DELAY = 2000;
    public SplashFrgmntNav() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash_frgmnt_nav, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cargarLoginSignupFrgmt();
            }
        }, SPLASH_DELAY);
    }

    private void cargarLoginSignupFrgmt() {
        Navigation.findNavController(requireView()).navigate(R.id.loginSignFrgmntNav);
    }
}