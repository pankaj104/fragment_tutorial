package abc.com.fragmenttutorialapp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import abc.com.fragmenttutorialapp.R;


public class FirstFragment extends Fragment {




    public FirstFragment() {
        // Required empty public constructor
    }
//TextView titu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

//titu= view.findViewById(R.id.textview);
//titu.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Intent intent=new Intent(getContext(), SecondFragment.class);
//        startActivity(intent);
//    }
//});



        return view;
    }
}



