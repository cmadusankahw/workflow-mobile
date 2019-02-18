package com.tecOps.workflow.view;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kalpa.workflow.R;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        TextView resetPassword= findViewById(R.id.textView2);

        resetPassword.setPaintFlags(resetPassword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Button btnlog= findViewById(R.id.btnlog);

        btnlog.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),event_details.class);
                startActivity(i);

            }
        });




    }
}
