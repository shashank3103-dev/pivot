package com.example.pivot.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pivot.R;
import com.example.pivot.purchase;
import com.example.pivot.sucessfully_registrated;

public class CreditCardFragment extends Fragment {

    ImageView backButton;
    Button image_purchase;
    View myfragment;
    public CreditCardFragment(){

    }


        @SuppressLint("WrongViewCast")
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment


            myfragment= inflater.inflate(R.layout.fragment_credit_card, container, false);
            image_purchase =myfragment.findViewById(R.id.image_purchase);
            backButton = myfragment.findViewById(R.id.backButton);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backButton = new Intent(getContext(), sucessfully_registrated.class);
                    startActivity(backButton);
                }
            });


            image_purchase.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), purchase.class);
                    startActivity(intent);

                }
            });
            return myfragment;
        }
    }