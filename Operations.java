import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Operations implements ActionListener{
	private double numberAc = 0;
	private double acum = 0;
	private int aux = 1;
	private int op = 0;
	private JLabel label;
	Operations(JLabel label){
		this.label=label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("0")||cmd.equals("1")||cmd.equals("2")||cmd.equals("3")||cmd.equals("4")||cmd.equals("5")||cmd.equals("6")||cmd.equals("7")||cmd.equals("8")||cmd.equals("9")){
			numberAc=numberAc*aux+Double.parseDouble(cmd);
			aux=10;
			att();
		}else
		if(cmd.equals("C")){
			numberAc=0;
			acum=0;
			att();
		}else
		if(cmd.equals("ERASE")){
			numberAc=Math.floor(numberAc/10);
			att();
		}
		if(cmd.equals("ADD")){
			acum=numberAc;
			numberAc=0;
			op=1;			
		}else
		if(cmd.equals("DIV")){
			acum=numberAc;
			numberAc=0;
			op=2;
		}else
		if(cmd.equals("MULT")){
			acum=numberAc;
			numberAc=0;
			op=3;
		}else
		if(cmd.equals("MEN")){
			acum=numberAc;
			numberAc=0;
			op=4;
		}else
		if(cmd.equals("EQUALS")){
			if(op==1){
				numberAc=numberAc+acum;
				att();
			}else
			if(op==2){
				numberAc=acum/numberAc;
				att();
			}else
			if(op==3){
				numberAc=acum*numberAc;
				att();
			}else
			if(op==4){
				numberAc=acum-numberAc;
				att();
			}
		}
	}
		
		
	
	void att(){
		label.setText(Double.toString(numberAc));
	}
}
