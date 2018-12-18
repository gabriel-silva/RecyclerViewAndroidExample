package com.example.gabriel.recyclerviewandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gabriel.recyclerviewandroidexample.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //use essa configuração para melhorar o desempenho se você souber que
        //as alterações no conteúdo não alteram o tamanho do layout do RecyclerView.
        mRecyclerView.setHasFixedSize(true);

        //criar layoutManager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //instancia com MyAdapter com array de nomes
        mAdapter = new MyAdapter(new String[]{
                "Gabriel", "Vinicius",
                "Luiz", "José",
                "Rafael", "Carlos",
                "Leonardo", "Fernando",
                "Artur", "Sabrina",
                "Fabiola", "Luiza",
                "Maria", "Mariana",
                "Vitória", "Fabiana"
        });
        //setAdapter com o mAdapter
        mRecyclerView.setAdapter(mAdapter);
    }
}
