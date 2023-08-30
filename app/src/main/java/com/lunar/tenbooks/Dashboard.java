package com.lunar.tenbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    LinearLayout book1,book2,book3,book4,book5,book6,book7,book8,book9,book10;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        book3 = findViewById(R.id.book3);
        book4 = findViewById(R.id.book4);
        book5 = findViewById(R.id.book5);
        book6 = findViewById(R.id.book6);
        book7 = findViewById(R.id.book7);
        book8 = findViewById(R.id.book8);
        book9 = findViewById(R.id.book9);
        book10 = findViewById(R.id.book10);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);



        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "AtomicHabits.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "7habits.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "StartWithWhy.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "SubtleArt.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "WinFriends.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Rich-Dad-Poor-Dad.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Think.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Psychology.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Rework.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Stop.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        //For the buttons
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "AtomicHabits.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "7habits.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "StartWithWhy.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "SubtleArt.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "WinFriends.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Rich-Dad-Poor-Dad.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Think.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Psychology.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Rework.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.display = "Stop.pdf";
                Intent myIntent= new Intent(Dashboard.this, MainActivity.class);
                startActivity(myIntent);

            }
        });



    }



}