package com.example.valkyrie.modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> namaList;
    private ArrayList<String> hargaList;
    private ArrayList<String> keteranganList;
    private ArrayList<Integer> imageList;
    //Daftar makanan
    private String[] Makanan = {"Bebek Bakar", "Bebek Goreng", "Ayam Goreng", "Ayam Bakar", "Es Teh", "Es Jeruk"};
    //Daftar Harga
    private String[] Harga = {"Rp.17000","Rp.18000","Rp.14000","Rp.15000","Rp.3000", "Rp.5000"};
    private String[] Keterangan = {"Bebek bakar dengan rasa rempah rempah pilihan","Bebek goreng dengan rasa rempah rempah pilihan","Ayam bakar dengan rasa rempah rempah pilihan", "Ayam goreng dengan rasa rempah rempah pilihan","Es teh rasa kasih sayang keluarga", "Es jeruk segarnya edan"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.bebek2, R.drawable.bebek3, R.drawable.ayam1, R.drawable.ayam2, R.drawable.minum1, R.drawable.minum2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        namaList = new ArrayList<>();
        hargaList = new ArrayList<>();
        keteranganList = new ArrayList<>();
        imageList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(namaList, hargaList, keteranganList, imageList);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Makanan.length; w++){
            namaList.add(Makanan[w]);
            hargaList.add(Harga[w]);
            keteranganList.add(Keterangan[w]);
            imageList.add(Gambar[w]);
        }
    }
}

