package com.example.rodrigo.android_table_dynamic_example;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Main_activity_adapter main_activity_adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.listDates);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        ArrayList<Person> personArrayList= new ArrayList<Person>();

        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));
        personArrayList.add(new Person("721041666","gerardo jimenez dfwfcwfdede efcfefeffrr"));

        main_activity_adapter= new Main_activity_adapter(getApplicationContext(),personArrayList);
        recyclerView.setAdapter(main_activity_adapter);



    }
}
