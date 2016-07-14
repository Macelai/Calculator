import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

import javax.swing.JLabel;

public class Operations implements ActionListener{
    private double numberAc = 0;
    private double acum = 0;
    private int aux = 1;
    private int aux1 = 10;
    private int op = 0;
    private boolean ponto = false;
    private JLabel label, memo;
    private File file;
    Operations(JLabel label, JLabel memo, File file){
        this.label=label;
        this.memo=memo;
        this.file=file;
    }
    Memory memory = new Memory();

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("PON")) {
            aux1=10;
            ponto=true;
        }else
        if (cmd.equals("SAVE")){
            file.filesave(memo.getText());
        }else
        if (cmd.equals("INV")) {
            numberAc=-numberAc;
            att();
        }
        if (cmd.equals("MS")) {
            memory.ms(numberAc);
        }else
        if (cmd.equals("MR")) {
            numberAc=memory.mr();
            att();
        }else
        if (cmd.equals("MC")){
            memory.mc();
        }else
        if (cmd.equals("M+")) {
            memory.mplus(numberAc);
        }else
        if(cmd.equals("0")||cmd.equals("1")||cmd.equals("2")||cmd.equals("3")||cmd.equals("4")||cmd.equals("5")||cmd.equals("6")||cmd.equals("7")||cmd.equals("8")||cmd.equals("9")){
            if (ponto) {
                numberAc=numberAc+Double.parseDouble(cmd)/aux1;
                aux1=aux1*10;
                att();
            }else
                numberAc=numberAc*aux+Double.parseDouble(cmd);
            aux=10;
            att();
        }else
        if(cmd.equals("C")){
            memo.setText("0+0");
            numberAc=0;
            acum=0;
            ponto=false;
            att();
        }else
        if(cmd.equals("ERASE")){
            if (ponto) {
                numberAc=Math.floor(numberAc);
                aux1=10;
            }else
                numberAc=Math.floor(numberAc/10);
            att();
        }
        if(cmd.equals("ADD")){
            acum=numberAc;
            numberAc=0;
            op=1;
            ponto=false;
        }else
        if(cmd.equals("DIV")){
            acum=numberAc;
            numberAc=0;
            op=2;
            ponto=false;
        }else
        if(cmd.equals("MULT")){
            acum=numberAc;
            numberAc=0;
            op=3;
            ponto=false;
        }else
        if(cmd.equals("MEN")){
            acum=numberAc;
            numberAc=0;
            op=4;
            ponto=false;
        }else
        if(cmd.equals("EQUALS")){
            if(op==1){
                memo.setText(Double.toString(acum)+"+"+Double.toString(numberAc)+"="+Double.toString(numberAc+acum));
                numberAc=numberAc+acum;
                att();
            }else
            if(op==2){
                memo.setText(Double.toString(acum)+"/"+Double.toString(numberAc)+"="+Double.toString(numberAc/acum));
                numberAc=acum/numberAc;
                att();
            }else
            if(op==3){
                memo.setText(Double.toString(acum)+"*"+Double.toString(numberAc)+"="+Double.toString(numberAc*acum));
                numberAc=acum*numberAc;
                att();
            }else
            if(op==4){
                memo.setText(Double.toString(acum)+"-"+Double.toString(numberAc)+"="+Double.toString(numberAc-acum));
                numberAc=acum-numberAc;
                att();
            }
            ponto=false;
        }
    }



    void att(){
        label.setText(Double.toString(numberAc));
    }
}
