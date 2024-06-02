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

public class AreaConvertor extends AppCompatActivity {
    Button button;
    EditText squareMile,setSquareKilometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_area_convertor);
        button=findViewById(R.id.button);
        squareMile=findViewById(R.id.squareMile);
        setSquareKilometer=findViewById(R.id.setSquareKilometer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputMile=squareMile.getText().toString();
                if (!TextUtils.isEmpty(inputMile)){
                    Double inputInDouble=Double.parseDouble(inputMile);
                    Double result=inputInDouble*2.59;
                    setSquareKilometer.setText(""+result);
                }
                else{
                    Toast.makeText(AreaConvertor.this, "Please Enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}