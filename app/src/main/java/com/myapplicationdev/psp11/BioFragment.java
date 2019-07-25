package com.myapplicationdev.psp11;


import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {

    TextView tv;
    Button edit;
    public BioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_bio, container, false);

        tv = v.findViewById(R.id.tvBio);
        edit = v.findViewById(R.id.btnBioEdit);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                //set title
                dialog.setTitle("Edit Bio");

                // Set up the input
                final EditText input = new EditText(getContext());
                // Specify the type of input expected;
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                dialog.setView(input);

                // Set up the buttons
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (input.getText().toString() != null) {
                            String value = input.getText().toString();
                            tv.setText(value);
                        }
                        input.setText("");

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                dialog.show();            }
        });

        // Inflate the layout for this fragment
        return v;

    }



}
