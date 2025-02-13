package com.example.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.simpleAlertButton).setOnClickListener(v -> showAlertDialog());
        findViewById(R.id.button2).setOnClickListener(v -> alert());
        findViewById(R.id.button3).setOnClickListener(v -> alert2());
        findViewById(R.id.button4).setOnClickListener(v -> alert3());
        findViewById(R.id.button5).setOnClickListener(v -> alert4());
    }

    private void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Simple AlertDialog");
        builder.setMessage("Example message");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Clicked OK", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Nuh Uh", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Clicked Nuh Uh", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }
    private void alert(){
        final String[] items = {"Option1", "Option2", "Option3", "Option4", "Option5", "Option6"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose option");
    }
    private void alert2(){

    }
    private void alert3(){

    }
    private void alert4(){

    }
}