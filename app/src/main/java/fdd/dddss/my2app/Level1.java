package fdd.dddss.my2app;

import static fdd.dddss.my2app.R.id.button_start;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.AsyncTask;

import androidx.appcompat.app.AppCompatActivity;

public class Level1 extends AppCompatActivity {


    Table1 oneTable1 = new Table1();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public ImageView imageView1;
    public TextView textView3;
    public Button button_level1;

    public int line=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final Button button_level1 = (Button) findViewById(R.id.button_start1);


        textView1.setText(oneTable1.onescenario[0]);
        textView2.setText(oneTable1.onescenario[1]);
        textView3.setText(oneTable1.onescenario[2]);



        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        //Код который прячет текст

        //Команда которая запускает AsyncTask
        delay.execute();

    }

    //Кнопка назад-начало(которая закрывает игру)

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        try {
            Intent intent = new Intent(Level1.this,MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }

    //Кнопка назад-конец

    //AsyncTask-начало
    class Delay extends AsyncTask <Void, Integer, Void>{

        @Override
        protected Void doInBackground(Void...params){
            while (line<=5){
                publishProgress(line++);
                try{
                    Thread.sleep(5000);
                    if (isCancelled()) return null;
                }catch(Exception e){}
            }
            return null;
        }

        @Override
            protected void  onProgressUpdate (Integer...values){
            final TextView textView1 = (TextView) findViewById(R.id.textView1);
            final TextView textView2 = (TextView) findViewById(R.id.textView2);
            final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
            final TextView textView3 = (TextView) findViewById(R.id.textView3);
            final Button button_level1 = (Button) findViewById(R.id.button_start1);

            final Animation a = AnimationUtils.loadAnimation(Level1.this, R.anim.alpha);

            switch (line) {

                case 1:textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
                case 2:textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
                case 3:imageView1.setVisibility(View.VISIBLE); imageView1.startAnimation(a);break;
                case 4:textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a);break;
                case 5:button_level1.setVisibility(View.VISIBLE); button_level1.startAnimation(a);
                    button_level1.setOnClickListener(new View.OnClickListener() {
                        @SuppressLint("ResourceType")
                        @Override
                        public void onClick(View v) {
                            try {
                                Intent intent = new Intent(Level1.this,Level2.class);
                                startActivity(intent);finish();
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    });
                default:break;
            }


        }

    }

    //AsyncTask-конец


}