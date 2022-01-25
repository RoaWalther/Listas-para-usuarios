package com.example.walter.mylistviewwalther;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView vt1;
    private ListView lt1;

    private  String nombres []= {"Walther Roa","Yeison Sanchez","Pablo Rodriguez","Camilo Paez"
                      ,"Daniel Calderon","Nathalia Sanchez","Andrea Villabona","Ferney Mejia","maria","pantano","camisa","agua"};
    private String años  [] = {"27","18","20","21","21","18","25","22","5","6","7","8"};
    private String sexo []= {"M","M","M","M","M","F","F","M","12","12","12","12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vt1= (TextView) findViewById(R.id.tv1);
        lt1= (ListView)findViewById(R.id.lv1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.listview_walther_item,nombres);
        lt1.setAdapter(adapter);

        lt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                vt1.setText("Nombre: "+ lt1.getItemAtPosition(i) + "\n" + "tiene: " +
                            " " +  años[i] + " años" + " \n" + "De sexo: "+ sexo[i]);
            }
       });

    }
}
