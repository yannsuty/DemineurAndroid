package com.example.demineur;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BoutonListener implements View.OnClickListener {
    private MainActivity activity;
    public BoutonListener(MainActivity m) {
        this.activity=m;
    }

    @Override
    public void onClick(View view) {
        int bouton = ((Button)view.getParent()).getId();
        switch (bouton) {
            case R.id.commencer:
                this.activity.setContentView(R.layout.menu);
                break;
            case R.id.charger:
                this.activity.chargerPlateau();
                break;
        }
    }
}
