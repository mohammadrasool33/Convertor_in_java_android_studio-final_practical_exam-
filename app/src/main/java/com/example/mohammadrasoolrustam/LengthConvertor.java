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

public class LengthConvertor extends AppCompatActivity {
    EditText mile,setKilometer;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_length_convertor);
        mile=findViewById(R.id.mile);
        setKilometer=findViewById(R.id.setKilometer);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mileFromInput=mile.getText().toString();
                if (!TextUtils.isEmpty(mileFromInput)){
                    Double inputNum=Double.parseDouble(mileFromInput);
                    Double result=inputNum*1.60934;
                    setKilometer.setText(""+result);
                }
                else{
                    Toast.makeText(LengthConvertor.this, "Please Enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}