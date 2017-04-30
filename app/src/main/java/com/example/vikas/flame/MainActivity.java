package com.example.vikas.flame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import  android.widget.EditText;
import  android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText eb;
    EditText eg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       eb=(EditText)findViewById(R.id.eb);
         eg=(EditText)findViewById(R.id.eg);
       ImageButton b=(ImageButton)findViewById(R.id.b);
        b.setOnClickListener(
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        int c=0;
                        String s1=eb.getText().toString();
                        String s2=eg.getText().toString();
                        StringBuffer ss1=new StringBuffer(s1);
                        StringBuffer ss2=new StringBuffer(s2);
                        TextView tv=(TextView)findViewById(R.id.tv);
                        int l1=ss1.length();
                        int l2=ss2.length();
                        if(l1!=0&&l2!=0){
                        int l3=l1+l2;
                        for(int i=0;i<l1;i++){
                            for(int j=i+1;j<l2;j++){
                                if(s1.charAt(i)==s2.charAt(j))
                                    l3--;
                            }
                        }
                        for(int i=0;i<l3;i++){
                                c++;
                            if(c==6) {
                                c = 0;
                            }
                        }
                        switch(c){
                            case 0:
                                tv.setText("Love");
                                break;
                            case  1:
                                tv.setText("Friend");
                                break;
                            case  2:
                                tv.setText("Love");
                                break;
                            case  3:
                                tv.setText("Affection");
                                break;
                            case  4:
                                tv.setText("Marriage");
                                break;
                            case  5:
                                tv.setText("Enemy");
                                break;
                            case  6:
                                tv.setText("Sister");
                                break;


                        }
                        c=0;
                            ss1=null;
                            ss2=null;
                }
                }}

        );
    }
    }
