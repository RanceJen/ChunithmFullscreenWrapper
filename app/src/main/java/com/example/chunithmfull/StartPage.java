package com.example.chunithmfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mEdit = findViewById(R.id.editText);
                String host = mEdit.getText().toString();

                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("host", host);
                startActivity(intent);
            }
        });
    }
}