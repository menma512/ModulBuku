package org.example;

public class Main {
    public static void main(String[] args)
    {
        Buku a = new Buku();
        Buku b = new Buku();
//        daftarbuku.setNilai("Algoritma", "ITTP", 25);
//        daftarbuku.cetakKeLayar();
        a = new Buku(" Siaga Merah "," Alistair Maclean ");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}