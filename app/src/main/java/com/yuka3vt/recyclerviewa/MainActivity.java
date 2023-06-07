package com.yuka3vt.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Indonesia");
        nm.setDeskripsi("Indonesia adalah negara kepulauan terbesar di dunia, terletak di Asia Tenggara. Negara ini terdiri dari lebih dari 17.000 pulau, dengan lima pulau utama yaitu Sumatra, Jawa, Kalimantan, Sulawesi, dan Papua. Luas wilayah Indonesia mencapai sekitar 1,9 juta kilometer persegi.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/2000px-Flag_of_Indonesia.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Albania adalah sebuah negara di Eropa Tenggara yang berbatasan dengan Montenegro di sebelah utara, Serbia di timur laut, Makedonia Utara di timur, Yunani di selatan, dan Laut Adriatik di barat. Negara ini memiliki luas wilayah sekitar 28.748 kilometer persegi.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/210px-Flag_of_Albania.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDeskripsi("Hungary, juga dikenal sebagai Republik Hungaria, adalah sebuah negara di Eropa Tengah. Negara ini berbatasan dengan Austria di barat laut, Slovakia di utara, Ukraina di timur laut, Rumania di timur daya, Serbia di selatan, Kroasia di barat daya, dan Slovenia di barat daya. Hungary memiliki luas wilayah sekitar 93.030 kilometer persegi.");
        nm.setUrl("https://1.bp.blogspot.com/-s1TGxmdNbt4/Xt3tOREsrYI/AAAAAAAAIw8/SAK1TwIF3RU3jHa8rUyurc0AeVSOWcAGQCPcBGAYYCw/s400/hun_flg_idezia.com.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDeskripsi("Slovenia adalah sebuah negara kecil yang terletak di Eropa Tengah. Negara ini berbatasan dengan Italia di barat, Austria di utara, Hungaria di timur laut, dan Kroasia di selatan. Slovenia memiliki luas wilayah sekitar 20.273 kilometer persegi.");
        nm.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Flag_of_Slovenia.svg/480px-Flag_of_Slovenia.svg.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDeskripsi("Belgium adalah sebuah negara kecil yang terletak di Eropa Barat. Negara ini berbatasan dengan Prancis di sebelah barat, Belanda di sebelah utara, Jerman di timur, dan Luksemburg di timur laut. Belgium memiliki luas wilayah sekitar 30.528 kilometer persegi.");
        nm.setUrl("https://1.bp.blogspot.com/-DLr5ddSAKFs/Xtn_3HxWbPI/AAAAAAAAIiE/OWitOMWXOTMCnI2aqz7hMbUP7Q-jjLbkACLcBGAsYHQ/s800/bel_flg_idezia.com.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Canada adalah negara terbesar di Amerika Utara dan terletak di sebelah utara Amerika Serikat. Negara ini memiliki luas wilayah sekitar 9,98 juta kilometer persegi, menjadikannya negara dengan wilayah terluas kedua di dunia setelah Rusia.");
        nm.setUrl("https://cdn.pixabay.com/photo/2020/02/24/01/45/canada-4875004_960_720.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(),negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}