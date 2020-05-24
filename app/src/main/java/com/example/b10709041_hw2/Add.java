package com.example.b10709041_hw2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add extends AppCompatActivity {
private Button btnback,o;
private EditText c,n;
private String[] a=new String[2] ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        btnback=(Button)findViewById(R.id.cancel);
        btnback.setOnClickListener(btn);
        c=(EditText)findViewById(R.id.count);
        n=(EditText)findViewById(R.id.name);
        o=(Button)findViewById(R.id.ok);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a[0] = n.getText().toString();
                a[1] = c.getText().toString();
                Intent intent = new Intent(Add.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArray("name", a);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
        );}


    private Button.OnClickListener btn=new Button.OnClickListener(){
        public void onClick(View v)
        {
            finish();
        }
    };

}