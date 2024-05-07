package cl.jpinodev.virtualwallet.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.MaterialToolbar;

import cl.jpinodev.virtualwallet.HomePageActivity;
import cl.jpinodev.virtualwallet.R;
public class TransactionSend extends Fragment {
    public TransactionSend() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_transaction_send, container, false);

        MaterialToolbar toolbar = view.findViewById(R.id.materialToolbar);

        toolbar.setNavigationOnClickListener(v -> {
            Intent intent = new Intent(getContext(), HomePageActivity.class);
            startActivity(intent);
            HomePageActivity.fragmenReceiverVisible = true;
        });
        return view;
    }
}