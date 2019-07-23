package com.example.p11_ps;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnniversaryFragment extends Fragment {


    EditText et;
    private DrawerLayout drawerLayout;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.anniversaryfragment, container, false);
        drawerLayout = view.findViewById(R.id.drawer_layout);
        Button btnEdit = view.findViewById(R.id.btnEdit);
        final TextView tvShow = view.findViewById(R.id.tvShow);
//        if(view.getParent() != null) {
//            ((ViewGroup)view.getParent()).removeView(view); // <- fix
//        }
//        inflater.addView(tv);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View layoutView = inflater.inflate(R.layout.dialog_layout, null);
                et = layoutView.findViewById(R.id.et);
                new AlertDialog.Builder(getActivity())
                        .setTitle("Edit Anniversary")
                        .setMessage(tvShow.getText().toString())
                        .setView(et)
                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                                tvShow.setText(et.getText().toString());
                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNeutralButton("Cancel" , null)
                        .show();

            }
        });

        return view;
    }

}