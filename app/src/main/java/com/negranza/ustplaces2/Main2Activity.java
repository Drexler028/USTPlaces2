package com.negranza.ustplaces2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void viewRoque(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Roque_Rua%C3%B1o"));
        startActivity(i);

    }

    public void viewArch(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Arch_of_the_Centuries"));
        startActivity(i);

    }

    public void viewQpav(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Quadricentennial_Pavilion"));
        startActivity(i);
    }

    public void viewHospi(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Hospital"));
        startActivity(i);

    }

    public void goBack(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
