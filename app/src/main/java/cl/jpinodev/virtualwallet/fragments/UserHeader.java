package cl.jpinodev.virtualwallet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import cl.jpinodev.virtualwallet.HomePageActivity;
import cl.jpinodev.virtualwallet.R;

public class UserHeader extends Fragment {

    public UserHeader() {
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
        View  view = inflater.inflate(R.layout.fragment_user_header, container, false);

        ImageView notificationIcon = view.findViewById(R.id.notificaction_icon);

        notificationIcon.setOnClickListener(v -> {
            HomePageActivity homePageActivity = (HomePageActivity) getActivity();
            if (homePageActivity != null) {
                homePageActivity.toggleTransactionVisibility();
            }
        });
        return view;
    }
    }
