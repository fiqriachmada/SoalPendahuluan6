package modul.pkg6;
import javax.swing.*;
public class Komponen07060 extends JFrame{
    JLabel label = new JLabel("PELANGGAN");
    JLabel nama = new JLabel("Nama  ");
    JLabel nohp = new JLabel("No Hp ");

    JTextArea namaa = new JTextArea(" Nama");
    JTextArea nhp = new JTextArea(" No hp");

    /* JLabel beratkg = new JLabel("KG");
    JLabel bayar = new JLabel("BAYAR : ");
    JLabel alert = new JLabel();*/
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();

    JButton insert = new JButton(" Insert ");
    //JTextField hasiltotal = new JTextField();
    //JTextField byr = new JTextField();
    JButton update = new JButton("Update");
    JButton delete = new JButton("Delete");
   
    JTextPane text = new JTextPane();
    //JTextPane text2 = new JTextPane();
    protected String pro="", metodee="",data="";
    protected int harga, Kembali=0, bay, o=0;
    Thread thread = Thread.currentThread();
    /*    public void proses(){
    harga = Integer.parseInt(br.getText()) * 15000;
    }*/
}
