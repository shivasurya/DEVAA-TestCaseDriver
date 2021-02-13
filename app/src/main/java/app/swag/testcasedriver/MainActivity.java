package app.swag.testcasedriver;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import app.swag.testcasedriver.contentprovider.ContentProvierDriver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        new ContentProvierDriver().run(getApplicationContext(), intent.getStringExtra("uri1"));
    }
}