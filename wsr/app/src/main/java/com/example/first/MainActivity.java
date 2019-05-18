package com.example.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<FlagModel> flagModels = new ArrayList<FlagModel>();
private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listv);


        FlagAdapter adapter = new  FlagAdapter(this,initData());
        lv.setAdapter(adapter);



   lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           //Object listitem = lv.getItemAtPosition(position);


                   Intent intent = new Intent(MainActivity.this, information.class);
                    FlagModel a = flagModels.get(position);
                   intent.putExtra("infa", a.getName().toString());
                   startActivity(intent);


       }
   });





    }




    private List<FlagModel> initData()
    {
        Date date = new Date();
        date.getDate();

        flagModels.add(new FlagModel(1,"Drevniy Ukopia",getResources().getDrawable(R.drawable.atnanta),date));
        flagModels.add(new FlagModel(2,"White Flag",getResources().getDrawable(R.drawable.france),date));
        flagModels.add(new FlagModel(3,"Plyxe",getResources().getDrawable(R.drawable.uzbek),date));
        return flagModels;
    }




}
