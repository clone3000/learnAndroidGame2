package fdd.dddss.my2app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.AsyncTask;


import androidx.appcompat.app.AppCompatActivity;

import kotlinx.coroutines.Delay;

public class Level2 extends AppCompatActivity {


    Table2 twoTable1 = new Table2();
    Delay delay = new Delay();



    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public Button buttonride1;
    public Button buttonride2;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public ImageView imageView1;
    public TextView textView8;
    public TextView textView9;
    public ImageView imageView2;
    public Button buttonride3;
    public Button buttonride4;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;

    public Button button_level1;

    public int line=-1;
    public int counterFirstLine=0;
    public int counterSecondLine=0;
    public int secondYes=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level2);

        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final Button buttonride1 = (Button) findViewById(R.id.buttonride1);
        final Button buttonride2 = (Button) findViewById(R.id.buttonride2);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        final Button buttonride3 = (Button) findViewById(R.id.buttonride3);
        final Button buttonride4 = (Button) findViewById(R.id.buttonride4);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final Button button_level1 = (Button) findViewById(R.id.button_start1);

        textView1.setText(twoTable1.twoscenario[0]);
        textView2.setText(twoTable1.twoscenario[1]);
        textView3.setText(twoTable1.twoscenario[2]);
        textView4.setText(twoTable1.twoscenario[3]);
        textView5.setText(twoTable1.twoscenario[4]);
        textView6.setText(twoTable1.twoscenario[5]);
        textView7.setText(twoTable1.twoscenario[6]);
        textView8.setText(twoTable1.twoscenario[7]);
        textView9.setText(twoTable1.twoscenario[8]);
        textView10.setText(twoTable1.twoscenario[9]);
        textView11.setText(twoTable1.twoscenario[10]);
        textView12.setText(twoTable1.twoscenario[11]);


        //Код который прячет текст
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        buttonride1.setVisibility(View.INVISIBLE);
        buttonride2.setVisibility(View.GONE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        buttonride3.setVisibility(View.INVISIBLE);
        buttonride4.setVisibility(View.GONE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);

        //команда которая запускает AsyncTask
        delay.execute();


    }

    //Кнопка назад-начало(которая закрывает игру)

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        try {
            Intent intent = new Intent(Level2.this,MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

    //Кнопка назад-конец

    //Начало AsyncTask
    class Delay extends AsyncTask<Void, Integer,  Void>{
        @Override
        protected Void doInBackground(Void... params){

            while (line <=15){
                if(counterFirstLine==0 & line==4) {
                    line=4;
                    if (isCancelled())return null;
                }else {
                    if (counterSecondLine==0 & line==12){
                        line=12;
                        if (isCancelled())return null;
                    }else{
                        if(secondYes==1 & line==8){
                            line=11;
                        }
                publishProgress(line=line+1);
                try {
                    Thread.sleep(2000);
                    if (isCancelled())return null;
                }catch (Exception e){

                }
            }}}
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values){

            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final Button buttonride1 = (Button) findViewById(R.id.buttonride1);
            final Button buttonride2 = (Button) findViewById(R.id.buttonride2);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
            final Button buttonride3 = (Button) findViewById(R.id.buttonride3);
            final Button buttonride4 = (Button) findViewById(R.id.buttonride4);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final Button button_level1 = (Button) findViewById(R.id.button_start1);

            //Добавляем анимацию
            final Animation a = AnimationUtils.loadAnimation(Level2.this,R.anim.alpha);

            switch (line) {
                case 0: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
                case 1: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
                case 2: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a);break;
                case 3: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a);break;
                case 4: buttonride1.setVisibility(View.VISIBLE); buttonride1.startAnimation(a);
                        buttonride1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (counterFirstLine==0) {
                                        counterFirstLine = 1;
                                        textView8.setVisibility(View.GONE);
                                        textView9.setVisibility(View.GONE);
                                        imageView2.setVisibility(View.GONE);
                                        secondYes=1;
                                    }
                                }catch (Exception e){

                                }
                            }
                        });

                        buttonride2.setVisibility(View.VISIBLE); buttonride2.startAnimation(a);
                        buttonride2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (counterFirstLine==0) {
                                        counterFirstLine = 1;
                                        textView5.setVisibility(View.GONE);
                                        textView6.setVisibility(View.GONE);
                                        textView7.setVisibility(View.GONE);
                                        imageView1.setVisibility(View.GONE);
                                        line = line + 4;
                                    }
                                }catch (Exception e){

                                }
                            }
                        });break;

                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a);break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a);break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a);break;
                case 8: imageView1.setVisibility(View.VISIBLE); imageView1.startAnimation(a);break;
                case 9: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a);break;
                case 10: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a);break;
                case 11: imageView2.setVisibility(View.VISIBLE); imageView2.startAnimation(a);break;
                case 12: buttonride3.setVisibility(View.VISIBLE); buttonride3.startAnimation(a);
                        buttonride3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (counterSecondLine==0) {
                                        counterSecondLine = 1;
                                        line = line + 1;
                                    }
                                }catch (Exception e){

                                }
                            }
                        });

                         buttonride4.setVisibility(View.VISIBLE); buttonride4.startAnimation(a);
                        buttonride4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (counterSecondLine==0) {
                                        counterSecondLine = 1;
                                        line = line + 1;
                                    }
                                }catch (Exception e){

                                }
                            }
                        });break;

                case 13: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a);break;
                case 14: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a);break;
                case 15: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a);break;
                case 16:button_level1.setVisibility(View.VISIBLE); button_level1.startAnimation(a);
                        button_level1.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("ResourceType")
                            @Override
                            public void onClick(View v) {
                                try {
                                    Intent intent = new Intent(Level2.this,Level3.class);
                                    startActivity(intent);finish();
                                }catch (Exception e){

                                }
                            }
                            });
                            default:break;



            }

        }

    }

    //Конец AsyncTask



}