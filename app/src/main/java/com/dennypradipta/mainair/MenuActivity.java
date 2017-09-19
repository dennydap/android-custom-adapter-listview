package com.dennypradipta.mainair;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

////////////////////////////////////////////
//             Menu Activity              //
//  Berisikan kodingan untuk Menu Utama   //
//              Version 1.0               //
//            Denny Pradipta              //
////////////////////////////////////////////


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Deklarasi data gambar, nama tempat, alamat, dan harga
        // Sesuai dengan parameter dari TempatModel
        final TempatModel data_tempat[] = new TempatModel[]
                {
                        new TempatModel(R.drawable.pik,"Waterbom Jakarta",
                                "Pantai Indah Kapuk, Jl. Pantai Indah Barat No.1, RT.7/RW.2, Kamal Muara, Penjaringan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14470",
                                "Weekdays\nIDR 100.000/Anak - IDR 170.000/Dewasa\n" +
                                        "Weekend\nIDR 200.000/Anak - IDR 270.000/Dewasa"),
                        new TempatModel(R.drawable.pim,"Pondok Indah Waterpark",
                                "Pondok Indah Mall, Jalan Metro Pondok Indah, Pondok Pinang, Kebayoran Lama, RT.1/RW.16, Kota Jakarta Selatan, 12310",
                                "Weekdays\nIDR 100.000\n" +
                                        "Weekend\nIDR 150.000"),
                        new TempatModel(R.drawable.snow,"Snow Bay Waterpark",
                                "Komplek Taman Mini Indonesia Indah, kel : Ceger, kec : Cipayung, Jl. Taman Mini Indonesia Indah, Jakarta Timur, DKI Jakarta 13820",
                                "Weekdays\nIDR 140.000\n" +
                                        "Weekend\nIDR 180.000"),
                        new TempatModel(R.drawable.palm,"Palm Bay Waterpark",
                                "Palem Paradise, Taman Surya V Blok PP No. 1, Kalideres, RT.8/RW.2, Pegadungan, Kalideres, Jakarta, Daerah Khusus Ibukota Jakarta 11830",
                                "Weekdays\nIDR 40.000/Anak - IDR 50.000/Dewasa\n" +
                                        "Weekend\nIDR 45.000/Anak - IDR 60.000/Dewasa"),
                        new TempatModel(R.drawable.ancol,"Atlantis Waterpark",
                                "Taman Impian Jaya Ancol, Jl. Lodan Timur No. 7, Ancol, Pademangan, RW.10, Ancol, Pademangan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14430",
                                "Weekdays\nIDR 170.000\n" +
                                        "Weekend\nIDR 170.000"),
                        new TempatModel(R.drawable.cx,"CX Waterpark",
                                "Jalan Centex No. 88, Ciracas, RT.9/RW.10, Ciracas, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13740",
                                "Weekdays\nIDR 25.000\n" +
                                        "Weekend\nIDR 35.000")
                };


        // Deklarasi Adapter untuk ListView
        ModelAdapter adapter = new ModelAdapter(this,
                R.layout.list_item, data_tempat);

        // Deklarasi komponen ListView 
        // Serta memberi ListView adapter untuk menampilkan data
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
