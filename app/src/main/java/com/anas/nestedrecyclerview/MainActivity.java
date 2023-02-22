package com.anas.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView vRV;
    ArrayList<model_outer> arrOuter = new ArrayList<>();
    Adapter_Outer adapter_outer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRV=findViewById(R.id.vRV);
        vRV.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<model_inner> arrNest1 = new ArrayList<>();
        ArrayList<model_inner> arrNest2 = new ArrayList<>();
        ArrayList<model_inner> arrNest3 = new ArrayList<>();
        ArrayList<model_inner> arrNest4 = new ArrayList<>();
        ArrayList<model_inner> arrNest5 = new ArrayList<>();
        ArrayList<model_inner> arrNest6 = new ArrayList<>();

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

        arrNest4.add(new model_inner("Anas","290"));
        arrNest4.add(new model_inner("Shruti","290"));
        arrNest4.add(new model_inner("Anas","290"));
        arrNest4.add(new model_inner("Anas","290"));
        arrNest4.add(new model_inner("Anas","290"));

        arrNest5.add(new model_inner("Anas","290"));
        arrNest5.add(new model_inner("Anas","290"));
        arrNest5.add(new model_inner("Shruti","290"));
        arrNest5.add(new model_inner("Anas","290"));
        arrNest5.add(new model_inner("Anas","290"));

        arrNest6.add(new model_inner("Anas","290"));
        arrNest6.add(new model_inner("Anas","290"));
        arrNest6.add(new model_inner("Anas","290"));
        arrNest6.add(new model_inner("Shruti","290"));
        arrNest6.add(new model_inner("Anas","290"));


        arrOuter.add(new model_outer(arrNest1,"NAME1"));
        arrOuter.add(new model_outer(arrNest2,"NAME2"));
        arrOuter.add(new model_outer(arrNest3,"NAME3"));
        arrOuter.add(new model_outer(arrNest4,"NAME4"));
        arrOuter.add(new model_outer(arrNest5,"NAME5"));
        arrOuter.add(new model_outer(arrNest6,"NAME6"));





        adapter_outer = new Adapter_Outer(arrOuter);
        vRV.setAdapter(adapter_outer);

    }
}