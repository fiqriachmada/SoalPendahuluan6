package modul.pkg6;
import javax.swing.*;
public class Komponen07060 extends JFrame{
    JLabel label = new JLabel("----LAUNDRY---");
    JLabel nama = new JLabel("Nama Pelanggan  ");
    JLabel nohp = new JLabel("Nomor Hp  ");
    JLabel berat = new JLabel("Berat cucian ");
    JLabel beratkg = new JLabel("KG");
    JLabel bayar = new JLabel("BAYAR ");
    JLabel alert = new JLabel();
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextField br = new JTextField();
    JButton total = new JButton(" TOTAL ");
    JTextField hasiltotal = new JTextField();
    JTextField byr = new JTextField();
    JButton cetak = new JButton("CETAK");
    JButton c = new JButton("C");
    
    JTextPane text = new JTextPane();
    JTextPane text2 = new JTextPane();
    protected String pro="", metodee="",data="";
    protected int harga, Kembali=0, bay, o=0;
    Thread thread = Thread.currentThread();
    public void proses(){
        harga = Integer.parseInt(br.getText()) * 15000;
    }
}
