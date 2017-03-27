package com.example.rodrigo.android_table_dynamic_example;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rodrigo on 17/03/17.
 */

public class Main_activity_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<Person> personArrayList;
    private Context context;

    public Main_activity_adapter(Context context, ArrayList<Person> personArrayList) {
        this.context = context;
        this.personArrayList = personArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_rows,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,int position) {
        final Person person= personArrayList.get(position);
        ((MyViewHolder)holder).checkboxName.setEnabled(true);
        ((MyViewHolder)holder).textViewName.setText(person.getName());
        ((MyViewHolder)holder).textViewDni.setText(person.getDni());

        ((MyViewHolder)holder).checkboxName.setOnCheckedChangeListener(null);
        ((MyViewHolder)holder).checkboxName.setChecked(person.isCheckBox());
        Log.i("information",""+person.isCheckBox());
        ((MyViewHolder)holder).checkboxName.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                person.setCheckBox(isChecked);
            }
        });
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private CheckBox checkboxName;
        private TextView textViewName;
        private TextView textViewDni;

        public MyViewHolder(View itemView) {
            super(itemView);
            checkboxName=(CheckBox) itemView.findViewById(R.id.checkboxName);
            textViewName=(TextView) itemView.findViewById(R.id.textViewName);
            textViewDni=(TextView) itemView.findViewById(R.id.textViewDni);

            checkboxName.setOnClickListener(this);
            textViewName.setOnClickListener(this);
            textViewDni.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.checkboxName:
                    Toast.makeText(v.getContext(), "checkbox", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.textViewName:
                    Toast.makeText(v.getContext(), textViewName.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.textViewDni:
                    Toast.makeText(v.getContext(), textViewDni.getText().toString(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}
