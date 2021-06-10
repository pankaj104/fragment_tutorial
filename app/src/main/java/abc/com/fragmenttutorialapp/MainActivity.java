package abc.com.fragmenttutorialapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import abc.com.fragmenttutorialapp.fragments.FirstFragment;
import abc.com.fragmenttutorialapp.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button btnFirst , btnSecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst= findViewById(R.id.btnFirst);
        btnSecond= findViewById(R.id.btnSecond);
        linearLayout= findViewById(R.id.linearLayout);


        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout , firstFragment);
                transaction.commit();
            }
        });


        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment firstFragment = new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, firstFragment );
                transaction.commit();
            }
        });


    }
}