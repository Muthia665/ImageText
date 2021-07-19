package com.example.user.imagetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KelasSiswa ks = new KelasSiswa();
        ks.main();

    }
    public static String kelas = "10";



}
