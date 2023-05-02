package com.anas.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView vRV;
    ArrayList<model_outer> arrOuter = new ArrayList<>();
    Adapter_Outer adapter_outer;

    ArrayList<model_inner> arrNest1 = new ArrayList<>();
    ArrayList<model_inner> arrNest2 = new ArrayList<>();
    ArrayList<model_inner> arrNest3 = new ArrayList<>();
    ArrayList<model_inner> arrNestnew = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRV=findViewById(R.id.vRV);
        vRV.setLayoutManager(new LinearLayoutManager(this));


        arrNest1.add(new model_inner("Anas","290"));
        arrNest1.add(new model_inner("Anas","290"));
        arrNest1.add(new model_inner("Anas","290"));
        arrNest1.add(new model_inner("Anas","290"));
        arrNest1.add(new model_inner("Shruti","290"));

        arrNest2.add(new model_inner("Anas","290"));
        arrNest2.add(new model_inner("Anas","290"));
        arrNest2.add(new model_inner("Anas","290"));
        arrNest2.add(new model_inner("Shruti","290"));
        arrNest2.add(new model_inner("Anas","290"));

        arrNest3.add(new model_inner("Anas","290"));
        arrNest3.add(new model_inner("Anas","290"));
        arrNest3.add(new model_inner("Anas","290"));
        arrNest3.add(new model_inner("Shruti","290"));
        arrNest3.add(new model_inner("Anas","290"));




        arrOuter.add(new model_outer(arrNest1,"NAME1"));
        arrOuter.add(new model_outer(arrNest2,"NAME2"));
        arrOuter.add(new model_outer(arrNest3,"NAME3"));





        adapter_outer = new Adapter_Outer(arrOuter);
        vRV.setAdapter(adapter_outer);

        findViewById(R.id.fbtn).setOnClickListener(v -> {
            add_section();
        });
    }

    private void add_section() {
        Dialog dialogCreate=new Dialog(MainActivity.this);
        dialogCreate.setContentView(R.layout.add_section);

        EditText eSec,eSub1,eSub2,eSub3;
        Button btnAction;
        eSec=dialogCreate.findViewById(R.id.eSec);
        eSub1=dialogCreate.findViewById(R.id.eSub1);
        eSub2=dialogCreate.findViewById(R.id.eSub2);
        eSub3=dialogCreate.findViewById(R.id.eSub3);
        btnAction=dialogCreate.findViewById(R.id.btnAction);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sec="";
                String sub1="";
                String sub2="";
                String sub3="";

                if (eSec.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Enter Sec",Toast.LENGTH_SHORT).show();
                }
                else {
                    sec=eSec.getText().toString();
                }

                sub1=eSub1.getText().toString();
                sub2=eSub2.getText().toString();
                sub3=eSub3.getText().toString();

                arrNestnew.add(new model_inner(sub1,"400"));
                arrNestnew.add(new model_inner(sub2,"400"));
                arrNestnew.add(new model_inner(sub3,"400"));
                arrOuter.add(new model_outer(arrNestnew,sec));
                adapter_outer.notifyItemInserted(arrOuter.size()-1);
                vRV.scrollToPosition(arrOuter.size()-1);

//                save();
                dialogCreate.dismiss();
            }
        });
        dialogCreate.show();
    }
}