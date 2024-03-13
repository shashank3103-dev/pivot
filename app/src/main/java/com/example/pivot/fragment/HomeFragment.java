package com.example.pivot.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.pivot.R;
import com.example.pivot.analyasis;
import com.example.pivot.reports;
import com.example.pivot.sucessfully_registrated;


public class HomeFragment extends Fragment {

    View myfragment;
    FrameLayout file_upload,take_pic;
    Button makeAnalaysis;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myfragment= inflater.inflate(R.layout.fragment_home, container, false);
       file_upload = myfragment.findViewById(R.id.file_upload);
        take_pic=myfragment.findViewById(R.id.take_pic);

        makeAnalaysis = myfragment.findViewById(R.id.makeAnalaysis);

        makeAnalaysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makeAnalysis = new Intent(getContext(), analyasis.class);
                startActivity(makeAnalysis);
            }
        });

        take_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    Intent take_pic = new Intent();
                    take_pic.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(take_pic);


                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });



        file_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFileManager();
            }

            private void openFileManager() {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*"); // You can set a specific MIME type here if you want
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivity(Intent.createChooser(intent, "Select File"));
            }
        });

        return myfragment;
    }
}