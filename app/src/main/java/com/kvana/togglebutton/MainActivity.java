package com.kvana.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Switch button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView) findViewById(R.id.text);
//        text.setVisibility(View.INVISIBLE);
        button= (Switch) findViewById(R.id.button);
        button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text.setText("On");
                    text.setVisibility(View.VISIBLE);
                }
                else {
                    text.setText("Off");
                }
            }
        });
    }
    public void ChangeVibrateState(View v){
    boolean checked=((ToggleButton)v).isChecked();
        if(checked){
            text.setText("Vibrate On");
            text.setVisibility(View.VISIBLE);
        }
        else {
            text.setText("Vibrate Off");;
        }
    }


}
