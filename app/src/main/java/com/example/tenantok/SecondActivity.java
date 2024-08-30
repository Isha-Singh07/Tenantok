package com.example.tenantok;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
    ImageView profile;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ImageView profile = findViewById(R.id.profile);
        ImageView facilities = findViewById(R.id.facilities);
        ImageView complaints = findViewById(R.id.complaints);
        ImageView payment = findViewById(R.id.payment);
        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openImage1Activity();}
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage2Activity();}
        });
        complaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage3Activity();}
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImage4Activity();}
        });
    }
    public void openImage1Activity() {
        Intent intent = new Intent(SecondActivity.this, profile.class);
        startActivity(intent);}
    public void openImage2Activity() {
        Intent intent = new Intent(SecondActivity.this, facilities.class);
        startActivity(intent);}
    public void openImage3Activity() {
        Intent intent = new Intent(SecondActivity.this, complaints.class);
        startActivity(intent);}
    public void openImage4Activity() {
        // Open activity for Image 1
        Intent intent = new Intent(SecondActivity.this, payment.class);
        startActivity(intent);
    }
}
