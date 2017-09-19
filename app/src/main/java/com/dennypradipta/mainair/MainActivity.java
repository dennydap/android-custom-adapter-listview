package com.dennypradipta.mainair;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

////////////////////////////////////////////
//             Main Activity              //
// Berisikan kodingan untuk Splash Screen //
//              Version 1.0               //
//            Denny Pradipta              //
////////////////////////////////////////////

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }, 3000);
    }
}
