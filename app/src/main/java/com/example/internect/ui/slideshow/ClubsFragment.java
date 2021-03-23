package com.example.internect.ui.slideshow;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.internect.R;

public class ClubsFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    Button button, button1, button2;
    AlertDialog.Builder builder, builder1, builder2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_clubs, container, false);
        button = (Button) root.findViewById(R.id.dscjoin);
        button1 = (Button) root.findViewById(R.id.rcjoin);
        button2 = (Button) root.findViewById(R.id.scjoin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("You have successfully joined DSC UON club.!");
                builder.setTitle("Successful!");
                builder.setIcon(R.drawable.ic_check_black_24dp);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder1 = new AlertDialog.Builder(getActivity());
                builder1.setMessage("You have successfully joined Red Cross UON club.!");
                builder1.setTitle("Successful!");
                builder1.setIcon(R.drawable.ic_check_black_24dp);
                builder1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder1.create();
                alert.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder2 = new AlertDialog.Builder(getActivity());
                builder2.setMessage("You have successfully joined the Scouts club.!");
                builder2.setTitle("Successful!");
                builder2.setIcon(R.drawable.ic_check_black_24dp);
                builder2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder2.create();
                alert.show();
            }
        });
        return root;
    }
}