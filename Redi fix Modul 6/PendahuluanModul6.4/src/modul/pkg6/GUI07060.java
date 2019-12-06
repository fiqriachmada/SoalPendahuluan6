package modul.pkg6;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
public class GUI07060 extends Komponen07060 {
    public GUI07060(){
        label.setBounds(115, 30, 500, 40);
        label.setFont(new Font("Consolas", Font.BOLD,30));
        label.setForeground(new Color(20, 1, 188));
        nama.setBounds(20, 100, 200, 30);
        nama.setFont(new Font("Consolas", Font.BOLD,17));
        /*        nohp.setBounds(20, 150, 200, 30);
        nohp.setFont(new Font("Consolas", Font.BOLD,17));*/
        paswd.setBounds(20, 150, 200, 30);
        paswd.setFont(new Font("Consolas", Font.BOLD,17));

        

        /* beratkg.setBounds(270, 200, 50, 30);
        beratkg.setFont(new Font("Consolas", Font.BOLD,17));*/
        
        /*total.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{
        proses();
        
        hasiltotal.setText(String.valueOf(harga));
        thread.sleep(1000);
        }catch(Exception ex){
        
        }
        }
        }); */   
        /*        bayar.setBounds(20, 300, 200, 30);
        bayar.setFont(new Font("Consolas", Font.BOLD,17));
        bayar.setForeground(new Color(20, 1 ,188));*/
        nm.setBounds(200, 100, 230, 25);
        nm.setFont(new Font("Consolas", Font.BOLD,17));
        /*nomer.setBounds(200, 150, 230, 25);
        nomer.setFont(new Font("Consolas", Font.BOLD,17));*/
        psw.setBounds(200, 150, 230, 25);
        psw.setFont(new Font("Consolas", Font.BOLD,17));
        /*        hasiltotal.setBounds(200, 250, 230, 25);
        hasiltotal.setFont(new Font("Consolas", Font.BOLD,17));
        byr.setBounds(200, 300, 230, 25);
        byr.setFont(new Font("Consolas", Font.BOLD,17));
        byr.setForeground(Color.red);*/
        alert.setBounds(20, 225, 400, 25);
        alert.setFont(new Font("Consolas", Font.BOLD,13));
        alert.setForeground(Color.red);
        
        lgn.setBounds(155, 200, 135, 25);
        lgn.setBackground(new Color(68, 255, 71));
        lgn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){

                try{
                    CheckError(nm.getText());
                    //o++;
                    //data+=nm.getText()+" \t"+nohp.getText()+"\t"+br.getText()+" kg >> Rp."+harga+"\n";
                    //text.setText(data);
                    
                }catch(Exception ex){
                        errore();
                        }
                try{
                    CheckError(psw.getText());
                }catch(Exception ex){
                    eror();
                }
    
}
    });
        ccl.setBounds(300, 200, 125, 25);
        ccl.setBackground(Color.red);
        ccl.setForeground(Color.WHITE);
        ccl.setFont(new Font("Consolas", Font.BOLD,17));
        ccl.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            nm.setText("");
          //  nomer.setText("");
          //  hasiltotal.setText("");
            psw.setText("");
            text.setText("");
            alert.setText("");
        }
});
        /*text.setBounds(20, 320,400,150);
        text.setFont(new Font("Consolas", Font.BOLD,15)); */
        /*namaa.setBounds(20, 300, 120, 30);
        namaa.setFont(new Font("Consolas", Font.BOLD,17));
        namaa.setBackground(Color.GRAY);
        namaa.setForeground(Color.white);
        nhp.setBounds(150, 300, 120, 30);
        nhp.setFont(new Font("Consolas", Font.BOLD,17));
        nhp.setBackground(Color.GRAY);
        nhp.setForeground(Color.white);
        psd.setBounds(290, 300, 120, 30);
        psd.setFont(new Font("Consolas", Font.BOLD,17));
        psd.setBackground(Color.GRAY);
        psd.setForeground(Color.white);*/
       // text2.setBounds(450, 100,440,130);
       // text2.setFont(new Font("Consolas", Font.BOLD,14));
        
        add(label);
        add(nama);
       // add(nohp);
        add(paswd);
        add(psw);
        add(nm);
        add(alert);
       // add(br);
       // add(insert);
       // add(psd);
       // add(nhp);
      //  add(byr);
      //  add(alert);
        add(lgn);
        add(ccl);
        add(text);
        //add(text2);
        setTitle("Laundry");
        setSize(465, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        private void reset(){
            o+=0;
        }
        /*   private void errore(){
        alert.setText("Bayar Kurang Rp. " + (harga - bay));
        }*/
        private void errore(){
        alert.setText("nama tidak boleh mengandung angka dan simbol");
    }
        private void eror(){
        alert.setText("password kurang dari 6 karakter");
    }
        
        private void CheckError(String nama) throws IOException{
        char kata;
        for (char c : nama.toCharArray()){
        kata = c;
            if (!((kata>64 && kata<91) || (kata>96 && kata<123))){
        throw new IOException();
      }   
    }
}
}