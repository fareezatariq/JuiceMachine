package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView ivStart;
TextView tvJuice;
int count;
Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ivStart=findViewById(R.id.ivStart);
    tvJuice=findViewById(R.id.tvJuice);
    btnSearch=findViewById(R.id.btnSearch);
    btnSearch.setVisibility(View.GONE);
        int x = new Random().nextInt(7);
        ivStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                count++;
                if (count == x) {
                    ivStart.setImageResource(R.drawable.pngtreesummer_iced_orange_juice_lemon_4449188);
                    tvJuice.setText("Enjoy!!");
                    btnSearch.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Number of times you should click: " + x +" times, You have clicked " + count + " Time, Click Again!", Toast.LENGTH_SHORT).show();
                }
           }
    });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String site= "www.realfruitpower.com/fruit-juices/benefits-of-orange-juice";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://" + site));
                startActivity(intent);
            }
        });
    }
}