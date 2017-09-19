package com.dennypradipta.mainair;

////////////////////////////////////////////
//              Tempat Model              //
//       Model untuk menampung data       //
//              Version 1.0               //
//            Denny Pradipta              //
////////////////////////////////////////////

public class TempatModel {
    public int gambar;
    public String nama, alamat, htm;

    public TempatModel(int gambar, String nama, String alamat, String htm) {
        this.gambar = gambar;
        this.nama = nama;
        this.alamat = alamat;
        this.htm = htm;
    }

    public int getGambar() {return gambar;}
    public void setGambar(int gambar) {this.gambar = gambar;}
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
    public String getAlamat() {return alamat;}
    public void setAlamat(String alamat) {this.alamat = alamat;}
    public String getHtm() {return htm;}
    public void setHtm(String htm) {this.htm = htm;}
}
