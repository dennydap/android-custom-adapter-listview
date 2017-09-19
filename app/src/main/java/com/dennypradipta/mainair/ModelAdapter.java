package com.dennypradipta.mainair;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

////////////////////////////////////////////
//             Model Adapter              //
//      Adapter Custom untuk ListView     //
//              Version 1.0               //
//            Denny Pradipta              //
////////////////////////////////////////////

public class ModelAdapter extends ArrayAdapter<TempatModel>{
    Context context;
    int layoutResourceId;
    TempatModel data[] = null;

    // Constructor ModelAdaptor
    public ModelAdapter(Context context, int layoutResourceId, TempatModel[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    // Method untuk membuat layout pada ListView
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        TempatHolder holder = null;

        // Jika tidak ada View...
        if(row == null)
        {
            // View dibuat terlebih dahulu
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            // Deklarasi komponen-komponen yang ada di View
            holder = new TempatHolder();
            holder.gambar = (ImageView) row.findViewById(R.id.gambar);
            holder.nama = (TextView)row.findViewById(R.id.namaTempat);
            holder.alamat = (TextView)row.findViewById(R.id.alamatTempat);
            holder.htm = (TextView)row.findViewById(R.id.htmTempat);
            holder.navigasi = (Button)row.findViewById(R.id.navigasi);

            // Memberi tag pada View
            row.setTag(holder);
        }
        else
        {
            // Jika ada, cukup ambil tag-nya saja
            holder = (TempatHolder)row.getTag();
        }

        // Mengisi nilai-nilai komponen
        // Seperti gambar, nama, alamat, dan lain-lain
        final TempatModel tempat = data[position];
        holder.gambar.setImageResource(tempat.gambar);
        holder.gambar.setScaleType(ImageView.ScaleType.FIT_XY);
        holder.nama.setText(tempat.nama);
        holder.alamat.setText(tempat.alamat);
        holder.htm.setText(tempat.htm);

        // Memberi aksi untuk tombol navigasi
        holder.navigasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jika di klik, maka akan muncul aplikasi untuk memulai Navigasi
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + tempat.nama.replaceAll(" ","+"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                context.startActivity(mapIntent);
            }
        });
        return row;
    }

    // Class untuk komponen-komponen untuk variabel row
    static class TempatHolder
    {
        ImageView gambar;
        TextView nama, alamat, htm;
        Button navigasi;
    }
}
