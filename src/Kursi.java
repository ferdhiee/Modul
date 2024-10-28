class Kursi {
    private String nomor;
    private boolean terisi;

    public Kursi(String nomor) {
        this.nomor = nomor;
        this.terisi = false;
    }

    public String getNomor() {
        return nomor;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "Kursi " + nomor + (terisi ? " (Terisi)" : " (Kosong)");
    }
}
