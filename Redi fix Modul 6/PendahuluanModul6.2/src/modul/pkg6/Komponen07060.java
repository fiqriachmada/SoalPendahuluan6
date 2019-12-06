package modul.pkg6;
import javax.swing.*;
public class Komponen07060 extends JFrame{
    JLabel label = new JLabel("PEGAWAI");
    JLabel nama = new JLabel("Nama  ");
    JLabel nohp = new JLabel("No Hp ");
    JLabel paswd = new JLabel("password ");
    JTextArea namaa = new JTextArea("nama");
    JTextArea nhp = new JTextArea("no hp");
    JTextArea psd = new JTextArea("password");
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextField br = new JTextField();
    JButton insert = new JButton(" Insert ");
    JButton update = new JButton("Update");
    JButton delete = new JButton("Delete");
   
    JTextPane text = new JTextPane();
    protected String pro="", metodee="",data="";
    protected int harga, Kembali=0, bay, o=0;
    Thread thread = Thread.currentThread();
    public void proses(){
        harga = Integer.parseInt(br.getText()) * 15000;
    }
}
