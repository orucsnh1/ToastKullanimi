package com.example.seniha.toastkullanimi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1 = (Button)findViewById(R.id.button6);
        btn2 = (Button)findViewById(R.id.button7);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Normal toast mesajı
               // Toast.makeText(MainActivity.this,"İçerik",Toast.LENGTH_LONG).show();


                TextView textView = new TextView(getApplicationContext());
                textView.setText("Toast mesaj içeriği");
                textView.setBackgroundColor(Color.parseColor("#D81B60"));// arka plan rengi
                textView.setTextColor(Color.WHITE);// test rengi
                textView.setPadding(14,14,14,14);//sol sağ alt üst sınırlar belirlenir.


                Toast toast = new Toast(getApplicationContext());
                //toast özellikleri
                toast.setView(textView);
                toast.setDuration(Toast.LENGTH_LONG);//suresi
                toast.show();// görüntüler

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView dikkat = new ImageView(MainActivity.this);
                dikkat.setImageResource(R.drawable.dkt);//setImageResource ile resim tanımlanır.
                Toast toast = new Toast(getApplicationContext());
                //toast özellikleri
                toast.setView(dikkat);
                // toast.setGravity();// resmin yeri belirlenebilir.
                toast.setDuration(Toast.LENGTH_LONG);//suresi
                toast.show();// görüntüler


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
