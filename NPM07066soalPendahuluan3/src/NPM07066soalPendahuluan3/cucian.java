package NPM07066soalPendahuluan3;

public class cucian {
    pegawai pegawai;
    pelanggan pelanggan;
    float berat;
    float hargaTotal;

    void setPegawai(pegawai pegawai) {
        this.pegawai = pegawai;
    }

    pegawai getPegawai() {
        return pegawai;
    }

    void setPelanggan(pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    pelanggan getPelanggan() {
        return pelanggan;
    }

    void setBerat(float berat) {
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat() * perKilo;
    }

    float getBerat() {
        return berat;
    }

    float getHargaTotal() {
        return hargaTotal;
    }

}
