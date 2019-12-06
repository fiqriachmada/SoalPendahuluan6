package modul.pkg6;
import javax.swing.*;
public class Komponen07060 extends JFrame{
    JLabel label = new JLabel("LOGIN");
    JLabel nama = new JLabel("Username ");
    //JLabel nohp = new JLabel("No Hp ");
    JLabel paswd = new JLabel("password ");
    /*    JTextArea namaa = new JTextArea("nama");
    JTextArea nhp = new JTextArea("no hp");
    JTextArea psd = new JTextArea("password");*/
    /* JLabel beratkg = new JLabel("KG");
    JLabel bayar = new JLabel("BAYAR : ");*/
    JLabel alert = new JLabel();
    
    JTextField nm = new JTextField();
    //JTextField nomer = new JTextField();
    JTextField psw = new JTextField();
   // JButton insert = new JButton(" Insert ");
    //JTextField hasiltotal = new JTextField();
    //JTextField byr = new JTextField();
    JButton lgn = new JButton("Login");
    JButton ccl = new JButton("Cancel");
   
    JTextPane text = new JTextPane();
    //JTextPane text2 = new JTextPane();
    protected String pro="", metodee="",data="";
    protected int harga, Kembali=0, bay, o=0;
    Thread thread = Thread.currentThread();
    
    /* public void cekname(String nama){
    String namaa;
    namaa=nama;
    int kata;
    for (char c : namaa.toCharArray()){
    kata = c;
    if (!((kata>64 && kata<91) || (kata>96 && kata<123))){
    new exception("salah ");
    }
    }
    }*/
}
