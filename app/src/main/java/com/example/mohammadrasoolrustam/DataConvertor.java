package com.example.mohammadrasoolrustam;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DataConvertor extends AppCompatActivity {
    Button button;
    EditText kilobyte,setMegabyte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_convertor);
        button=findViewById(R.id.button);
        kilobyte=findViewById(R.id.kilobyte);
        setMegabyte=findViewById(R.id.setMegabyte);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=kilobyte.getText().toString();
                if (!TextUtils.isEmpty(input)){
                    Double inputDouble=Double.parseDouble(input);
                    Double result=inputDouble/1024;
                    setMegabyte.setText(""+result);
                }
                else{
                    Toast.makeText(DataConvertor.this, "Please Enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}