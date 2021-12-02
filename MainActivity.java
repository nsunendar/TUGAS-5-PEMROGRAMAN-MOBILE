package com.nemussys.tgs5mobile;


import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText WarnaInput;
    TextView WarnaOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WarnaInput = (EditText) findViewById(R.id.WarnaInput);
        WarnaOutput = (TextView) findViewById(R.id.WarnaOutput);

    }

    public void UpdateWarnaText(View view) {
        String color = WarnaInput.getText().toString().toLowerCase();
        switch (color){
            case "blue":
                WarnaOutput.setText("Saya Pilih BIRU");
                WarnaOutput.setTextColor(Color.BLUE);
                break;
            case "red":
                WarnaOutput.setText("Saya Pilih MERAH");
                WarnaOutput.setTextColor(Color.RED);
                break;
            case "yellow":
                WarnaOutput.setText("Saya Pilih KUNING");
                WarnaOutput.setTextColor(Color.YELLOW);
                break;
            case "green":
                WarnaOutput.setText("Saya Pilih HIJAU");
                WarnaOutput.setTextColor(Color.GREEN);
                break;
            case "black":
                WarnaOutput.setText("Saya Pilih HITAM");
                WarnaOutput.setTextColor(Color.BLACK);
                break;
            default:
                WarnaOutput.setText("Saya Pilih WARNA");
                WarnaOutput.setTextColor(Color.rgb (200, 105, 210 ));
                break;
        }
    }
}