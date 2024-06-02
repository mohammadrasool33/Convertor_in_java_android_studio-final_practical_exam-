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

public class TemperatureConvertor extends AppCompatActivity {
    Button button;
    EditText fehrenheit,celsius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_temperature_convertor);
        button=findViewById(R.id.button);
        fehrenheit=findViewById(R.id.fehrenheit);
        celsius=findViewById(R.id.celsius);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=fehrenheit.getText().toString();
                if (!TextUtils.isEmpty(input)){
                    Double inputDouble=Double.parseDouble(input);
                    Double result=(inputDouble-32.0)*(5.0/9.0);
                    celsius.setText(""+result);
                }
                else{
                    Toast.makeText(TemperatureConvertor.this, "Please Enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}