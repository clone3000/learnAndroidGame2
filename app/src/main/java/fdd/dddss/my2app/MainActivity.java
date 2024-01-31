package fdd.dddss.my2app;

import static fdd.dddss.my2app.R.id.button_press;
import static fdd.dddss.my2app.R.id.button_start;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startButton = (Button) findViewById(R.id.button_start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this,Level1.class);
                    startActivity(intent);finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}