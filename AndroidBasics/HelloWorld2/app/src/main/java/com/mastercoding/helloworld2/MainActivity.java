package com.mastercoding.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import  com.github.barteksc.pdfviewer.PDFView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PdfView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("dummy.pdf")
                .load();

    }
}