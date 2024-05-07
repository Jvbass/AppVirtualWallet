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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_user_header, container, false);

        ImageView notificationIcon = view.findViewById(R.id.notificaction_icon);
        Button btnSend = view.findViewById(R.id.btnSend);
        Button btnRequest = view.findViewById(R.id.btnRequest);
        ImageView profileImage = view.findViewById(R.id.profile_image);

        notificationIcon.setOnClickListener(v -> {
            HomePageActivity homePageActivity = (HomePageActivity) getActivity();
            if (homePageActivity != null) {
                homePageActivity.toggleTransactionVisibility();
            }
        });

        btnSend.setOnClickListener(v -> {
            HomePageActivity homePageActivity = (HomePageActivity) getActivity();
            if (homePageActivity != null) {
                homePageActivity.toggleFragmentSenderVisibility();
            }

            // NavController navController = Navigation.findNavController(view);
            //navController.navigate(R.id.action_homePageActivity_to_sendMoneyFragment);
        });

        btnRequest.setOnClickListener(v -> {
            HomePageActivity homePageActivity = (HomePageActivity) getActivity();
            if (homePageActivity != null) {
                homePageActivity.toggleFragmentReceiverVisibility();
            }
        });


        profileImage.setOnClickListener(v -> {
            HomePageActivity homePageActivity = (HomePageActivity) getActivity();
            if (homePageActivity != null) {
                homePageActivity.toggleProfileVisibility();
            }
        });



        return view;
    }
    }
