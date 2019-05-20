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
import java.util.List;

public class MainActivity extends AppCompatActivity {
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
           switch (position)
           {
               case 0:{
                   Intent intent = new Intent(MainActivity.this, information.class);
                   intent.putExtra("infa", getResources().getString(R.string.atlanta));
                   startActivity(intent);
                   break;
               }
               case 1:{
                   Intent intent = new Intent(MainActivity.this, information.class);
                   intent.putExtra("infa", getResources().getString(R.string.france));
                   startActivity(intent);
                   break;
               }
               case 2:{
                   Intent intent = new Intent(MainActivity.this, information.class);
                   intent.putExtra("infa", getResources().getString(R.string.uzbek ));
                   startActivity(intent);
                   break;
               }
           }
       }
   });





    }




    private List<FlagModel> initData()
    {
        List<FlagModel> flagModels = new ArrayList<FlagModel>();
        flagModels.add(new FlagModel(1,"Drevniy Ukopia",getResources().getDrawable(R.drawable.atnanta)));
        flagModels.add(new FlagModel(2,"White Flag",getResources().getDrawable(R.drawable.france)));
        flagModels.add(new FlagModel(3,"Plyxe",getResources().getDrawable(R.drawable.uzbek)));
        return flagModels;
    }




}
