package com.example.demineur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoutonListener listener = new BoutonListener(this);
        Button commencer = this.findViewById(R.id.commencer);

        commencer.setOnClickListener(listener);
    }

    public void chargerPlateau() {
        System.out.println("test");
    }
}
